package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/easyshop";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "";

    public List<Product> fetchAllProducts() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Product product = new Product();
                product.setProductId(resultSet.getInt("product_id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategoryId(resultSet.getInt("category_id"));
                product.setDescription(resultSet.getString("description"));
                product.setColor(resultSet.getString("color"));
                product.setStock(resultSet.getInt("stock"));
                product.setFeatured(resultSet.getBoolean("featured"));
                product.setImageUrl(resultSet.getString("image_url"));

                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        List<Product> products = productService.fetchAllProducts();
        products.forEach(System.out::println);
    }
}

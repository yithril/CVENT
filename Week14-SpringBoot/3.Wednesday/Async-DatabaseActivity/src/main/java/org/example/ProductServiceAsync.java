package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ProductServiceAsync {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/easyshop";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "";


//    public static void main(String[] args) {
//        ProductServiceAsync productServiceAsync = new ProductServiceAsync();
//        CompletableFuture<List<Product>> productsFuture = productServiceAsync.fetchAllProductsAsync();
//
//        productsFuture.thenAccept(products -> {
//            products.forEach(System.out::println);
//        }).join(); // Join to wait for the result (for testing purposes)
//    }
}

package com.example.jdbc_demo.repositories;

import com.example.jdbc_demo.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private DataSource dataSource;

    //get all categories
    public List<Category> getAllCategories(){
        String query = "SELECT * FROM categories";
        List<Category> categories = new ArrayList<>();

        //try-with
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                //grab the data from the columns
                categories.add(mapRowToCategory(rs));
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return categories;
    }

    public Optional<Category> getCategoryById(int id){
        String query = "SELECT * FROM categories WHERE categoryid = ?";

        try(Connection conn = dataSource.getConnection();
           PreparedStatement ps = conn.prepareStatement(query)){

            //replace the question mark with an actual value
            ps.setInt(1, id);

            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                     return Optional.of(mapRowToCategory(rs));
                }
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return Optional.empty();
    }

    public void deleteCategory(int id){
        String query = "DELETE FROM categories WHERE categoryid = ?";

        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)){

            ps.setInt(1, id);

            ps.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public int createCategory(Category category){
        String query = "INSERT INTO categories (categoryname, description) VALUES(?, ?) RETURNING categoryid";
        int generatedId = -1;

        try(Connection conn = dataSource.getConnection();
           PreparedStatement ps = conn.prepareStatement(query)){

            ps.setString(1, category.getCategoryName());
            ps.setString(2, category.getDescription());

            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    generatedId = rs.getInt(1);
                }
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return generatedId;
    }

    public void updateCategory(Category category){
        String query = "UPDATE categories SET categoryname = ?, description = ? WHERE categoryid = ?";

        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)){

            ps.setString(1, category.getCategoryName());
            ps.setString(2, category.getDescription());
            ps.setInt(3, category.getCategoryId());

            ps.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    private Category mapRowToCategory(ResultSet rs) throws SQLException {
        int categoryId = rs.getInt("categoryid");
        String categoryName = rs.getString("categoryname");
        String description = rs.getString("description");
        Category c = new Category(categoryId, categoryName, description);
        return c;
    }
}

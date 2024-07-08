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
        //write your sql query
        //open a connection to the database
        //we are going to prepare the query to be sent to SQL
        //we will execute the query and get back a result set
        //loop through each row in the result set
        //grab data column by column and put it into a new Java Object
        //put it in a list
        //at the end of the loop, return the list
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

    private Category mapRowToCategory(ResultSet rs) throws SQLException {
        int categoryId = rs.getInt("categoryid");
        String categoryName = rs.getString("categoryname");
        String description = rs.getString("description");
        Category c = new Category(categoryId, categoryName, description);
        return c;
    }
}

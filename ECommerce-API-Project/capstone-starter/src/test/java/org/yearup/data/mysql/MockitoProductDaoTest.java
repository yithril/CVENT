package org.yearup.data.mysql;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.yearup.models.Product;

import javax.sql.DataSource;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MockitoProductDaoTest {
    private DataSource dataSource;
    private MySqlProductDao dao;

    @BeforeEach
    public void setup() {
        dataSource = mock(DataSource.class);
        dao = new MySqlProductDao(dataSource);
    }

    @Test
    public void getById_shouldReturn_theCorrectProduct() throws SQLException {
        // arrange
        int productId = 1;
        Product expected = new Product() {{
            setProductId(1);
            setName("Smartphone");
            setPrice(new BigDecimal("499.99"));
            setCategoryId(1);
            setDescription("A powerful and feature-rich smartphone for all your communication needs.");
            setColor("Black");
            setStock(50);
            setFeatured(false);
            setImageUrl("smartphone.jpg");
        }};

        // Mock the ResultSet
        ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.next()).thenReturn(true);
        when(resultSet.getInt("productId")).thenReturn(expected.getProductId());
        when(resultSet.getString("name")).thenReturn(expected.getName());
        when(resultSet.getBigDecimal("price")).thenReturn(expected.getPrice());
        when(resultSet.getInt("categoryId")).thenReturn(expected.getCategoryId());
        when(resultSet.getString("description")).thenReturn(expected.getDescription());
        when(resultSet.getString("color")).thenReturn(expected.getColor());
        when(resultSet.getInt("stock")).thenReturn(expected.getStock());
        when(resultSet.getBoolean("featured")).thenReturn(expected.isFeatured());
        when(resultSet.getString("imageUrl")).thenReturn(expected.getImageUrl());

        // Mock the PreparedStatement
        PreparedStatement preparedStatement = mock(PreparedStatement.class);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);

        // Mock the Connection
        Connection connection = mock(Connection.class);
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(dataSource.getConnection()).thenReturn(connection);

        // act
        Product actual = dao.getById(productId);

        // assert
        assertEquals(expected, actual);

        // verify interactions
        verify(preparedStatement).setInt(1, productId);
        verify(preparedStatement).executeQuery();
        verify(resultSet).next();
    }
}

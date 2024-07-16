package com.example.health;

import com.codahale.metrics.health.HealthCheck;
import org.apache.ibatis.session.SqlSessionFactory;

public class DatabaseHealthCheck extends HealthCheck {
    private final SqlSessionFactory sqlSessionFactory;

    public DatabaseHealthCheck(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    protected Result check() throws Exception {
        try (org.apache.ibatis.session.SqlSession session = sqlSessionFactory.openSession()) {
            // Perform a simple query to check the database connection
            java.sql.Connection connection = session.getConnection();
            if (connection.isValid(1)) {
                return Result.healthy();
            } else {
                return Result.unhealthy("Cannot connect to the database");
            }
        } catch (Exception e) {
            return Result.unhealthy("Cannot connect to the database: " + e.getMessage());
        }
    }
}

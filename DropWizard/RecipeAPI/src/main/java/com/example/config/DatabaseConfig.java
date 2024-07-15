package com.example.config;

import com.example.RecipeAPIConfiguration;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


    public class DatabaseConfig {
        public static SqlSessionFactory setupDatabase(RecipeAPIConfiguration configuration) {
            PooledDataSource dataSource = new PooledDataSource();
            dataSource.setDriver("org.postgresql.Driver");
            dataSource.setUrl(configuration.getDatabaseUrl());
            dataSource.setUsername(configuration.getDatabaseUser());
            dataSource.setPassword(configuration.getDatabasePassword());

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(DatabaseConfig.class.getResourceAsStream("/mybatis-config.xml"));
            sqlSessionFactory.getConfiguration().setEnvironment(
                    new org.apache.ibatis.mapping.Environment("development",
                            new org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory(), dataSource));

            return sqlSessionFactory;
        }
    }


package com.example.config;

import com.example.RecipeAPIConfiguration;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;


public class DatabaseConfig {
        public static SqlSessionFactory build(RecipeAPIConfiguration configuration) {
            try {
                // Load MyBatis configuration from XML file
                InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                if (inputStream == null) {
                    System.err.println("Could not find mybatis-config.xml");
                    throw new RuntimeException("Could not find mybatis-config.xml");
                } else {
                    System.out.println("Successfully loaded mybatis-config.xml");
                }

                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

                // Configure the DataSource
                PooledDataSource dataSource = new PooledDataSource();
                dataSource.setDriver("org.postgresql.Driver");
                dataSource.setUrl(configuration.getDatabaseUrl());
                dataSource.setUsername(configuration.getDatabaseUser());
                dataSource.setPassword(configuration.getDatabasePassword());

                // Set the environment for MyBatis configuration
                sqlSessionFactory.getConfiguration().setEnvironment(
                        new org.apache.ibatis.mapping.Environment(
                                "development",
                                new org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory(),
                                dataSource
                        )
                );

                return sqlSessionFactory;
            } catch (Exception e) {
                throw new RuntimeException("Error building SqlSessionFactory", e);
            }
        }
    }


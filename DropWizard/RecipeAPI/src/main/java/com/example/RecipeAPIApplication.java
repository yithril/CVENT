package com.example;

import com.example.config.DatabaseConfig;
import com.example.health.DatabaseHealthCheck;
import com.example.resources.RecipeResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.ibatis.session.SqlSessionFactory;

public class RecipeAPIApplication extends Application<RecipeAPIConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RecipeAPIApplication().run(args);
    }

    @Override
    public String getName() {
        return "RecipeAPI";
    }

    @Override
    public void initialize(final Bootstrap<RecipeAPIConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RecipeAPIConfiguration configuration,
                    final Environment environment) {
        //setup database
        SqlSessionFactory sqlSessionFactory = DatabaseConfig.build(configuration);

        final RecipeResource recipeResource = new RecipeResource(sqlSessionFactory);
        environment.jersey().register(recipeResource);

        final DatabaseHealthCheck healthCheck = new DatabaseHealthCheck(sqlSessionFactory);
        environment.healthChecks().register("database", healthCheck);
    }

}

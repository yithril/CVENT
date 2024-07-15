package com.example;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class RecipeAPIConfiguration extends Configuration {
    @NotEmpty
    private String databaseUrl;

    @NotEmpty
    private String databasePassword;

    @NotEmpty
    private String databaseUser;

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    @JsonProperty
    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    @JsonProperty
    public String getDatabasePassword() {
        return databasePassword;
    }

    @JsonProperty
    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    @JsonProperty
    public String getDatabaseUser() {
        return databaseUser;
    }

    @JsonProperty
    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }
}

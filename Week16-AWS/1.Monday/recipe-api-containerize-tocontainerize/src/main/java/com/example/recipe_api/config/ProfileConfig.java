package com.example.recipe_api.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ProfileConfig {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @EventListener(ApplicationReadyEvent.class)
    public void logActiveProfile() {
        System.out.println("Active Profile: " + activeProfile);
    }
}
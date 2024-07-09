package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manufacturer {
    private final String name;

    @Autowired
    public Manufacturer(@Value("Default Manufacturer") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
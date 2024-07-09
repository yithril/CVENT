package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OilFilter {
    private final Manufacturer manufacturer;

    @Autowired
    public OilFilter(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void filter() {
        System.out.println("Filtering oil with " + manufacturer.getName() + " oil filter...");
    }
}

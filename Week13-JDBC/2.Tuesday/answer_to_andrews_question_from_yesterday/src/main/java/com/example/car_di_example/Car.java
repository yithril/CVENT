package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private final Engine engine;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        if (engine != null) {
            engine.start();
            System.out.println("Car is driving...");
        } else {
            System.out.println("No engine installed.");
        }
    }
}

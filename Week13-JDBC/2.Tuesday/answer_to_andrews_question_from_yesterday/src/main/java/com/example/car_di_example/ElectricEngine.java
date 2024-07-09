package com.example.car_di_example;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting electric engine...");
    }
}

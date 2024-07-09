package com.example.car_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {
    //The application context is basically the DI container you can grab stuff out of
    @Autowired
    private ApplicationContext context;

    public Car createCar(String engineType) {
        Engine engine;
        switch (engineType.toLowerCase()) {
            case "gas":
                engine = context.getBean("gasEngine", Engine.class);
                break;
            case "electric":
                engine = context.getBean("electricEngine", Engine.class);
                break;
            default:
                throw new IllegalArgumentException("Unknown engine type: " + engineType);
        }
        return new Car(engine);
    }
}

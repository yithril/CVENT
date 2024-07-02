package org.example;

public class Moped extends Vehicle {
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    //Override annotation
    @Override
    public void drive() {
        System.out.println("Moped driving.");
    }

    @Override
    public void refuel(){

    }
}

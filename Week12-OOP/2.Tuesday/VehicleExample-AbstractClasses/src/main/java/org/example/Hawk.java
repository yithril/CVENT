package org.example;

public class Hawk extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Hawk flies.");
    }
}

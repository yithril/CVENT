package org.example;

public class Eagle extends Bird implements Flyable {

    @Override
    public void fly() {

    }

    public void hunt(){
        System.out.println("Hunts for prey");
    }
}

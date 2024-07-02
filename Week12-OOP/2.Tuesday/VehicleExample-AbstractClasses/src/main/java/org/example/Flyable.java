package org.example;

public interface Flyable {
    void fly();
    default void glide(){
        System.out.println("Default fly method");
    }
}

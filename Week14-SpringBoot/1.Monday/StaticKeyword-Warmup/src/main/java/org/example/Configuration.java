package org.example;

public class Configuration {
    static String configValue;

    static {
        configValue = "Initial Config";
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("ConfigValue: " + configValue); // Output?
    }
}

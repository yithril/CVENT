package org.example;

public class Calculator {
    static void printWelcomeMessage() {
        System.out.println("Welcome to the Calculator");
    }

    void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.printWelcomeMessage(); // Output?
        calc.add(10, 20); // Output?

        Calculator.printWelcomeMessage(); // Output?
        // Calculator.add(10, 20); // uncomment to see what happens
    }
}

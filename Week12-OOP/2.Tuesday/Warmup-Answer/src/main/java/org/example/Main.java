package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 25, "john.doe@example.com");

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Email: " + person.getEmail());

            person.setName("Jane Doe");
            person.setAge(30);
            person.setEmail("jane.doe@example.com");

            System.out.println("Updated Name: " + person.getName());
            System.out.println("Updated Age: " + person.getAge());
            System.out.println("Updated Email: " + person.getEmail());

            // Validation tests
            // person.setAge(-5);
            // person.setName("");
            // person.setEmail("invalidEmail");

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
package org.example;

public class Employee {
    static int totalEmployees = 0;
    String name;

    Employee(String name) {
        this.name = name;
        totalEmployees++;
    }

    static void printTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
        // System.out.println("Employee name: " + name); // Compile error, uncomment to see what happens
    }

    void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        printTotalEmployees(); // Output?
        emp1.printEmployeeDetails(); // Output?
        emp2.printEmployeeDetails(); // Output?
    }
}

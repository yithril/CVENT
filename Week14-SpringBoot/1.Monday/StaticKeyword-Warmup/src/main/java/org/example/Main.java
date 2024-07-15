package org.example;

public class Main {
    public static void main(String[] args) {
        // Instructions:
        // 1. Below are several classes, each demonstrating different uses of the 'static' keyword.
        // 2. For each snippet, predict the output of the 'main' method without running the code.
        // 3. Write down any patterns or rules you notice about when and how the 'static' keyword is used.
        // 4. Answer the questions in the comments to guide your understanding.
        // 5. After completing all snippets, we'll regroup

        // Snippet 1: Static vs. Instance Variables
        runSnippet1();

        // Snippet 2: Static vs. Instance Methods
        runSnippet2();

        // Snippet 3: Static Block
        runSnippet3();

        // Snippet 4: Static and Non-static Context
        runSnippet4();
    }

    private static void runSnippet1() {
        // Snippet 1: Static vs. Instance Variables
        class BankAccount {
            static int bankCode = 1234;
            double balance = 1000.0;

            public static void main(String[] args) {
                BankAccount acc1 = new BankAccount();
                BankAccount acc2 = new BankAccount();

                acc1.bankCode++;
                acc1.balance += 500;

                acc2.bankCode++;
                acc2.balance += 200;

                // What is the value of acc1.bankCode?
                // What is the value of acc1.balance?
                // What is the value of acc2.bankCode?
                // What is the value of acc2.balance?

                System.out.println("acc1 bankCode: " + acc1.bankCode); // Output?
                System.out.println("acc1 balance: " + acc1.balance); // Output?
                System.out.println("acc2 bankCode: " + acc2.bankCode); // Output?
                System.out.println("acc2 balance: " + acc2.balance); // Output?
            }
        }
        BankAccount.main(null);
    }

    private static void runSnippet2() {
        // Snippet 2: Static vs. Instance Methods
        class Calculator {
            static void printWelcomeMessage() {
                System.out.println("Welcome to the Calculator");
            }

            void add(double a, double b) {
                System.out.println("Sum: " + (a + b));
            }

            public static void main(String[] args) {
                Calculator calc = new Calculator();

                // What happens when you call a static method using an object?
                calc.printWelcomeMessage(); // Output?

                // What happens when you call an instance method using an object?
                calc.add(10, 20); // Output?

                // What happens when you call a static method using the class name?
                Calculator.printWelcomeMessage(); // Output?

                // Uncomment the line below and predict what will happen. Why?
                // Calculator.add(10, 20); // Compile error, uncomment to see what happens
                
            }
        }
        Calculator.main(null);
    }

    private static void runSnippet3() {
        // Snippet 3: Static Block
        class Configuration {
            static String configValue;

            static {
                configValue = "Initial Config";
                System.out.println("Static block executed");
            }

            public static void main(String[] args) {
                // When is the static block executed?
                // What is the value of configValue?
                System.out.println("ConfigValue: " + configValue); // Output?
            }
        }
        Configuration.main(null);
    }

    private static void runSnippet4() {
        // Snippet 4: Static and Non-static Context
        class Employee {
            static int totalEmployees = 0;
            String name;

            Employee(String name) {
                this.name = name;
                totalEmployees++;
            }

            static void printTotalEmployees() {
                System.out.println("Total Employees: " + totalEmployees);
                // Uncomment the line below and predict what will happen. Why?
                //System.out.println("Employee name: " + name); // Compile error, uncomment to see what happens
            }

            void printEmployeeDetails() {
                System.out.println("Employee Name: " + name);
                System.out.println("Total Employees: " + totalEmployees);
            }

            public static void main(String[] args) {
                Employee emp1 = new Employee("Alice");
                Employee emp2 = new Employee("Bob");

                // What happens when you call a static method using the class name?
                printTotalEmployees(); // Output?

                // What happens when you call an instance method using an object?
                emp1.printEmployeeDetails(); // Output?
                emp2.printEmployeeDetails(); // Output?
            }
        }
        Employee.main(null);
    }
}
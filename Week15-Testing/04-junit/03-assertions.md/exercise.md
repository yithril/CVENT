# Exercise: Assertions in JUnit

## Objective

Practice using different types of assertions in JUnit.

## Task

1. Create a simple Java class with methods that perform various operations.
2. Write JUnit tests for these methods using different types of assertions.

## Instructions

1. Create a new Java class file named `Calculator.java` and implement methods for addition, subtraction, multiplication, division, and a method that throws an exception for invalid input.
2. Create a test file named `CalculatorTest.java` and write tests for these methods using different assertions:
    - Use `assertEquals` to test the addition, subtraction, multiplication, and division methods.
    - Use `assertThrows` to test the method that throws an exception.
    - Use `assertAll` to group multiple assertions together.

## Example Implementation (Calculator.java)

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public void checkNegative(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
    }
}
```

## Hints for Tests (CalculatorTest.java)

1. Import the necessary JUnit classes.
2. Create an instance of `Calculator`.
3. Write tests for each method using appropriate assertions:
    - Use `assertEquals` for basic arithmetic methods.
    - Use `assertThrows` for methods that throw exceptions.
    - Use `assertAll` to group related assertions.

Run your tests using your IDE or the command line.

Ensure that all tests pass and that you understand how to use different assertions in JUnit.

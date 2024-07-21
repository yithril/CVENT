# Exercise: Writing and Running Tests with JUnit

## Objective

Practice writing and running tests using JUnit.

## Task

1. Create a simple Java class and write JUnit tests for its methods.

## Instructions

1. Create a new Java class file named `MathOperations.java` and implement methods for addition, subtraction, multiplication, and division.
2. Create a test file named `MathOperationsTest.java` and write tests for these methods using JUnit:
    - Test the addition method.
    - Test the subtraction method.
    - Test the multiplication method.
    - Test the division method.

## Example Implementation (MathOperations.java)

```java
public class MathOperations {
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
}
```

## Hints for Tests (MathOperationsTest.java)

1. Import the necessary JUnit classes.
2. Create an instance of `MathOperations`.
3. Write tests for each method using `@Test` annotations and assertions to verify the results:
    - For the `add` method, assert that the sum is correct.
    - For the `subtract` method, assert that the difference is correct.
    - For the `multiply` method, assert that the product is correct.
    - For the `divide` method, assert that the quotient is correct and handle division by zero.

Run your tests using your IDE or the command line.

Ensure that all tests pass and that you understand how to write and run tests using JUnit.

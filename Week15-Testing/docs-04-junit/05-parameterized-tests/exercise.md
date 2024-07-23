# Exercise: Parameterized Tests in JUnit

## Objective

Practice writing parameterized tests in JUnit to test different inputs efficiently.

## Task

1. Create a simple Java class with methods that perform operations, and write parameterized tests for these methods.

## Instructions

1. Create a new Java class file named `MathUtils.java` and implement methods for checking if a number is even and for calculating the factorial of a number.
2. Create a test file named `MathUtilsTest.java` and write parameterized tests for these methods:
    - Use `@ValueSource` to test the `isEven` method with various integers.
    - Use `@CsvSource` to test the `factorial` method with pairs of inputs and expected results.

## Example Implementation (MathUtils.java)

```java
public class MathUtils {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
```

## Hints for Tests (MathUtilsTest.java)

1. Import the necessary JUnit classes.
2. Create parameterized tests for the `isEven` method using `@ValueSource`.
3. Create parameterized tests for the `factorial` method using `@CsvSource`.

Run your tests using your IDE or the command line.

Ensure that all tests pass and that you understand how to write parameterized tests in JUnit.

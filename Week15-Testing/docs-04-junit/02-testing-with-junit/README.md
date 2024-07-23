# Writing and Running Tests with JUnit

## Introduction

This guide will walk you through the basics of writing and running tests using JUnit. We will cover setting up a JUnit test, writing test methods, and running the tests.

## Setting Up JUnit

To get started with JUnit, add it to your project dependencies. If you're using Maven, add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.7.1</version>
    <scope>test</scope>
</dependency>
```

If you're using Gradle, add the following to your `build.gradle` file:

```gradle
testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.7.1'
```

## Writing a Simple Test

JUnit tests are written in Java classes with methods annotated with `@Test`.

### Example Component

```java
// Calculator.java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

### Example Test

```java
// CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2, 1));
    }
}
```

## Running Tests

You can run tests using your IDE's built-in test runner, or from the command line with Maven or Gradle:

### Maven

```bash
mvn test
```

### Gradle

```bash
gradle test
```

## Conclusion

Writing and running tests with JUnit is straightforward. By following these steps, you can create and execute tests to ensure your Java code works as expected.

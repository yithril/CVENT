# Exercise: Test Lifecycle Methods (Setup and Teardown) in JUnit

## Objective

Practice using JUnit lifecycle methods to manage setup and teardown operations.

## Task

1. Create a simple Java class and write JUnit tests using lifecycle methods to manage setup and teardown operations.

## Instructions

1. Create a new Java class file named `ResourceHandler.java` that simulates connecting to and disconnecting from a resource.
2. Create a test file named `ResourceHandlerTest.java` and write tests for the `ResourceHandler` class:
    - Use `@BeforeAll` to set up the resource before all tests.
    - Use `@AfterAll` to clean up the resource after all tests.
    - Use `@BeforeEach` to set up common test data or configurations before each test.
    - Use `@AfterEach` to clean up after each test.

## Example Implementation (ResourceHandler.java)

```java
public class ResourceHandler {
    private boolean connected;

    public void connect() {
        connected = true;
    }

    public void disconnect() {
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }
}
```

## Hints for Tests (ResourceHandlerTest.java)

1. Import the necessary JUnit classes.
2. Create a static instance of `ResourceHandler` for class-level setup and teardown.
3. Write tests to verify the connection status.
4. Use `@BeforeAll` and `@AfterAll` for class-level resource management.
5. Use `@BeforeEach` and `@AfterEach` for method-level setup and teardown.

Run your tests using your IDE or the command line.

Ensure that all tests pass and that you understand how to use lifecycle methods in JUnit.

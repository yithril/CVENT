# Test Lifecycle Methods (Setup and Teardown) in JUnit

## Introduction

JUnit provides lifecycle methods to manage setup and teardown operations before and after tests. These methods help ensure that your tests run in a clean and predictable environment.

## Lifecycle Annotations

### `@BeforeEach`

`@BeforeEach` runs before each test method. It is used for setting up common test data or configurations.

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(2, 1));
    }
}
```

### `@AfterEach`

`@AfterEach` runs after each test method. It is used for cleaning up after tests.

```java
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(2, 1));
    }
}
```

### `@BeforeAll`

`@BeforeAll` runs once before all test methods in the class. It is used for one-time setup.

```java
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private static Database database;

    @BeforeAll
    public static void setUpClass() {
        database = new Database();
        database.connect();
    }

    @Test
    public void testConnection() {
        assertTrue(database.isConnected());
    }
}
```

### `@AfterAll`

`@AfterAll` runs once after all test methods in the class. It is used for one-time cleanup.

```java
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private static Database database;

    @BeforeAll
    public static void setUpClass() {
        database = new Database();
        database.connect();
    }

    @AfterAll
    public static void tearDownClass() {
        database.disconnect();
    }

    @Test
    public void testConnection() {
        assertTrue(database.isConnected());
    }
}
```

## Conclusion

Using lifecycle methods in JUnit ensures that your tests run in a clean and predictable environment. By setting up and tearing down before and after tests, you can avoid side effects and improve test reliability.

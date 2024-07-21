# Assertions in JUnit

## Introduction

Assertions are used in JUnit tests to verify that the actual results of an operation match the expected results. JUnit provides a rich set of assertion methods to perform various types of checks.

## Basic Assertions

### `assertEquals`

`assertEquals` is used to check if two values are equal.

```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BasicAssertionsTest {
    @Test
    public void testEquals() {
        assertEquals(4, 2 + 2);
    }
}
```

### `assertTrue` and `assertFalse`

`assertTrue` is used to check if a condition is true, and `assertFalse` checks if a condition is false.

```java
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class BasicAssertionsTest {
    @Test
    public void testTrue() {
        assertTrue(3 > 2);
    }

    @Test
    public void testFalse() {
        assertFalse(2 > 3);
    }
}
```

### `assertNull` and `assertNotNull`

`assertNull` checks if an object is `null`, and `assertNotNull` checks if an object is not `null`.

```java
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class BasicAssertionsTest {
    @Test
    public void testNull() {
        Object obj = null;
        assertNull(obj);
    }

    @Test
    public void testNotNull() {
        Object obj = new Object();
        assertNotNull(obj);
    }
}
```

## Advanced Assertions

### `assertThrows`

`assertThrows` is used to verify that a specific exception is thrown.

```java
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AdvancedAssertionsTest {
    @Test
    public void testThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid argument");
        });
    }
}
```

### `assertAll`

`assertAll` is used to group multiple assertions together.

```java
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdvancedAssertionsTest {
    @Test
    public void testAll() {
        assertAll("numbers",
            () -> assertEquals(2, 1 + 1),
            () -> assertEquals(4, 2 * 2),
            () -> assertEquals(6, 3 * 2)
        );
    }
}
```

## Conclusion

JUnit provides a variety of assertions to help you verify that your code behaves as expected. By using these assertions, you can write comprehensive tests that cover different aspects of your application's functionality.

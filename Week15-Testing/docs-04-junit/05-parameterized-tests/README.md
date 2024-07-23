# Parameterized Tests in JUnit

## Introduction

Parameterized tests allow you to run the same test with different inputs, making your tests more comprehensive and efficient. JUnit provides support for parameterized tests using the `@ParameterizedTest` annotation along with various sources of parameters.

## Using `@ParameterizedTest`

To create a parameterized test, annotate your test method with `@ParameterizedTest` and provide a source of parameters using annotations like `@ValueSource`, `@CsvSource`, or `@MethodSource`.

### Example with `@ValueSource`

`@ValueSource` provides a single array of values to the parameterized test.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestDemo {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "level"})
    public void testPalindrome(String word) {
        assertTrue(isPalindrome(word));
    }

    private boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
```

### Example with `@CsvSource`

`@CsvSource` provides multiple sets of values in CSV format.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestDemo {

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "4, 5, 9",
        "7, 8, 15"
    })
    public void testAddition(int a, int b, int expected) {
        assertEquals(expected, add(a, b));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
```

### Example with `@MethodSource`

`@MethodSource` allows you to provide a method that returns a stream or collection of arguments.

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestDemo {

    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testNotEmpty(String word) {
        assertTrue(word.length() > 0);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "cherry");
    }
}
```

## Conclusion

Parameterized tests in JUnit allow you to run the same test with different inputs, enhancing the coverage and efficiency of your tests. By using various parameter sources, you can create flexible and powerful tests.

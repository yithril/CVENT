# Using Mocks in JUnit with Mockito

## Introduction

Mockito is a popular mocking framework for Java that integrates well with JUnit. It allows you to create mock objects and define their behavior, making it easier to isolate the code under test.

## Setting Up Mockito

To use Mockito, add it to your project dependencies. If you're using Maven, add the following dependencies to your `pom.xml` file:

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>3.11.2</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.7.1</version>
    <scope>test</scope>
</dependency>
```

If you're using Gradle, add the following to your `build.gradle` file:

```gradle
testImplementation 'org.mockito:mockito-core:3.11.2'
testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.7.1'
```

## Creating Mocks

You can create mock objects using `Mockito.mock` or `@Mock` annotation with `@ExtendWith(MockitoExtension.class)`.

### Example

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    private Dependency dependency;

    @InjectMocks
    private Service service;

    @Test
    public void testServiceMethod() {
        when(dependency.getData()).thenReturn("mock data");

        String result = service.process();

        assertEquals("processed mock data", result);
        verify(dependency).getData();
    }
}

class Service {
    private Dependency dependency;

    public Service(Dependency dependency) {
        this.dependency = dependency;
    }

    public String process() {
        String data = dependency.getData();
        return "processed " + data;
    }
}

class Dependency {
    public String getData() {
        return "real data";
    }
}
```

## Verifying Interactions

Mockito allows you to verify that certain methods were called on the mock objects.

### Example

```java
import static org.mockito.Mockito.*;

@Test
public void testVerifyInteraction() {
    Dependency dependency = mock(Dependency.class);
    Service service = new Service(dependency);

    service.process();

    verify(dependency).getData();
}
```

## Conclusion

Using Mockito with JUnit allows you to create mocks, define their behavior, and verify interactions. This helps you write isolated tests that focus on the code under test without dependencies.

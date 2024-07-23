# Exercise: Using Mocks in JUnit with Mockito

## Objective

Practice using Mockito to create mocks, define their behavior, and verify interactions in JUnit tests.

## Task

1. Create a simple Java service class that depends on another class, and write tests using Mockito to mock the dependency.

## Instructions

1. Create a new Java class file named `OrderService.java` that depends on an `OrderRepository` to retrieve order data.
2. Create a test file named `OrderServiceTest.java` and write tests for the `OrderService` class:
    - Mock the `OrderRepository` dependency.
    - Define the behavior of the mock.
    - Verify that the `OrderRepository` methods are called correctly.

## Example Implementation (OrderService.java)

```java
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getOrderDetails(int orderId) {
        Order order = orderRepository.findOrderById(orderId);
        return "Order details: " + order.getDescription();
    }
}

class Order {
    private int id;
    private String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

interface OrderRepository {
    Order findOrderById(int orderId);
}
```

## Hints for Tests (OrderServiceTest.java)

1. Import the necessary JUnit and Mockito classes.
2. Annotate the test class with `@ExtendWith(MockitoExtension.class)`.
3. Create a mock for the `OrderRepository` using `@Mock`.
4. Inject the mock into the `OrderService` using `@InjectMocks`.
5. Define the behavior of the mock using `when` and `thenReturn`.
6. Verify the interactions using `verify`.

Run your tests using your IDE or the command line.

Ensure that all tests pass and that you understand how to use Mockito to mock dependencies in JUnit tests.

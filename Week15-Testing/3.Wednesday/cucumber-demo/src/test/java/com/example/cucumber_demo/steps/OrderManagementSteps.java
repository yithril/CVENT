package com.example.cucumber_demo.steps;

import com.example.cucumber_demo.models.Customer;
import com.example.cucumber_demo.models.Order;
import com.example.cucumber_demo.models.OrderItem;
import com.example.cucumber_demo.repositories.CustomerRepository;
import com.example.cucumber_demo.repositories.OrderRepository;
import com.example.cucumber_demo.services.OrderService;
import com.example.cucumber_demo.services.TaxCalculationStrategyFactory;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.HashMap;
import java.util.Map;

@DataJpaTest
public class OrderManagementSteps {
    //You can think of this part like one big arrange step
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TaxCalculationStrategyFactory taxCalculationStrategyFactory;
    private OrderService orderService;

    private Customer customer;
    private Order order;
    private double orderTotal;

    private final Map<String, Double> productCatalog = new HashMap<>();
    private final Map<String, OrderItem> orderItemsMap = new HashMap<>();

    //Now we use the feature language to do the dynamic parts of the arrange step
    @Given("a customer from {string}")
    public void aCustomerFrom(String state){
        customer = new Customer();
        customer.setState(state);
        customerRepository.save(customer);
    }
}

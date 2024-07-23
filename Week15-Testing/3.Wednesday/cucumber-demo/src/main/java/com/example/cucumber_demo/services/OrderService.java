package com.example.cucumber_demo.services;

import com.example.cucumber_demo.models.Order;
import com.example.cucumber_demo.models.OrderItem;
import com.example.cucumber_demo.repositories.CustomerRepository;
import com.example.cucumber_demo.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TaxCalculationStrategyFactory taxCalculationStrategyFactory;

    @Transactional
    public Order createOrder(Long customerId, List<OrderItem> orderItems) {
        var customer = customerRepository.findById(customerId).orElseThrow(() -> new IllegalArgumentException("Invalid customer ID"));
        var order = new Order();
        order.setCustomer(customer);
        order.setOrderItems(orderItems);

        double total = orderItems.stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
        var taxStrategy = taxCalculationStrategyFactory.getStrategy(customer.getState());
        double tax = taxStrategy.calculateTax(total);

        order.setTotal(total + tax);

        orderItems.forEach(item -> item.setOrder(order));

        return orderRepository.save(order);
    }
}

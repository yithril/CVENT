package com.example.cucumber_demo.repositories;

import com.example.cucumber_demo.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

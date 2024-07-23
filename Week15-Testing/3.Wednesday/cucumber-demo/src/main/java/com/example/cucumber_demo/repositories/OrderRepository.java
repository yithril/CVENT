package com.example.cucumber_demo.repositories;

import com.example.cucumber_demo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

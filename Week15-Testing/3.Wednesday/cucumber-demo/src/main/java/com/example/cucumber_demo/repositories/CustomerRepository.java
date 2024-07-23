package com.example.cucumber_demo.repositories;

import com.example.cucumber_demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
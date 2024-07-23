package com.example.cucumber_demo.repositories;

import com.example.cucumber_demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

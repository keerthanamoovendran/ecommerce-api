package com.ecommerce.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce_api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
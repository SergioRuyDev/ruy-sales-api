package com.sergioruy.ruysalesapi.repository;

import com.sergioruy.ruysalesapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepo extends JpaRepository<Product, Long> {
}

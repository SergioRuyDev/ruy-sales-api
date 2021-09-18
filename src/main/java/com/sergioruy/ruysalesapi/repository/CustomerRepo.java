package com.sergioruy.ruysalesapi.repository;

import com.sergioruy.ruysalesapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}

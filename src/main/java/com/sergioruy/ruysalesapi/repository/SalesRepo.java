package com.sergioruy.ruysalesapi.repository;

import com.sergioruy.ruysalesapi.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepo extends JpaRepository<Sale, Long> {
}

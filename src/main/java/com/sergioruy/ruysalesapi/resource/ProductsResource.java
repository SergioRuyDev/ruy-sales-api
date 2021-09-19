package com.sergioruy.ruysalesapi.resource;

import com.sergioruy.ruysalesapi.model.Product;
import com.sergioruy.ruysalesapi.repository.ProductsRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsResource {

    private final ProductsRepo productsRepo;

    @GetMapping
    public List<Product> list() {
        return productsRepo.findAll();
    }
}

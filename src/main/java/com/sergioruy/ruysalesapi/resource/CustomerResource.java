package com.sergioruy.ruysalesapi.resource;

import com.sergioruy.ruysalesapi.model.Customer;
import com.sergioruy.ruysalesapi.repository.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerResource {

    private final CustomerRepo customerRepo;

    @GetMapping
    public List<Customer> customerList() {
        return customerRepo.findAll();
    }
}

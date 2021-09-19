package com.sergioruy.ruysalesapi.service;

import com.sergioruy.ruysalesapi.model.Sale;
import com.sergioruy.ruysalesapi.repository.ProductsRepo;
import com.sergioruy.ruysalesapi.repository.SalesRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class SaleService {

    private final SalesRepo salesRepo;

    private final ProductsRepo productsRepo;

    public Sale add(Sale sale) {
        sale.setRegister(LocalDateTime.now());
        sale.getItems().forEach(i -> {
            i.setSale(sale);
            i.setProduct(productsRepo.findById(i.getProduct().getId()).get());
        });

        BigDecimal totalItems = sale.getItems().stream()
                .map(i -> i.getProduct().getValue().multiply(new BigDecimal(i.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        sale.setTotal(totalItems.add(sale.getDelivery()));

        return salesRepo.save(sale);
    }
}

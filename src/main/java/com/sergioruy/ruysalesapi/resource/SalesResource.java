package com.sergioruy.ruysalesapi.resource;

import com.sergioruy.ruysalesapi.model.Sale;
import com.sergioruy.ruysalesapi.repository.SalesRepo;
import com.sergioruy.ruysalesapi.service.SaleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/sales")
@AllArgsConstructor
public class SalesResource {

    private final SalesRepo salesRepo;

    private final SaleService saleService;

    @GetMapping
    public List<Sale> list() {
        return salesRepo.findAll();
    }

    @PostMapping
    public Sale add(@RequestBody @Valid Sale sale) {
        return saleService.add(sale);
    }

}

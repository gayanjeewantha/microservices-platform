package com.gayan.platform.inventoryservice.controller;

import com.gayan.platform.inventoryservice.model.Product;
import com.gayan.platform.inventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public List<Product> getAll() {
        return inventoryService.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return inventoryService.create(product);
    }
}
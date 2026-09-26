package com.gayan.platform.inventoryservice.controller;

import com.gayan.platform.inventoryservice.dto.ProductDTO;
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
    public List<ProductDTO> getAll() {
        return inventoryService.getAll();
    }

    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO dto) {
        return inventoryService.create(dto);
    }
}
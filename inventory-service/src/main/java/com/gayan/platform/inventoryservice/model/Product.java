package com.gayan.platform.inventoryservice.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private int quantity;
}
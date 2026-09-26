package com.gayan.platform.inventoryservice.service;

import com.gayan.platform.inventoryservice.model.Product;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class InventoryService {
    private final Map<Long, Product> products = new HashMap<>();

    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    public Product create(Product product) {
        products.put(product.getId(), product);
        return product;
    }
}
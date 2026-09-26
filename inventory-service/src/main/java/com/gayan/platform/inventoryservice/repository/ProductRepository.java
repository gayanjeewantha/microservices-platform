package com.gayan.platform.inventoryservice.repository;

import com.gayan.platform.inventoryservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

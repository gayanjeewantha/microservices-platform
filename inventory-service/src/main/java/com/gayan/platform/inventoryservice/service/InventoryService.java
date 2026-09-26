package com.gayan.platform.inventoryservice.service;

import com.gayan.platform.inventoryservice.dto.ProductDTO;
import com.gayan.platform.inventoryservice.mapper.ProductMapper;
import com.gayan.platform.inventoryservice.model.Product;
import com.gayan.platform.inventoryservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    private final ProductRepository productRepository;

    public InventoryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAll() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO create(ProductDTO dto) {
        Product product = ProductMapper.toEntity(dto);
        Product saved = productRepository.save(product);
        return ProductMapper.toDTO(saved);
    }
}
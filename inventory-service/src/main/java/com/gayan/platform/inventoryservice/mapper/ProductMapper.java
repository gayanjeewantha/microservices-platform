package com.gayan.platform.inventoryservice.mapper;

import com.gayan.platform.inventoryservice.dto.ProductDTO;
import com.gayan.platform.inventoryservice.model.Product;

public class ProductMapper {

    public static ProductDTO toDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setQuantity(product.getQuantity());
        return dto;
    }

    public static Product toEntity(ProductDTO dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setQuantity(dto.getQuantity());
        return product;
    }
}
package com.gayan.platform.orderservice.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventory-service", url = "http://inventory-service:8081")
public interface InventoryClient {

    @GetMapping("/products")
    Object getAllProducts();
}
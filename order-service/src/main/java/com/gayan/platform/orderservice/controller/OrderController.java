package com.gayan.platform.orderservice.controller;

import com.gayan.platform.orderservice.client.InventoryClient;
import com.gayan.platform.orderservice.client.UserClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final UserClient userClient;
    private final InventoryClient inventoryClient;

    public OrderController(UserClient userClient, InventoryClient inventoryClient) {
        this.userClient = userClient;
        this.inventoryClient = inventoryClient;
    }

    @GetMapping("/check-users")
    public Object checkUsers() {
        return userClient.getAllUsers();
    }

    @GetMapping("/check-products")
    public Object checkProducts() {
        return inventoryClient.getAllProducts();
    }
}
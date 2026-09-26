package com.gayan.platform.orderservice.controller;

import com.gayan.platform.orderservice.client.InventoryClient;
import com.gayan.platform.orderservice.client.UserClient;
import com.gayan.platform.orderservice.dto.OrderDTO;
import com.gayan.platform.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final UserClient userClient;
    private final InventoryClient inventoryClient;
    private final OrderService orderService;

    public OrderController(UserClient userClient, InventoryClient inventoryClient, OrderService orderService) {
        this.userClient = userClient;
        this.inventoryClient = inventoryClient;
        this.orderService = orderService;
    }

    @GetMapping("/check-users")
    public Object checkUsers() {
        return userClient.getAllUsers();
    }

    @GetMapping("/check-products")
    public Object checkProducts() {
        return inventoryClient.getAllProducts();
    }

    @PostMapping
    public OrderDTO createOrder(@RequestBody OrderDTO dto) {
        return orderService.createOrder(dto);
    }
}
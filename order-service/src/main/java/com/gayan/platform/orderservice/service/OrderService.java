package com.gayan.platform.orderservice.service;

import com.gayan.platform.orderservice.client.UserClient;
import com.gayan.platform.orderservice.client.InventoryClient;
import com.gayan.platform.orderservice.dto.OrderDTO;
import com.gayan.platform.orderservice.mapper.OrderMapper;
import com.gayan.platform.orderservice.model.Order;
import com.gayan.platform.orderservice.repository.OrderRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserClient userClient;
    private final InventoryClient inventoryClient;

    public OrderService(OrderRepository orderRepository, UserClient userClient, InventoryClient inventoryClient) {
        this.orderRepository = orderRepository;
        this.userClient = userClient;
        this.inventoryClient = inventoryClient;
    }

    @CircuitBreaker(name = "inventoryService", fallbackMethod = "createOrderFallback")
    public OrderDTO createOrder(OrderDTO dto) {
        userClient.getAllUsers();
        inventoryClient.getAllProducts();

        Order order = OrderMapper.toEntity(dto);
        Order saved = orderRepository.save(order);
        return OrderMapper.toDTO(saved);
    }

    public OrderDTO createOrderFallback(OrderDTO dto, Throwable t) {
        throw new RuntimeException("Order service temporarily unavailable — inventory or user service is down");
    }
}
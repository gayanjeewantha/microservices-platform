package com.gayan.platform.orderservice.repository;

import com.gayan.platform.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
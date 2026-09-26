# Microservices Platform

A small microservices system demonstrating service-to-service communication,
API gateway routing, and Spring Cloud OpenFeign.

## Services
- `user-service` (8080) — user CRUD
- `inventory-service` (8081) — product/stock CRUD
- `order-service` (8082) — calls user-service and inventory-service via OpenFeign
- `gateway-service` (8083) — routes all traffic through a single entry point

## Stack
Java 25, Spring Boot 4.1.1, Spring Cloud 2025.1.2, OpenFeign, Spring Cloud Gateway (WebMVC)

## Run locally
Start each service in this order: user-service, inventory-service, order-service, gateway-service.
Then access everything through the gateway on port 8083.

## What this demonstrates
- Independent, deployable services with clear boundaries
- Synchronous service-to-service calls (OpenFeign)
- API Gateway pattern for unified routing

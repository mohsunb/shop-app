package dev.mohsun.shop.dto.request;

public record NewOrderRequest(Long customerId, Long productId, Long count) {}

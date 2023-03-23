package dev.mohsun.shop.dto.request;

import java.math.BigDecimal;

public record NewProductRequest(String description, BigDecimal price) {}

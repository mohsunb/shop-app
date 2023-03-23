package dev.mohsun.shop.service;

import dev.mohsun.shop.dto.request.NewOrderRequest;
import dev.mohsun.shop.entity.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAllOrders();
    Long addNewOrder(NewOrderRequest request);
}

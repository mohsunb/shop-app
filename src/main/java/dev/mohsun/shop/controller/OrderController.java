package dev.mohsun.shop.controller;

import dev.mohsun.shop.dto.request.NewOrderRequest;
import dev.mohsun.shop.entity.Order;
import dev.mohsun.shop.service.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {
    private final IOrderService service;

    @GetMapping("/get-all")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(service.getAllOrders());
    }

    @PostMapping("/add")
    public ResponseEntity<Long> addNewOrder(@RequestBody NewOrderRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(service.addNewOrder(request));
    }
}

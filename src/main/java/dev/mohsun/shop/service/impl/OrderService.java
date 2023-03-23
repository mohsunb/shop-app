package dev.mohsun.shop.service.impl;

import dev.mohsun.shop.dto.request.NewOrderRequest;
import dev.mohsun.shop.entity.Order;
import dev.mohsun.shop.mapper.ShopMapper;
import dev.mohsun.shop.repository.OrderRepository;
import dev.mohsun.shop.service.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {
    private final OrderRepository repository;

    @Override
    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    @Override
    public Long addNewOrder(NewOrderRequest request) {
        return repository.save(ShopMapper.INSTANCE.createOrderFromRequest(request)).getId();
    }
}

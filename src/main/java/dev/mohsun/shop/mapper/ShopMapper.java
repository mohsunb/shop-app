package dev.mohsun.shop.mapper;

import dev.mohsun.shop.dto.request.NewCustomerRequest;
import dev.mohsun.shop.dto.request.NewOrderRequest;
import dev.mohsun.shop.dto.request.NewProductRequest;
import dev.mohsun.shop.entity.Customer;
import dev.mohsun.shop.entity.Order;
import dev.mohsun.shop.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShopMapper {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    Product createProductFromRequest(NewProductRequest request);
    Customer createCustomerFromRequest(NewCustomerRequest request);
    Order createOrderFromRequest(NewOrderRequest request);
}

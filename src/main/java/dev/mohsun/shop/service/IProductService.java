package dev.mohsun.shop.service;

import dev.mohsun.shop.dto.request.NewProductRequest;
import dev.mohsun.shop.entity.Product;

import java.util.List;

public interface IProductService {
    Long addNewProduct(NewProductRequest request);
    List<Product> getAllProducts();
}

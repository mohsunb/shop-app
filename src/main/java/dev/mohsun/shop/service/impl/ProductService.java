package dev.mohsun.shop.service.impl;

import dev.mohsun.shop.dto.request.NewProductRequest;
import dev.mohsun.shop.entity.Product;
import dev.mohsun.shop.mapper.ShopMapper;
import dev.mohsun.shop.repository.ProductRepository;
import dev.mohsun.shop.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
    private final ProductRepository repository;

    @Override
    public Long addNewProduct(NewProductRequest request) {
        return repository.save(ShopMapper.INSTANCE.createProductFromRequest(request)).getId();
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}

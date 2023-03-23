package dev.mohsun.shop.controller;

import dev.mohsun.shop.dto.request.NewProductRequest;
import dev.mohsun.shop.entity.Product;
import dev.mohsun.shop.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final IProductService service;

    @GetMapping("/get-all")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(service.getAllProducts());
    }

    @PostMapping("/add")
    public ResponseEntity<Long> addNewProduct(@RequestBody NewProductRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(service.addNewProduct(request));
    }
}

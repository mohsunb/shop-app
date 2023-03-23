package dev.mohsun.shop.controller;

import dev.mohsun.shop.dto.request.NewCustomerRequest;
import dev.mohsun.shop.entity.Customer;
import dev.mohsun.shop.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final ICustomerService service;

    @GetMapping("/get-all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok(service.getAllCustomers());
    }

    @PostMapping("/add")
    public ResponseEntity<Long> addNewCustomer(@RequestBody NewCustomerRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(service.addNewCustomer(request));
    }
}

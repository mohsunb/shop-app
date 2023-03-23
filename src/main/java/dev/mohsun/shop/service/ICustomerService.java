package dev.mohsun.shop.service;

import dev.mohsun.shop.dto.request.NewCustomerRequest;
import dev.mohsun.shop.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomers();
    Long addNewCustomer(NewCustomerRequest request);
}

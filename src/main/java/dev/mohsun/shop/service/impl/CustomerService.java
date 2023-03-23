package dev.mohsun.shop.service.impl;

import dev.mohsun.shop.dto.request.NewCustomerRequest;
import dev.mohsun.shop.entity.Customer;
import dev.mohsun.shop.mapper.ShopMapper;
import dev.mohsun.shop.repository.CustomerRepository;
import dev.mohsun.shop.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {
    private final CustomerRepository repository;

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Long addNewCustomer(NewCustomerRequest request) {
        return repository.save(ShopMapper.INSTANCE.createCustomerFromRequest(request)).getId();
    }
}

package com.ecommerce.demo.Customer;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository cusRepo;

    public String createCustomer(Customer cusData) {
        if (cusRepo.returnCustomer(cusData.getName()) != null) {
            cusRepo.save(cusData);
            return "User is added";
        } else {
            return "User is not added";
        }
    }

    public List<Customer> getallCustomers() {
        return cusRepo.findAll();
    }
}

package com.ecommerce.demo.Customer;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService cusService;

    @PostMapping
    public String createCustomer(@RequestBody Customer cusData) throws NoSuchAlgorithmException {
        return cusService.createCustomer(cusData);
    }

    @GetMapping
    public List<Customer> returnAll() {
        return cusService.getallCustomers();
    }
}

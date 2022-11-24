package com.ecommerce.demo.Customer;

import java.security.NoSuchAlgorithmException;

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
    public Customer addCustomer(@RequestBody Customer cusData) throws NoSuchAlgorithmException {
        return cusService.addCustomer(cusData);
    }
}

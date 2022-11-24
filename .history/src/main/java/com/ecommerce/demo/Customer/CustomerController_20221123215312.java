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
    private CustomerRepository cusRepo;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer cusData) throws NoSuchAlgorithmException {
       if(cusRepo.returnCustomer(cusData.getName())!=null){
            return cusRepo.save(cusData)

       }
       else{
        return null;
       }
    }

    @GetMapping
    public List<Customer> returnAll() {
        return cusRepo.findAll();
    }
}

package com.ecommerce.demo.Customer;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    @Autowired
    private CustomerRepository cusRepo;

    public boolean addCustomer(Customer cus) throws NoSuchAlgorithmException{

        if(cusRepo.returnCustomer(cus.getName()) != null){
            return false;
        }
        else{
            cusRepo.save(cus)
        }
    }
}

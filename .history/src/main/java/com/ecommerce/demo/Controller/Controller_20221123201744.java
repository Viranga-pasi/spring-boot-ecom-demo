package com.ecommerce.demo.Controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin
public class Controller {

    @GetMapping("getcustomer")
    public String returnCustomer() throws NoSuchAlgorithmException {
        return "hello";
    }

}

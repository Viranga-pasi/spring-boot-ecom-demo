package com.ecommerce.demo.Resturant;

import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resturant")
public class ResturantController {

    @GetMapping
    public String getResturant() throws NoSuchAlgorithmException {
        return "Resturant";
    }
}

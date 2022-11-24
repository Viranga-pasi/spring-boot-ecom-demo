package com.ecommerce.demo.Resturant;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resturant")
public class ResturantController {

    @Autowired
    private ResturantService resService;

    @PostMapping
    public String getResturant(@RequestBody Resturant resData) {
        return resService.createResturant(resData);
    }
}

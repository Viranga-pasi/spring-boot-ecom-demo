package com.ecommerce.demo.Listing;

import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listing")
public class ListingController {

    @GetMapping
    public String getListing() throws NoSuchAlgorithmException {
        return "Listing";
    }

}

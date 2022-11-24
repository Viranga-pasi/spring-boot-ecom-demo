package com.ecommerce.demo.Listing;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listing")
public class ListingController {

    @Autowired
    private ListingService listService;

    @GetMapping
    public List<Listing> getListing() throws NoSuchAlgorithmException {
        return listService.returnAllListing();
    }

    @PostMapping("/create")
    public Listing createListing(@RequestBody Listing listData) {
        return listService.createListing(listData);

    }
}

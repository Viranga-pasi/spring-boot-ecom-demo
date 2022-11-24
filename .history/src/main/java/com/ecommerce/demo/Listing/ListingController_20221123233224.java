package com.ecommerce.demo.Listing;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.Resturant.Resturant;
import com.ecommerce.demo.Resturant.ResturantRepository;

@RestController
@RequestMapping("/listing")
public class ListingController {

    @Autowired
    private ResturantRepository resRepo;

    @Autowired
    private ListingRepository listRepo;

    @Autowired
    private Listing listing;

    @GetMapping
    public String getListing() throws NoSuchAlgorithmException {
        return "Listing";
    }

    @PostMapping("/create/{resturantID}")
    Listing createListing(@PathVariable int id) {
        Resturant resturant = resRepo.findById(id).get();
        listing.createListing(resturant);

        return listRepo.save(listing);
    }
}

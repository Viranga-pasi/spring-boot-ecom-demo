package com.ecommerce.demo.Listing;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listRepo;

    public Listing createListing(Listing listData) {

        return listRepo.save(listData);

    }

    public List<Listing> returnAllListing() {
        return listRepo.findAll();
    }

}

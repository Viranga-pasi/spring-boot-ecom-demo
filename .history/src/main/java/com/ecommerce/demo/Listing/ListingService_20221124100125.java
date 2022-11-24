package com.ecommerce.demo.Listing;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listRepo;

    public String createListing(Listing listData) throws NoSuchAlgorithmException {

        if (listRepo.returnListing(listData.getName()) != null) {
            return "List is created";
        } else {
            return "List is no created";
        }
    }

    public List<Listing> returnAllListing() {
        return listRepo.findAll();
    }

}

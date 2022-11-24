package com.ecommerce.demo.Listing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.Resturant.Resturant;
import com.ecommerce.demo.Resturant.ResturantRepository;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listRepo;

    @Autowired
    private ResturantRepository resRepo;

    public Listing createListing(Listing listData, int listId) {
        Resturant resData = resRepo.returnResturants(listId);
        if (resData != null) {
            listData.setResturant(resData);
            return listRepo.save(listData);
        } else {
            return null;
        }
    }

    public List<Listing> returnAllListing() {
        return listRepo.findAll();
    }

}

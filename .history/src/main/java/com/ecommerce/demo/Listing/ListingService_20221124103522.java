package com.ecommerce.demo.Listing;

import java.security.NoSuchAlgorithmException;
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

    public Listing createListing(Listing listData) {

        Listing listClass = new Listing();

        listClass.setName(listData.getName());
        listClass.setPrice(listData.getPrice());

        Resturant resData = resRepo.returnResturants(listData.getResturant().getId());
        listClass.setResturant(resData);

        return listRepo.save(listClass);

    }

    public List<Listing> returnAllListing() {
        return listRepo.findAll();
    }

}

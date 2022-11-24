package com.ecommerce.demo.Resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResturantService {

    @Autowired
    private ResturantRepository resRepo;

    public String createResturant(Resturant resData) {
        if (resRepo.returnResturants(resData.getName()) == null) {

        }
    }
}

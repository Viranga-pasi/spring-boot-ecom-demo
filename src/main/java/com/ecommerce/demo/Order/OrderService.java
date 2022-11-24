package com.ecommerce.demo.Order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepo;


    public List<Order> returnAll(){
        return orderRepo.findAll();
    }


}

package com.ecommerce.demo.Order;


import com.ecommerce.demo.Customer.Customer;
import com.ecommerce.demo.Customer.CustomerRepository;
import com.ecommerce.demo.Listing.Listing;
import com.ecommerce.demo.Listing.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepo;

    @Autowired
    CustomerRepository cusRepo;

    @Autowired
    ListingRepository listRepo;

    public List<Order> returnAll(){
        return orderRepo.findAll();
    }

    public String createOrder(Order orderData, int cusId, int listId){
        Customer cusData = cusRepo.getReferenceById(cusId);
        Listing listData = listRepo.getReferenceById(listId);

        if(cusData != null && listData != null){
            orderData.setListing(listData);
            orderData.setCustomer(cusData);

            orderRepo.save(orderData);
            return "Order is placed";
        }
        else{
            return "Order cannot placed";

        }
    }

}

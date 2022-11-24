package com.ecommerce.demo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping
    public List<Order> getAll(){
        return orderService.returnAll();
    }

    @PostMapping("/create/{cusId}/{listId}")
    public String createOrder(
            @RequestBody Order orderData,
            @PathVariable int cusId,
            @PathVariable int listId)
    {
        return orderService.createOrder(orderData, cusId, listId);
    }

}

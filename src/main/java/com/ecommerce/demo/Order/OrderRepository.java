package com.ecommerce.demo.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT * FROM orders WHERE cus_id =?1", nativeQuery = true)
    Order getOrderByCustomer(int id);

}

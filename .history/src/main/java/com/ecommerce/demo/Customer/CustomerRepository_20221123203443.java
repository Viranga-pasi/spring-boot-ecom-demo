package com.ecommerce.demo.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "SELECT * FROM customer WHERE cus_namae=?1", nativeQuery = true)
    Customer returnCustomer(Srting name);
}

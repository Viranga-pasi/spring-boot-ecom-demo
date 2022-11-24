package com.ecommerce.demo.Listing;

import javax.persistence.*;

import com.ecommerce.demo.Order.Order;
import com.ecommerce.demo.Resturant.Resturant;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
@Table(name = "listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "list_id")
    private int id;

    @Column(name = "list_name")
    private String name;

    @Column(name = "list_price")
    private float price;

    // relationships
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resturant_res_id", nullable = false)
    private Resturant resturant;

    @OneToMany(mappedBy = "listing", cascade = CascadeType.ALL)
    private List<Order> orders;



    // getter and setter
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Resturant getResturant() {
        return this.resturant;
    }

    public void setResturant(Resturant resturant) {
        this.resturant = resturant;
    }

}

package com.ecommerce.demo.Listing;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ecommerce.demo.Resturant.Resturant;

import javax.persistence.GenerationType;

@Entity
@Table(name = "listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private int id;

    @Column(name = "list_name")
    private String name;

    @Column(name = "list_price")
    private float price;

    // relationships
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "res_id", referencedColumnName = "res_id")
    private Resturant resturant;

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

    public void placeResturant(Resturant resturant) {
        this.resturant = resturant;
    }

}

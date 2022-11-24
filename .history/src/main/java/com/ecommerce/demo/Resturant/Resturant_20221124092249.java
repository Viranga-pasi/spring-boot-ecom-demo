package com.ecommerce.demo.Resturant;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ecommerce.demo.Listing.Listing;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GenerationType;

@Entity
@Table(name = "resturant")
public class Resturant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "res_id")
    private int id;

    @Column(name = "res_name")
    private String name;

    @Column(name = "res_location")
    private String location;

    // relations
    // @JsonIgnore
    // @OneToMany(mappedBy = "resturant")
    // @JoinColumn(name = "fk_list", referencedColumnName = "list_id")
    private List<Listing> lists;

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

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Listing> getLists() {
        return this.lists;
    }

    public void setLists(List<Listing> lists) {
        this.lists = lists;
    }

}

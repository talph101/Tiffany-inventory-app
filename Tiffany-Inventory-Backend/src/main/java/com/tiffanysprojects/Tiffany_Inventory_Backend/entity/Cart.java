package com.tiffanysprojects.Tiffany_Inventory_Backend.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generate id
    private Long id;

    @OneToMany
    //will possibly need this next to annotation:  (mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Item> items;

    public Cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

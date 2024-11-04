package com.tiffanysprojects.Tiffany_Inventory_Backend.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generate id
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    //will possibly need this next to annotation:  (mappedBy = "cart", cascade = CascadeType.ALL)
    //have to store it in something so added new ArrayList. Polymorphism example?
    private List<Item> items = new ArrayList<>();

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

    //new

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }
}

package com.tiffanysprojects.Tiffany_Inventory_Backend.entity;


import jakarta.persistence.*;

@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generate id
    private Long id;

    @OneToMany
    private Item item;

    public Cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

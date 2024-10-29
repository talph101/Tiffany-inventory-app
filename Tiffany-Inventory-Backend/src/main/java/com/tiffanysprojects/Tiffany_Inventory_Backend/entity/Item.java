package com.tiffanysprojects.Tiffany_Inventory_Backend.entity;

import jakarta.persistence.*;

@Entity //used to specify a class a JPA Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generate id
    private Long id;

    private String name;
    private double price;
    @Column(length = 1000000)
    private String description;
    private String category;
    private String image;

    public Item(Long id, String name, double price, String description, String category, String image) {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

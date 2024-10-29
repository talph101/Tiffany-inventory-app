package com.tiffanysprojects.Tiffany_Inventory_Backend.repository;

import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

//Define a repository interface to perform database operations
//allows you to perform CRUD operations on the entity.

public interface ItemRepository extends JpaRepository<Item, Long> {
}

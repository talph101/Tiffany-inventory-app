package com.tiffanysprojects.Tiffany_Inventory_Backend.repository;

import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

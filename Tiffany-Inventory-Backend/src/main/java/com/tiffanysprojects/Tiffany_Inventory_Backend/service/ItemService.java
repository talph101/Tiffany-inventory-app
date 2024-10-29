package com.tiffanysprojects.Tiffany_Inventory_Backend.service;

import com.tiffanysprojects.Tiffany_Inventory_Backend.dto.ItemDTO;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;

import java.util.List;

//Interfaces specify methods that a class must implement, ensuring consistent behavior across different classes.
// They are used to achieve abstraction and multiple inheritance.

public interface ItemService {
//    List<ItemDTO> getAllItems();

    Item createItem(Item item);

    List<Item> findAll();

    Item getItemById(Long itemId);
}

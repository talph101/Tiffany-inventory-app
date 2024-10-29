package com.tiffanysprojects.Tiffany_Inventory_Backend.controller;


import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/items")
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


// ResponseEntity to Manipulate the HTTP Response
// GET item
    @GetMapping
    public List<Item> getAllItems(){
        return itemService.findAll();
    }

    //CREATE item
    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }


    //GET one item

    //UPDATE item

    //DELETE item


}

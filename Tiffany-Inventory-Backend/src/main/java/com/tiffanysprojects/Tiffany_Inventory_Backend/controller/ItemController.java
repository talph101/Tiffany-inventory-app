package com.tiffanysprojects.Tiffany_Inventory_Backend.controller;


import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/items")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

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
    @GetMapping("{id}")
    public Item getItemById(@PathVariable("id") Long itemId ){
        return itemService.getItemById(itemId);
    }

    //UPDATE item
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable("id") Long itemId, @RequestBody Item updatedItem){
        return itemService.updateItem(itemId, updatedItem);
    }

    //DELETE item
    @DeleteMapping("{id}")
    public Item deleteItem(@PathVariable("id") Long itemId){
        return itemService.deleteItem(itemId);
    }

    @GetMapping("/search/{name}")
    public List<Item> searchItem(@PathVariable("name") String itemName){
        return itemService.searchItem(itemName);

    }


}

package com.tiffanysprojects.Tiffany_Inventory_Backend.controller;


import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Cart;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/items/cart")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    //cart represents the cart ID. There is only one cart though
    @PostMapping("{id}")
    public Cart addItemToCart(@PathVariable("id") Long itemId){
        return cartService.addToCart(itemId);
    }

    @GetMapping
    public Cart getCart(){
        return cartService.getCart();
    }


    //this may cause problems later in the frontend. Might have to use this version
//    @DeleteMapping("{id}")
//    public Item deleteItemInCart(@PathVariable("id") Long itemId){
//        return cartService.deleteItem(itemId);
//    }

    @DeleteMapping("{id}")
    public void deleteItemInCart(@PathVariable("id") Long itemId){
        cartService.deleteItem(itemId);
    }
}

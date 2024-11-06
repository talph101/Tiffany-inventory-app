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

    @PostMapping("{id}")
    public Cart addItemToCart(@PathVariable("id") Long itemId){
        return cartService.addToCart(itemId);
    }

    @GetMapping
    public Cart getCart(){
        return cartService.getCart();
    }


    @DeleteMapping("{id}")
    public void deleteItemInCart(@PathVariable("id") Long itemId){
        cartService.deleteItem(itemId);
    }
}

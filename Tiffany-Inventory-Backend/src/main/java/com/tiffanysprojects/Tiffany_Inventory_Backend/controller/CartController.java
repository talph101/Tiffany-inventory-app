package com.tiffanysprojects.Tiffany_Inventory_Backend.controller;


import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Cart;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items/cart")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    //cart represents the cart ID. There is only one cart though
    @PostMapping
    public Cart addItemToCart(@RequestBody Cart cart, @RequestParam Item item){
        return cartService.addToCart(cart, item);
    }

    @GetMapping
    public List<Cart> getCart(){
        return cartService.getCart();
    }

    @DeleteMapping
    public Item deleteItemInCart(@PathVariable("id") Long itemId){
        return cartService.deleteItem(itemId);
    }
}

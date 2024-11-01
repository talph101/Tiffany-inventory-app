package com.tiffanysprojects.Tiffany_Inventory_Backend.service.impl;

import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Cart;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.repository.CartRepository;
import com.tiffanysprojects.Tiffany_Inventory_Backend.service.CartService;

import java.util.List;

public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;

    @Override
    public void addToCart(Cart cart, Item item){
        cart.getItems().add(item);
        cartRepository.save(cart);
    }

    @Override
    public List<Cart> getCart() {
        return cartRepository.findAll();
    }

    @Override
    public Item deleteItem(Long itemId) {
        return null;
    }
}
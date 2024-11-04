package com.tiffanysprojects.Tiffany_Inventory_Backend.service.impl;

import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Cart;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;
import com.tiffanysprojects.Tiffany_Inventory_Backend.repository.CartRepository;
import com.tiffanysprojects.Tiffany_Inventory_Backend.repository.ItemRepository;
import com.tiffanysprojects.Tiffany_Inventory_Backend.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;
    //include the item repo
    private ItemRepository itemRepository;

    public CartServiceImpl(CartRepository cartRepository, ItemRepository itemRepository) {
        this.cartRepository = cartRepository;
        this.itemRepository = itemRepository;
    }


    private Cart createCart(){
        return cartRepository.findAll().stream().findFirst().orElseGet(()-> cartRepository.save(new Cart()));
    }

    @Override
    public Cart addToCart(Long itemId) {
        Cart cart = createCart();
        Item item = itemRepository.findById(itemId).orElse(null);
        cart.addItem(item);
        return cartRepository.save(cart);
    }

    @Override
    public Cart getCart() {
        return createCart();
    }

    @Override
    public void deleteItem(Long itemId) {
        Cart cart = createCart();
        Item itemToDelete = itemRepository.findById(itemId).orElse(null);
        cart.removeItem(itemToDelete);
        cartRepository.save(cart);

    }
}
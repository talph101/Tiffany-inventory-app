package com.tiffanysprojects.Tiffany_Inventory_Backend.service;

import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Cart;
import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Item;

import java.util.List;

public interface CartService {

//Endpoints:
//Add Item to Cart:
//POST /cart/items
//Request Body: Include item details or ID to add to the cart.
//View Cart Contents:
//GET /cart
//Response: List items in the cart.
//Remove Item from Car
//DELETE /cart/items/{itemId}
//Removes a specific item from the cart.

//create
Cart addToCart(Cart cart, Item item);

List<Cart> getCart();


Item deleteItem(Long itemId);
}

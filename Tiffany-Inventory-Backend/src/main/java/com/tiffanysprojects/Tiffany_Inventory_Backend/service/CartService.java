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

//create / add item to cart
Cart addToCart(Long itemId);

//get all items in the cart
Cart getCart();


void deleteItem(Long itemId);
}

//updated. The cart is not a list.
//everything is of data type Cart. Cart is one single thing

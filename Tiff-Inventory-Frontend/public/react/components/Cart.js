import React from 'react'
import { SingleItem } from './SingleItem'
import { ItemList } from './ItemList'

export function Cart({ cart, goBackToList, removeFromCart }) {


  return (
    <div>
        <h2>Your Cart</h2>
        {cart.length > 0 ? (
            <ul className="cart-items">
                {cart.map((item, index) => (
                    <li key={index} className="cart-item">
                        <img src={item.image} alt={item.name} className="cart-item-image"/>
                        <h3 className="cart-item-name">{item.name}</h3>
                        <p className="cart-item-description">{item.descritption}</p>
                        <p className="cart-item-price">Price: ${item.price.toFixed(2)}</p>
                        <button className="remove-cart-btn" onClick={() => removeFromCart(item.id)}>Remove</button>
                    </li>
                ))}
            </ul>
        ) :(
            <p>Your cart is empty.</p>
        )}
        <button onClick={goBackToList}>Back</button>
    </div>
  );
}

export default Cart
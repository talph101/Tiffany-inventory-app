import React from 'react'
import { SingleItem } from './SingleItem'
import { ItemList } from './ItemList'

export function Cart({ cart, goBackToList, removeFromCart }) {


    //adds item to cart but does not display item
  return (
    <div>
        <h2>Your Cart</h2>
        {cart.length > 0 ? (
            <ul>
                {cart.map((item, index) => (
                    <li key={index}>
                        <img src={item.image} alt={item.name} style={{width: '50px'}}/>
                        <h3>{item.name}</h3>
                        <p>{item.descritption}</p>
                        <p>Price: ${item.price.toFixed(2)}</p>
                        <button onClick={() => removeFromCart(item.id)}>Remove</button>
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
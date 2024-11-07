## StockSync Inventory App

An eCommerce store where internal users can directly view and manage products without any intermediary service over the internet. The goal was to develop an easy to use web-based interface where users can search for products, and view a complete description of the product. Since the store is meant for internal use only, users are allowed to add, update and delete items.

## Getting Started

`npm run client-dev`

## Deployment

## Built With

- Node.js
- React
- Spring Boot
- H2

## Backlog

Items to be implemented in future developments:

- Adding items to a cart and perform a checkout of items thus creating an order to be added to the database.
- Allowing user login/logout
- More robust error handling
- Robust test cases


/* Center cart container */
.cart-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: antiquewhite;
  padding: 2rem;
  border-radius: 8px;
  width: 90%;
  max-width: 600px;
  margin: 0 auto;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}

/* Cart items list styling */
.cart-items {
  list-style-type: none;
  padding: 0;
  margin: 0;
  width: 100%;
}

/* Individual cart item styling */
.cart-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 1rem;
  border: 1px solid #ccc;
  border-radius: 8px;
  margin-bottom: 1rem;
  background-color: white;
  transition: all 0.3s ease;
}

/* Styling for cart item image */
.cart-item-image {
  width: 100%;
  max-width: 200px;
  height: auto;
  border-radius: 4px;
  object-fit: contain;
}

/* Center and style cart item text */
.cart-item-name, .cart-item-description, .cart-item-price {
  margin: 0.5rem 0;
  text-align: center;
}

/* Remove button styling in cart */
.remove-cart-btn {
  background-color: red;
  color: white;
  font-weight: bold;
  padding: 0.5rem 1rem;
  border-radius: 4px;
  font-size: 14px;
  cursor: pointer;
  transition: background-color 0.3s;
}

.remove-cart-btn:hover {
  background-color: darkred;
}

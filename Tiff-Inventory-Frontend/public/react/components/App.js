import React, { useState, useEffect } from "react"
import { ItemList } from "./ItemList"
import { SingleItem } from "./SingleItem"
import { ItemForm } from "./itemform"
import { Search } from "./Search"
import { Cart } from "./Cart"

// import and prepend the api url to any fetch calls
import apiURL from "../api"

export const App = () => {
	const [items, setItems] = useState([])
	const [singleItem, setSingleItem] = useState(null)
	const [itemRefresh, setItemRefresh] = useState(false)
	const [addView, setAddView] = useState(false)
	const [searchView, setSearchView] = useState(false)

	const [cartView, setCartView] = useState(false);
	const [cart, setCart] = useState([]);

	async function fetchItems() {
		try {
			const response = await fetch(`${apiURL}/items`)
			const itemsData = await response.json()

			setItems(itemsData)
		} catch (err) {
			console.log("Oh no an error! ", err)
		}
	}

	useEffect(() => {
		fetchItems()
	}, [itemRefresh])

	//To fetch single item
	async function fetchItemById(id) {
		try {
			const response = await fetch(`${apiURL}/items/${id}`)
			const data = await response.json()
			setSingleItem(data)
		} catch (err) {
			console.log("Oh no an error! ", err)
		}
	}

	async function deleteItem(id) {
		try {
			const response = await fetch(`${apiURL}/items/${id}`, {
				method: "DELETE",
			})
			const data = await response.json()
			console.log("Item deleted: ", data)

			// Re-fetch the updated list of Items
			const updatedItemsResponse = await fetch(`${apiURL}/items`)
			const updatedItemsData = await updatedItemsResponse.json()
			setItems(updatedItemsData)
			setItemRefresh(!itemRefresh)
			goBackToList()

			// Switch back to the list view after deletion
			setSingleItem(null)
		} catch (err) {
			console.log("Error deleting item: ", err)
		}
	}

	//Add item to cart
	async function addToCart(item) {
		try{
			const response = await fetch(`${apiURL}/items/cart/${item.id}`, {
				method: "POST",
			});

			if (response.ok) {
				await fetchCart();
				setCartView(true);
			} else {
				console.log("Error adding item to cart: ", response.statusText);
			} //Switch to cart view once item is added
		} catch (err) {
			console.log("Error adding item to cart: ", err);
		}
		
	}
	//fetch all items from the cart
	async function fetchCart(){
		try{
			const response = await fetch(`${apiURL}/items/cart`);
			const cartData = await response.json();
			setCart(cartData.items);
		} catch (err) {
			console.log("Error fetching cart items: ", err);
		}
	}

	useEffect(() => {
		if (cartView) {
			fetchCart();
		} 
	}, [cartView]);

	//DELETE from cart
	async function removeFromCart(itemId){
		try{
			await fetch(`${apiURL}/items/cart/${itemId}`, {
				method: "DELETE",
			});
			//after deleting this will re-fetch cart.
			const response = await fetch(`${apiURL}/items/cart`);
			const updatedCart = await response.json();
			setCart(updatedCart.items);
		} catch (err) {
			console.log("Error removing item from cart: ", err);
		}
	}

	//go Back to Item list
	function goBackToList() {
		setSingleItem(null)

		setCartView(false);
	}

	function handleAddClick(e) {
		setAddView(!addView)
	}

	function handleSearchClick() {
		setSearchView(!searchView)
	}


	return (
		<main>
			<h1 className="header">StockSync Store</h1>
			{cartView ? (
				<Cart cart={cart} goBackToList={goBackToList} removeFromCart={removeFromCart} />
			) : (
				<>
					<button onClick={() => setCartView(true)}>View Cart</button>
					{searchView || singleItem ? (
						<></>
					) : (
						<button onClick={handleAddClick}>{addView ? "Back" : "Add Item"}</button>
					)}
					<br />
					{addView || singleItem ? (
						 <></>
						 ) : (
						 <button onClick={handleSearchClick}>{searchView ? "Back" : "Search"}</button>
						 )}
					{searchView ? (
						<Search handleSearchClick={handleSearchClick} fetchItemById={fetchItemById}/>
					) : addView ? (<ItemForm addView={addView} setAddView={setAddView} itemRefresh={itemRefresh} setItemRefresh={setItemRefresh}/>
	
					) : (
						<>
						{singleItem ? ( <SingleItem item={singleItem} goBack={goBackToList} deleteItem={deleteItem} itemRefresh={itemRefresh} setItemRefresh={setItemRefresh} addToCart={addToCart}/>
						) : (
							<>
							<h2 className="subheader">All items 🔥</h2>
							<div className="item-display">
								<ItemList items={items} onItemClick={fetchItemById}/>
							</div>
							</>
						)}
						</>
					)}
					
				</>			
			)}
			</main>
	);
}

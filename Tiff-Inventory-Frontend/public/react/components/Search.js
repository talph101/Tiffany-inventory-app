import React, { useState } from "react"
import apiURL from "../api"

export const Search = ({ handleSearchClick, fetchItemById }) => {
	const [foundItem, setFoundItem] = useState([])
	const [searchValue, setSearchValue] = useState("")

	async function handleSearchSubmit(e) {
		setFoundItem([])
		e.preventDefault()
		try {
			const itemKey = searchValue
			const response = await fetch(`${apiURL}/items/search/${itemKey}`)
			const itemsData = await response.json()
			console.log(itemsData)
			setFoundItem(itemsData)
			setSearchValue("")
		} catch (err) {
			console.log("Oh no an error! ", err)
		}
	}

	function handleSearchItemClick(id) {
		handleSearchClick()
		fetchItemById(id)
	}

	return (
		<form onSubmit={handleSearchSubmit}>
			<input className="searchInput" value={searchValue} onChange={(e) => setSearchValue(e.target.value)}></input>
			<button type="submit">Search</button>

			{foundItem == null ? (
				<>
					<br />
					No Item Found
				</>
			) : (
				<>
					{foundItem.map((item) => (
						<div className="container">
							<div className="item-details" onClick={() => handleSearchItemClick(item.id)}>
								<img className="image-size" src={item.image} alt={item.name}></img>
								<h1 className="detail-info">{item.name}</h1>
								<h2 className="detail-info">${item.price.toFixed(2)}</h2>
								<p className="detail-info">{item.category}</p>
								<p className="detail-info">{item.description}</p>
							</div>
						</div>
					))}
				</>
			)}
		</form>
	)
}

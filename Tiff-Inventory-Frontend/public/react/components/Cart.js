import React from 'react'
import { SingleItem } from './SingleItem'
import { ItemList } from './ItemList'

export function Cart({ cart, goBackToList }) {


    //adds item to cart but does not display item
  return (
    <div>
        <h2>Your Cart</h2>
        {cart.length > 0 ? (
            <ul>
                {cart.map((item, index) => (
                    <li key={index}>
                        <h3>{item.name}</h3>
                        <p>{item.descritption}</p>
                        <p>Price: ${item.price.toFixed(2)}</p>
                    </li>
                ))}
            </ul>
        ) :(
            <p>Your cart is empty.</p>
        )}
        <button onClick={goBackToList}>GO BACK</button>
    </div>
  );
}


// return (
//     <main>
//         <h1 className="header">TiffTrack Store</h1>
//         {/* ADDED */}
//         {cartView ? (
//             <Cart cart={cart} goBackToList={goBackToList} />
//         ) : (
//             <>
//                 <button onClick={() => setCartView(true)}>View Cart</button>
//                 {searchView || singleItem ? (
//                     <></>
//                 ) : (
//                     <button onClick={handleAddClick}>{addView ? "Back" : "Add Item"}</button>
//                 )}
//                 <br />
//                 {addView || singleItem ? (
//                      <></>
//                      ) : (
//                      <button onClick={handleSearchClick}>{searchView ? "Back" : "Search"}</button>
//                      )}
//                 {searchView ? (
//                     <Search handleSearchClick={handleSearchClick} fetchItemById={fetchItemById}/>
//                 ) : addView ? (<ItemForm addView={addView} setAddView={setAddView} itemRefresh={itemRefresh} setItemRefresh={setItemRefresh}/>

//                 ) : (
//                     <>
//                     {singleItem ? ( <SingleItem item={singleItem} goBack={goBackToList} deleteItem={deleteItem} itemRefresh={itemRefresh} setItemRefresh={setItemRefresh} addToCart={addToCart}/>
//                     ) : (
//                         <>
//                         <h2 className="subheader">All items</h2>
//                         <div className="item-display">
//                             <ItemList items={items} onItemClick={fetchItemById}/>
//                         </div>
//                         </>
//                     )}
//                     </>
//                 )}
                
//             </>			
//         )}
//         </main>
// );

// }

export default Cart
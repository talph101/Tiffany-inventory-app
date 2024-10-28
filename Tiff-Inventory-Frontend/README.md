# Tee-JAM Internal E-Commerce

# Inventory App

Multiverse Project - An eCommerce store where internal consumers can directly view and manage products without any intermediary service over the internet. The goal was to develop an easy to use web-based interface where customers can search for products, and view a complete description of the product. Since the store is meant for internal use, Users are allowed to add, update and delete items.

## Getting Started

1. `npm install`
2. `npm run seed`
3. `npm run server-dev`
4. `npm run client-dev`

![image](/public/react/assets/TeeJAM.png)

## Deployment

[Live Site](https://inventory-app-ujdx.onrender.com)

## User Story

- From the landing page, you are presented with a full list of available items.
- Click on any item on the landing page and you will be presented with a new view of that item including all the details of that item as well as an option to go back to the landing page, update the item, or delete item.
- Clicking on the update button, you will see a new view with 5 form fields that are prefilled with the existing information for easy editing. Once complete with making your changes, click submit and you will be returned to the landing page with the updated information present on the item you updated.
- Clicking on the delete button will return you to the landing page with that specific item no longer in the list on the landing page.
- At the top of the page there are two buttons, one to add an item to the database and landing page, and the other to search for items based on your input.
- Clicking on the Add Item button, will take you to a new view that will present you with 5 form fields, name, description, price, category, and image. All fields are required for you to submit. The Price field allows only numbers to be entered (ex. 500.00 or 500). Finally the image field only allows for URLs to be submitted (ex. http://something.com). -Clicking on the Search button with bring you to another view that has one form field and a submit button allowing you to search for items based on partial information, such as, Mens or Gold. Once the submit button is pressed, any item that contains the entered information will be displayed on the screen including all the details of that item.

## Built With

- Node.js
- Express
- React
- Sequelize
- SQlite

## Backlog

Items to be implemented in future developments:

- Adding items to a cart and perform a checkout of items thus creating an order to be added to the database.
- More robust error handling
- More robust test cases

## Authors

- [Mahdi Belabbas](https://github.com/idham19)
- [Tiffany Hill](https://github.com/talph101)
- [Jordan Biehl](https://github.com/jbiehl88)
- [Adrian Burke](https://github.com/AdrianBurke1)

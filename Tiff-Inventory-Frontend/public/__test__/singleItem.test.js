import React from "react";
import {SingleItem} from "../react/components/SingleItem"; 
import { render, screen, fireEvent } from "@testing-library/react";
import "@testing-library/jest-dom"; 

describe("SingleItem Component", () => {
  const mockItem = {
    id: 1,
    name: "Test Item",
    price: 19.99,
    category: "Test Category",
    description: "This is a test item.",
    image: "https://via.placeholder.com/150",
  };

  const mockDeleteItem = jest.fn();
  const mockGoBack = jest.fn();
  const mockSetItemRefresh = jest.fn();

  test("renders item details correctly", () => {
    render(
      <SingleItem
        item={mockItem}
        deleteItem={mockDeleteItem}
        goBack={mockGoBack}
        itemRefresh={false}
        setItemRefresh={mockSetItemRefresh}
      />
    );

    // Check if the item details are displayed correctly
    expect(screen.getByText("Test Item")).toBeInTheDocument();
    expect(screen.getByText("$19.99")).toBeInTheDocument();
    expect(screen.getByText("Test Category")).toBeInTheDocument();
    expect(screen.getByText("This is a test item.")).toBeInTheDocument();
    expect(screen.getByRole("img")).toHaveAttribute("src", mockItem.image);
  });
});

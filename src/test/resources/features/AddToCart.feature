Feature: Add Searched product to  cart functionality

  Background:
    #Given user  navigate to Amazon web home page
    When user enters the full name of a product gaming laptop
    And user clicks on search button
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    When user applies a brand filter "Acer"
    And user applies a price filter between $500 and $1000

  @smoke3
  Scenario:  Adding Searched Product to the Cart
    When user select a product from the search results
    And user click the "Add to Cart" button
    Then user verify that the "Added to Cart" message appears

  @smoke1
  Scenario:  Validate the Cart to Ensure the Correct Product is Added
    Then user verify the product details (name, quantity, price) in the cart.
    And user validate that the product name in the cart matches the product selected earlier
    And user verify the quantity and price are correctly displayed.



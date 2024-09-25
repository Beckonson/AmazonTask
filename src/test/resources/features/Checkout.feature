Feature: Checkout Process  functionality

  Background:
    #Given user  navigate to Amazon web home page
    When user enters the full name of a product
    And user clicks on search button
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    When user applies a brand filter "Acer"
    And user applies a price filter between $500 and $1000
    When user select a product from the search results
    And user click the "Add to Cart" button
    Then user verify that the "Added to Cart" message appears
    And user validate the product details (name, quantity, price) in the cart

  @smoke2
  Scenario: Proceed to checkout
    When user click Proceed to checkout

  @smoke2
  Scenario: Validating Each Step of the Checkout Process
    When user click Proceed to checkout
    And user enter  valid  username and password
    And  user validate shipping address
    Then user click Proceed to payment



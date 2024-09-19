Feature: Search and Filter Product functionality

  Scenario:  Search Product by Name
    Given user  navigate to Amazon web home page
    When user enters the full name of a product gaming laptop
    And user clicks on search button
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    And user verify first 5 search results should be relevant to the search term "gaming laptop," and their titles should contain keywords related to the product.

  Scenario:  Apply Price Filter
    Given user  navigate to Amazon web home page
    When user enters the full name of a product gaming laptop
    And user clicks on search button
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    When user applies a price filter between $500 and $1000
    Then user should see all listed products fall within this price range

  Scenario:  Apply Brand filter
    Given user  navigate to Amazon web home page
    When user enters the full name of a product gaming laptop
    And user clicks on search button
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    When user applies a brand filter between "Acer"
    Then user should see all listed products  belong to the "Acer" brand

  Scenario:  Combines both price and brand filters
    Given user  navigate to Amazon web home page
    When user enters the full name of a product gaming laptop
    And user clicks on search button
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    When user applies a price range of $500-$1000 and brand "Acer",
    Then user should see all results meet both criteria

  Scenario:  Searches for an invalid product name
    Given user  navigate to Amazon web home page
    When user enters the full name of a product gaming laptop
    And user clicks on search button
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    When user applies a price range of $500-$1000 and brand "Acer",
    Then user should see all results meet both criteria




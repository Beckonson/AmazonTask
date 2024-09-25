Feature: Search and Filter Product functionality

  Background:
    #Given user  navigate to Amazon web home page
    When user enters the full name of a product
    And user clicks on search button

  @smoke
  Scenario:  Search Product by Name
    Then user should see relevant products that match the search term "gaming laptop" in the search results

  @smoke
  Scenario:  Validate search result
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    And user validates search result

  @smoke
  Scenario:  Apply Price Filter
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    And user validates search result
    When user applies a price filter between $500 and $1000
    Then user should see all listed products fall within this price range

  @smoke
  Scenario:  Apply Brand Filter
    Then user should see relevant products that match the search term "gaming laptop" in the search results
    And user validates search result
    When user applies a brand filter "Acer"
    Then user should see all listed products  belong to the "Acer" brand







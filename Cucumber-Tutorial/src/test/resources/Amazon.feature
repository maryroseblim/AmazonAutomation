Feature: Amazon Search Item
  I want to sort the search reult without clicking the sort button


  Scenario: Search IPhone
    Given Open URl "https://www.amazon.com"
    When user search for "iPhone"
    And Refine the results to show only items under the Cell Phones department
    And Refine results to show only items ranging from "400" to "500"
    Then Take the first 5 results then sort their prices by highest to lowest in Java, without using Sort by Price feature on Amazon's website.
#    And Print all the product names after sorting.

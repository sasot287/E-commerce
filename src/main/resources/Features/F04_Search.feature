@smoke
Feature: F04_search | users could search for product
Scenario Outline: user could search using product name
  Given user go to Home page and click in search textbox
When user enter"<product>"
Then search result will appear
Examples:
| product |
| book |
| laptop |
| nike |



  Scenario Outline: user could search using sku
    Given user go to Home page and click in search textbox
    When user enter"<sku>"
    Then click on the product in search result
    Then search by sku result will appear
    Examples:
      | sku |
      | AP_MBP_13 |

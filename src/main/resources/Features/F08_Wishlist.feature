@smoke
Feature: F08_wishlist | users could add prodct wishlist
  Scenario: user add item to wishlist
    When user click Add to wish
    Then  success message "The product has been added to your wishlist" will appear

  Scenario: cont item in wishlist
    When user click Add to wish
    Then  user click wishlist link
    Then Qty is bigger than zero

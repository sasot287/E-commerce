@smoke
Feature: F05_hover | verify the sub-category title is (equal or contains) to sub-category text

  Scenario: the sub-category title contains sub-category text
    Given user  go to Home page
    When user hover Computers item and click "Desktops"
    Then the sub-category page title contains sub-category text
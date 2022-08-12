@smoke
Feature: F03_currencies | verify Euro Symbol (€) is shown on the 4 products displayed in Home page

  Scenario: Symbol (€) is shown on the 4 products displayed in Home page
    When user press on CHome pageurrencyList and choose"Euro"
    Then Symbol "€"is shown on the 4 products displayed in Home page
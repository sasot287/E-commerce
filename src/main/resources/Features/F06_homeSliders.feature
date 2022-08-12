@smoke
Feature: first slider | verify first slider is clickable on home page

  Scenario: first slider is clickable on home pag
    When user  click on first slider
    Then  first slider to direct user to this url "https://demo.nopcommerce.com/nokia-lumia-1020"

  Scenario: seconed slider is clickable on home pag
    When user  click on seconed slider
    Then  first slider to direct user to this url "https://demo.nopcommerce.com/iphone-6"
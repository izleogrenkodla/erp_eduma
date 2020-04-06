Feature: Validate shop page

  Scenario Outline: Validate <prod> product click
    Given I am on the application url
    And I click on the menu option "SHOP"
    When I click on product name "<prod>"
    Then I should see "<prod>"  product description
  Examples:
  |prod|
  |Bracelet|
  |Brauhaus|
  |Buschla|
  |Chutney|
  |Corkscrew|
  |Cup crown pattern|
  |Cup princely break|
  |Daham|
  |Funka|
  |Fursten hutchen|
  |Karton|
@shop
  Scenario Outline: Validate <product> product click on next page
    Given I am on the application url
    And I click on the menu option "SHOP"
    And I scroll down to bottom and click on next page
    When I click on product name "<product>"
    Then I should see "<product>"  product description
  Examples:
  |product|
  |Keychains|
  |Klappkarte kreuzstich|
  |Luggage tag|
  |Princely pencil|
  |Smartphone cases|
  |Wood postcard|

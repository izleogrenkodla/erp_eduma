Feature: Validate shop page

  Scenario Outline: Validate <product> product click
    Given I am on the application url
    And I click on the menu option "SHOP"
    When I click on product name "<product>"
    Then I should see "<product>"  product description
  Examples:
  |product|
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
  |Klappkarte kreuzstich|
  |Keychains|
  |Klappkarte kreuzstich|
  |Luggage tag|
  |Princely pencil|
  |Smartphone cases|
  |Wood postcard|

  Scenario: Validate product checkout
    Given I am on the application url
    And I click on the login button
    And I enter the username as "testing" and password as "4vzdIu9XMUW)ubtU*V#EYjo9" and click on login button
    And I should be successfully logged in and be on home page
    And I click on the menu option "SHOP"
    And I hover over the cart icon of "Daham" product and click it
    And I click on view cart button of "Daham" product
    And I click on proceed to checkout button
    And I enter my billing details first name as "testing" last name as "UK" company name as "ERP" country as "United Kingdom (UK)" order notes as "deliver asap" street address as "112" and "home" town as "Ilford" country as "London" postcode as "E125LP" phone no as "07878434567" email as "sethuraman.cse@sathyabama.ac.in" and payment as "Instamojo"
    When I click on place order
    Then I should see success message

    Scenario: Validate add cart button
      Given I am on the application url
      And I click on the menu option "SHOP"
      And I click on product name "Funka"
      And I should see "Funka"  product description
      When I click on add to cart button
      Then I should be able to add the product to cart

    Scenario: Validate view cart button
      Given I am on the application url
      And I click on the menu option "SHOP"
      And I click on product name "Bracelet"
      And I should see "Bracelet"  product description
      And I click on add to cart button
      When I click on view cart button
      Then I should see the cart page


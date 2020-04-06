Feature: Validate Paid type

  Scenario Outline:Validate <course> link in All course section
    Given I am on the application url
    And I hover over the menu option as "COURSES"
    And I select the submenu option as "Paid Type"
    When I click on "<course>" link  in course section
    Then I should be on "<course>" course page

  Examples:
  |course|
  |BACKEND|
  |CSS|
  |FRONTEND|
  |GENERAL|
  |IT & SOFTWARE|
  |PHOTOGRAPHY|
  |PROGRAMMING LANGUAGE|
  |TECHNOLOGY|
  @paidtype
  Scenario: Validate course checkout
    Given I am on the application url
    And I hover over the menu option as "COURSES"
    And I select the submenu option as "Paid Type"
    And I click on checkout button under course name
    And I enter the username as "testing" and password as "4vzdIu9XMUW)ubtU*V#EYjo9" and click on login button
    And I enter my billing details first name as "testing" last name as "UK" company name as "ERP" country as "United Kingdom (UK)" order notes as "deliver asap" street address as "112" and "home" town as "Ilford" country as "London" postcode as "E125LP" phone no as "07878434567" email as "sethuraman.cse@sathyabama.ac.in" and payment as "Instamojo"
    When I click on place order
    Then I should see success message
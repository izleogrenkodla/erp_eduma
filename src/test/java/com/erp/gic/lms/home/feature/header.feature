Feature: Validate header functionality in home page

  Scenario Outline: Validate the <menu> header option with <submenu> submenu
    Given I am on the application url
    And I hover over the menu option as "<menu>"
    When I select the submenu option as "<submenu>"
    Then I should be on "<option>" page

    Examples:
      |menu|submenu|option|
      |COURSES|Free Access Type|GENERAL|
      |COURSES|Other Free Type|TECHNOLOGY|
      |COURSES|Paid Type|BACKEND|
      |COURSES|Other Paid Type|TECHNOLOGY|
      |COURSES|Courses Archive|ALL COURSES|
      |COURSES|Demo Accounts|DEMO ACCOUNTS|
      |COURSES|Become an Instructor|BECOME A TEACHER|
      |COURSES|Instructor Profile||
      |FEATURES|Gallery|GALLERY|
      |FEATURES|About Us|ABOUT US|
      |FEATURES|FAQs|FAQ PAGE|
  @header
  Scenario Outline: Validate <menu> header option click
    Given I am on the application url
    When I click on the menu option "<menu>"
    Then I should be on "<option>" page

    Examples:
      |menu|option|
      |HOME|HOME|
      |COURSES|ALL COURSES|
      |EVENTS|EVENTS|
      |PORTFOLIO|PORTFOLIO MASONRY|
      |BLOG|BLOG|
      |CONTACT|CONTACT|
      |SHOP|SHOP|

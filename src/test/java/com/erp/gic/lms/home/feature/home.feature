Feature: As a user
          I need to validate Home Page

  Scenario: Validate the valid search functionality
    Given I am on the application url
    When I enter the search result as "Java" and select course from dropdown
    Then I should see the selected course detail

    Scenario: Validate the invalid search functionality
      Given I am on the application url
      When I enter the search result as "Jobs"
      Then I should see no course found in dropdown

  Scenario: Validate scroll down button on home image to view collection list
    Given I am on the application url
    When I click on the scroll down button
    Then I should see the collection list

  Scenario Outline: Validate collection section courses
    Given I am on the application url
    When I click on the collection course "<course name>"
    Then I should be on collection page

    Examples:
      |course name|
      |Education WordPress Theme|
      |Best Courses for Photography|
      |Top Tutorials Code for Startup|
      |The Top PHP Tutorials|

  Scenario Outline: Validate the head option with submenu
    Given I am on the application url
    When I hover over the menu option as "<menu>" and select the submenu option as "<submenu>"
    Then I should be on the selected option page

    Examples:
      |menu|submenu|
      |COURSES|Free Access Type|
      |COURSES|Other Free Type|
      |COURSES|Paid Type|
      |COURSES|Other Paid Type|
      |COURSES|Courses Archive|
      |COURSES|Demo Accounts|
      |COURSES|Become an Instructor|
      |COURSES|Instructor Profile|
      |FEATURES|Gallery|
      |FEATURES|About Us|
      |FEATURES|FAQs|

    Scenario Outline: Validate header option click
      Given I am on the application url
      When I click on the menu option "<menu>"
      Then I should be on the selected option page

      Examples:
      |menu|
      |COURSES|
      |EVENTS|
      |PORTFOLIO|
      |BLOG|
      |CONTACT|
      |SHOP|




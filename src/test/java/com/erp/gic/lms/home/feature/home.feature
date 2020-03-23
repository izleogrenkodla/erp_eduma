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


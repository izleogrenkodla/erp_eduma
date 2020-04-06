Feature: Validate Home Page

  Scenario: Validate the valid search functionality
    Given I am on the application url
    And I enter the search result as "Java"
    When I select the first course from drop list
    Then I should see the selected course detail

  Scenario: Validate the invalid search functionality
    Given I am on the application url
    When I enter the invalid search result as "Jobs"
    Then I should see no course found in drop list

  Scenario: Validate scroll down button on home image to view collection list
    Given I am on the application url
    When I click on the scroll down button
    Then I should see the collection list

  Scenario Outline: Validate <collection name> collection section courses
    Given I am on the application url
    When I click on the collection course "<collection name>"
    Then I should be on collection page
    Examples:
      |collection name|
      |Education WordPress Theme|
      |Best Courses for Photography|
      |Top Tutorials Code for Startup|
      |The Top PHP Tutorials|
  @home
  Scenario: Validate image click on what people say section
    Given I am on the application url
    When I scroll down to what people say section and click on person image
    Then I should see information about what they say

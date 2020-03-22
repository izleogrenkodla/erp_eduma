Feature: As a user
          I need to validate the search functionality

  Scenario: Validate the valid search functionality
    Given I am on the application url
    When I enter the search result as "Java" and select course from dropdown
    Then I should see the selected course detail
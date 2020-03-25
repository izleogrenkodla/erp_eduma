Feature: As a user validate the login

  Scenario: Check the Functionality of Other Free Types in  Courses menu

    Given I am on the application url
    When I hover over the COURSES menu and select Other Free Types submenu option
    Then I should be on the technology page
    And I click on the Admin link
    Then I should redirect to profile page




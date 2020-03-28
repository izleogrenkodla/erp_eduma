Feature: As a user
          I need to validate Become an instructor page

  Scenario Outline: Validate become an Instructor tab
    Given I am on the application url
    When I hover over the menu option as "COURSES" and select the submenu option as "Become an Instructor"
    Then I should be on "BECOME A TEACHER" page
    When I go to "<tab>" and click on it
    Then I should see "<selected tab>" information

    Examples:
    |tab|selected tab|
    |Become an Instructor|Instructor|
    |Instructor Rules|Rules|
    |Start with courses|Course|




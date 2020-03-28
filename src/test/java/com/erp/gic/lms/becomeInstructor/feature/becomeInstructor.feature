Feature: Validate Become an instructor page

@instructor
  Scenario Outline: Validate <tab> tab on become an Instructor Page
    Given I am on the application url
    And I hover over the menu option as "COURSES"
    And I select the submenu option as "Become an Instructor"
    When I go to "<tab>" and click on it
    Then I should see "<selected tab>" information

    Examples:
    |tab|selected tab|
    |Become an Instructor|Instructor|
    |Instructor Rules|Rules|
    |Start with courses|Course|




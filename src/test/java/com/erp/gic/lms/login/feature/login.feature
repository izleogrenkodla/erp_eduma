Feature: As a user validate the login

  Scenario: Login functionality

    Given I am on the application url
    When I click on the login button
    And I enter the username as "testing" and password as "4vzdIu9XMUW)ubtU*V#EYjo9" and click on login button
    Then I should be successfully logged in and be on home page

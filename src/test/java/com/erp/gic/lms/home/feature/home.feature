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

  Scenario Outline: Validate the header option with submenu
    Given I am on the application url
    When I hover over the menu option as "<menu>" and select the submenu option as "<submenu>"
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

  Scenario Outline: Validate header option click
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

  Scenario Outline: Validate popular course section
    Given I am on the application url
    When I hover over the "<course name>" and click read more button
    Then I should be redirected to "<course name>" page
    Examples:
      |course name|
      |Introduction LearnPress – LMS plugin|
      |Learn Python – Interactive Python Tutorial|
      |Your Complete Guide to Photography|
      |Learning jQuery Mobile for Beginners|
      |Become a PHP Master and Make Money Fast|
      |The Art of Black and White Photography|
      |HTML5/CSS3 Essentials in 4-Hours|
      |Complete Beginner to JavaScript Developer|

  Scenario Outline: Validate popular course section
    Given I am on the application url
    When I hover over the "<course name>" and click read more button
    Then I should be redirected to "<course name>" page
    Examples:
      |course name|
      |Introduction LearnPress – LMS plugin|
      |Learn Python – Interactive Python Tutorial|
      |Your Complete Guide to Photography|
      |Learning jQuery Mobile for Beginners|
      |Become a PHP Master and Make Money Fast|
      |The Art of Black and White Photography|
      |HTML5/CSS3 Essentials in 4-Hours|
      |Complete Beginner to JavaScript Developer|

  Scenario Outline: Validate course name link
    Given I am on the application url
    When I click on the "<course>" name
    Then I should be redirected to "<course>" page

    Examples:
      |course|
      |Introduction LearnPress – LMS plugin|
      |Learn Python – Interactive Python Tutorial|
      |Your Complete Guide to Photography|
      |Learning jQuery Mobile for Beginners|
      |Become a PHP Master and Make Money Fast|
      |The Art of Black and White Photography|
      |HTML5/CSS3 Essentials in 4-Hours|
      |Complete Beginner to JavaScript Developer|

  Scenario Outline: Validate course name link
    Given I am on the application url
    When I click on the admin link of "<course>"
    Then I should be redirected to profile page

    Examples:
      |course|
      |Introduction LearnPress – LMS plugin|
      |Learn Python – Interactive Python Tutorial|
      |Your Complete Guide to Photography|
      |Learning jQuery Mobile for Beginners|
      |Become a PHP Master and Make Money Fast|
      |The Art of Black and White Photography|
      |HTML5/CSS3 Essentials in 4-Hours|
      |Complete Beginner to JavaScript Developer|

    Scenario: Validate view all button on home Page
      Given I am on the application url
      When I click on the view all button
      Then I should be on "<ALL COURSES>" page

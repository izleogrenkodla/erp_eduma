Feature: Validate the popular course section on home page

  Scenario Outline: Validate <course name> in popular course section
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

  Scenario Outline: Validate <course> link in popular section
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

  Scenario Outline: Validate admin name link in <course> in popular course section
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
  @popular
  Scenario: Validate view all button on home Page
    Given I am on the application url
    When I click on the view all button
    Then I should be on "<ALL COURSES>" page
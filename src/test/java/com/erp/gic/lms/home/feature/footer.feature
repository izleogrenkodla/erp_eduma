Feature: Validate the footer section

  Scenario Outline: Validate the footer <link> link in <category> section
    Given  I am on the application url
    When I scroll to the footer section and click on "<link>" link under "<category>"
    Then I should be on "<selected link>" page

    Examples:
      |link|category|selected link|
      |About Us|COMPANY|ABOUT US|
      |Blog|COMPANY|BLOG|
      |Contact|COMPANY|CONTACT|
      |Become a Teacher|COMPANY|BECOME A TEACHER|
      |Courses|LINKS|ALL COURSES|
      |Events|LINKS|EVENTS|
      |Gallery|LINKS|GALLERY|
      |FAQs|LINKS|FAQ PAGE|
      |Documentation|SUPPORT|Phys code|
      |Forums|SUPPORT|THIMPRESS|
      |Language Packs|SUPPORT|HOME|
      |Release status|SUPPORT|HOME|
      |WordPress|RECOMMEND|envarto Market Page|
      |LearnPress|RECOMMEND|WordPress.Org|
      |WooCommerce|RECOMMEND|SHOP|
      |bbPress|RECOMMEND|envarto Market Page|
  @footer
  Scenario Outline: Validate the <link> link in footer
    Given  I am on the application url
    When I click on "<link>" on footer section
    Then I should be on "<selected link>" page

    Examples:
    |link|selected link|
    |Privacy|Home|
    |Terms|Home|
    |Sitemap|Home|
    |Purchases|envarto Market Page|
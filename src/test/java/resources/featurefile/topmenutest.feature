Feature: Top Menu Test
  As a user I want to navigate the nopcommerce website Top Menu Bar

  @Regression @Smoke
  Scenario Outline: I should navigate to any tab of the top menu bar
    Given I am on the homepage
    When I click on "<menu>"
    Then I should verify the tab "<menu>"
    Examples:
      |menu       |
      |Computers  |
      |Electronics|
      |Apparel    |
      |Books      |

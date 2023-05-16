Feature: Top Menu Test
  As a user I want to navigate the nopcommerce website Top Menu Bar

  @Regression @Smoke
  Scenario: I should verify product is arranged in alphabetical order
    Given I am on the homepage
    And I hover on "Electronics"
    And I click on tab "Cell phones"
    Then I should verify the cell phones text "Cell phones"

  @Regression @Sanity
  Scenario: I should verify product is added successfully and order placed successfully
    Given I am on the homepage
    And I hover on "Electronics"
    And I click on tab "Cell phones"
    And I verify the cell phones text "Cell phones"
    And I click on list view tab
    And I click on phone product "Nokia Lumia 1020"
    And I verify the phone text "Nokia Lumia 1020"
    And I verify the price "$349.00"
    And I change the phone quantity to "2"
    And I click on add to cart button
    And I verify the product message "The product has been added to your shopping cart"
    And I close the success message
    And I click on go to cart button
    And I verify the message "Shopping cart"
    And I verify the phone quantity is "2"
    And I verify the total price "$698.00"
    And I click on checkbox I agree with the terms of service
    And I click on checkout
    And I verify the homepage welcome text "Welcome, Please Sign In!"
    And I click on register tab
    And I verify the register text "Register"
    And I register first name "DP"
    And I register last name "Patel"
    And I register email "DPPatel"
    And I enter registration password "AimHigh123"
    And I enter registration confirmation password "AimHigh123"
    And I click on register button
    And I verify the registration complete message "Your registration completed"
    And I click on continue after registration completed
    Then I should verify product is added successfully



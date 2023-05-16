Feature: Test Suite
  As a user I want to add an item to the shopping cart

  @Regression @Smoke
  Scenario: I should verify product is arranged in alphabetical order
    Given I am on the homepage
    And I click on computers
    And I click on desktop
    And I select sort by position "Name: Z to A"
    Then I should verify the products are arranged in descending order

  @Regression @Sanity
  Scenario: I should verify product is added to shopping cart successfully
    Given I am on the homepage
    And I click on computers
    And I click on desktop
    And I select sort by ascending position "Name: A to Z"
    And I click on add to cart for build your own computer
    And I verify the computer text "Build your own computer"
    And I select processor "2.2 GHz Intel Pentium Dual-Core E2200"
    And I select ram "8GB [+$60.00]"
    And I select HDD "400 GB [+$100.00]"
    And I select OS "Vista Premium [+$60.00]"
    And I select two boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    And I verify the computer price "$1,475.00"
    And I click on add to cart button
    And I verify the shopping cart message "The product has been added to your shopping cart"
    And I close the success message
    And I click on go to cart button
    And I verify the message "Shopping cart"
    And I change the quantity to "2"
    And I update the cart
    And I verify the quantity is "2"
    And I verify the total is "$2,950.00"
    And I click on checkbox I agree with the terms of service
    And I click on checkout
    And I verify text "Welcome, Please Sign In!"
    And I click on checkout as guest
    And I enter first name "DP"
    And I enter last name "Patel"
    And I enter email "DPPatel123"
    And I select country name "United States"
    And I select state name "Arizona"
    And I enter city name "London"
    And I enter address "10 ABC Road"
    And I enter postcode "NW10 0UP"
    And I enter phone number "07867865734"
    And I click on continue button after mandatory fields
    And I click on next day air radio button
    And I click on continue button after shipping
    And I select card payment
    And I click continue after card payment details
    And I select credit card "Master card"
    And I enter cardholder name "Miss DP Patel"
    And I enter card number "5555555555554444"
    And I enter month expiry "02"
    And I enter year expiry "2026"
    And I enter CVV "123"
    And I click continue after details
    And I verify payment method "Credit Card"
    And I verify shipping method "Next Day Air"
    And I verify the checkout total is "$2,950.00"
    And I click on confirm button
    And I verify the "Thank you" text
    And I verify the order message "Your order has been successfully processed!"
    And I click on continue after order processed
    And I verify the welcome text "Welcome to our store"
    Then I should be able to verify product is added to the shopping cart successfully




package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class TestSuiteTestSteps {
    @And("^I click on computers$")
    public void iClickOnComputers() throws InterruptedException{
        Thread.sleep(100);
        new HomePage().hoverOnComputerTab();
    }
    @And("^I click on desktop$")
    public void iClickOnDesktop()throws InterruptedException {
        Thread.sleep(100);
        new HomePage().clickOnDesktopTab();
    }

    @And("^I select sort by position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String sortBy) {
        new DesktopPage().sortByZtoA("Name: Z to A");
    }

    @Then("^I should verify the products are arranged in descending order$")
    public void iShouldVerifyTheProductsAreArrangedInDescendingOrder() {
        Assert.assertEquals("not sorted Z to A", new DesktopPage().beforeSorting(), new DesktopPage().afterSorting());
    }

    @And("^I select sort by ascending position \"([^\"]*)\"$")
    public void iSelectSortByAscendingPosition(String sortBy) throws Throwable {
        new DesktopPage().selectSortByAtoZ("Name: A to Z");
    }

    @And("^I click on add to cart for build your own computer$")
    public void iClickOnBuildYourOwnComputerProduct() throws InterruptedException {
        Thread.sleep(500);
        new DesktopPage().addToCart();
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new ProductPage().clickAddToCartButton();
    }

    @And("^I verify the computer text \"([^\"]*)\"$")
    public void iVerifyTheComputerText(String text) {
        Assert.assertEquals("computer text not displayed", text, new ProductPage().getBuildYourOwnComputerText());
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String text) throws InterruptedException {
        new ProductPage().selectProcessor(text);
    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String text) throws InterruptedException {
        new ProductPage().selectRAM(text);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String text) throws InterruptedException {
        new ProductPage().clickHDD();
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String text) throws InterruptedException {
        new ProductPage().clickOS();
    }

    @And("^I select two boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSelectTwoBoxesAnd(String text1, String text2) throws InterruptedException {
        new ProductPage().clickTotalCommander();
    }

    @And("^I verify the computer price \"([^\"]*)\"$")
    public void iVerifyTheComputerPrice(String text) throws InterruptedException {
        Assert.assertEquals("Price doesnt match", text, new ProductPage().getTextActualPrice());
    }

    @And("^I verify the shopping cart message \"([^\"]*)\"$")
    public void iVerifyTheShoppingCartMessage(String text) {
        Assert.assertEquals("message doesnt appear", text, new ProductPage().getSuccessfullyAddedMessage());
    }
    @And("^I verify the successfully added to shopping cart message \"([^\"]*)\"$")
    public void iVerifyTheSuccessfullyAddedToShoppingCartMessage(String text) throws Throwable {
        Assert.assertEquals("successfully added message doesnt appear",text, new CheckoutPage().getTextOrderSuccessfullyPlaced());
    }

    @And("^I close the success message$")
    public void iCloseTheSuccessMessage() {
        new ProductPage().closeSuccessMessage();
    }

    @And("^I click on go to cart button$")
    public void iClickOnGoToCartButton() {
        new ProductPage().mouseHoverOnShoppingCart();
        new ProductPage().clickOnGoToCart();
    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String text) throws Throwable {
        Assert.assertEquals("shopping cart not verified", text, new ShoppingCartPage().getShoppingCartMessage());
    }

    @And("^I change the quantity to \"([^\"]*)\"$")
    public void iChangeTheQuantityTo(String num) throws Throwable {
        new ShoppingCartPage().clearQuantity();
        new ShoppingCartPage().sendQuantity(num);
    }

    @And("^I update the cart$")
    public void iUpdateTheCart() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @And("^I verify the quantity is \"([^\"]*)\"$")
    public void iVerifyTheQuantityIs(String text) throws Throwable {
        Assert.assertEquals("quantity not verified", text, new ShoppingCartPage().getQuantity());
    }

    @And("^I verify the total is \"([^\"]*)\"$")
    public void iVerifyTheTotalIs(String text) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals("total not verified", text, new ShoppingCartPage().getTotalPriceShoppingCart());
    }

    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnTermsOfService();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String text) {
        Assert.assertEquals("welcome text not verified", text, new SignInPage().getWelcomeText());
    }

    @And("^I click on checkout as guest$")
    public void iClickOnCheckoutAsGuest() throws InterruptedException {
        new SignInPage().clickCheckoutAsGuest();
    }
    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().sendFirstName(firstName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().sendLastName(lastName);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().sendEmail(email);
    }

    @And("^I select country name \"([^\"]*)\"$")
    public void iSelectCountryName(String countryName) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().selectCountryName(countryName);
    }

    @And("^I select state name \"([^\"]*)\"$")
    public void iSelectStateName(String stateName) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().selectStateName(stateName);
    }
    @And("^I enter city name \"([^\"]*)\"$")
    public void iEnterCityName(String cityName) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().sendCityName(cityName);
    }
    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().sendAddressName(address);
    }

    @And("^I enter postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postCode) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().sendPostCode(postCode);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phoneNumber) throws InterruptedException {
        Thread.sleep(100);
        new CheckoutPage().sendPhoneNumber(phoneNumber);
    }
    @And("^I click on continue button after mandatory fields$")
    public void iClickOnContinueButtonAfterMandatoryFields() {
        new CheckoutPage().clickContinueAfterRegistrationBilling();
    }

    @And("^I click on next day air radio button$")
    public void iClickOnNextDayAirRadioButton() {
        new CheckoutPage().clickRadioShipping();
    }

    @And("^I click on continue button after shipping$")
    public void iClickOnContinueButtonAfterShipping() {
        new CheckoutPage().clickContinueFromShipping();
    }

    @And("^I select card payment$")
    public void iSelectCardPayment() throws InterruptedException{
        Thread.sleep(200);
        new CheckoutPage().selectPaymentTypeRadioButton();
    }
    @And("^I click continue after card payment details$")
    public void iClickContinueAfterCardPaymentDetails() {
        new CheckoutPage().clickContinueAfterPaymentMethod();
    }
    @And("^I select credit card \"([^\"]*)\"$")
    public void iSelectCreditCard(String paymentMethodOption) throws Throwable {
        new CheckoutPage().selectCardType(paymentMethodOption);
    }

    @And("^I enter cardholder name \"([^\"]*)\"$")
    public void iEnterCardholderName(String name) throws Throwable {
        new CheckoutPage().sendCardholderName(name);
    }

    @And("^I enter card number \"([^\"]*)\"$")
    public void iEnterCardNumber(String cardNumber) throws Throwable {
        new CheckoutPage().sendCardNumber(cardNumber);
    }

    @And("^I enter month expiry \"([^\"]*)\"$")
    public void iEnterMonthExpiry(String month) throws Throwable {
        new CheckoutPage().selectExpiryMonth(month);
    }

    @And("^I enter year expiry \"([^\"]*)\"$")
    public void iEnterYearExpiry(String year) throws Throwable {
        new CheckoutPage().selectExpiryYear(year);
    }

    @And("^I enter CVV \"([^\"]*)\"$")
    public void iEnterCVV(String cVV) throws Throwable {
        new CheckoutPage().sendCVVCode(cVV);
    }

    @And("^I click continue after details$")
    public void iClickContinueAfterDetails() {
        new CheckoutPage().clickContinueAfterBilling();
    }

    @And("^I verify payment method \"([^\"]*)\"$")
    public void iVerifyPaymentMethod(String text) throws Throwable {
        Assert.assertEquals("payment method doesnt match",text,new CheckoutPage().getTextPaymentMethod());
    }

    @And("^I verify shipping method \"([^\"]*)\"$")
    public void iVerifyShippingMethod(String text) throws Throwable {
        Assert.assertEquals("shipping method doesnt match",text,new CheckoutPage().getTextShippingMethod());
    }

    @And("^I verify the checkout total is \"([^\"]*)\"$")
    public void iVerifyTheCheckoutTotalIs(String text) throws Throwable {
        Assert.assertEquals("checkout total doesnt match",text,new CheckoutPage().getTextExpectedTotalAmount());
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() {
        new CheckoutPage().clickConfirm();
    }

    @And("^I verify the \"([^\"]*)\" text$")
    public void iVerifyTheText(String text) throws Throwable {
        Assert.assertEquals("Thank you text not appearing",text,new CheckoutPage().getTextThankYou() );
    }

    @And("^I verify the order message \"([^\"]*)\"$")
    public void iVerifyTheOrderMessage(String text) throws Throwable {
        Assert.assertEquals("order message not appearing",text,new CheckoutPage().getTextOrderSuccessfullyPlaced() );
    }
    @And("^I click on continue after order processed$")
    public void iClickOnContinueAfterOrderProcessed() {
        new CheckoutPage().clickContinueAfterOrderPlaced();
    }
    @And("^I verify the welcome text \"([^\"]*)\"$")
    public void iVerifyTheWelcomeText(String text) throws InterruptedException {
        Thread.sleep(200);
        Assert.assertEquals("welcome text not displayed",text,new HomePage().getWelcomeToOurStoreText());
    }
    @Then("^I should be able to verify product is added to the shopping cart successfully$")
    public void iShouldBeAbleToVerifyProductIsAddedToTheShoppingCartSuccessfully() {
    }
    @Given("^I click on computers$")
    public void i_click_on_computers()  {

    }

    @Given("^I click on desktop$")
    public void i_click_on_desktop()  {

    }

    @Given("^I select sort by position \"([^\"]*)\"$")
    public void i_select_sort_by_position(String arg1) {
    }

    @Then("^I should verify the products are arranged in descending order$")
    public void i_should_verify_the_products_are_arranged_in_descending_order()  {

    }

    }




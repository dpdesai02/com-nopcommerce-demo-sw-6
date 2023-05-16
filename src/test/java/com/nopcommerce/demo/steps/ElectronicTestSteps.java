package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ElectronicTestSteps {


    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }

    @And("^I hover on \"([^\"]*)\"$")
    public void iHoverOn(String arg0)  {
        new HomePage().hoverOnElectronics();
    }

    @And("^I click on tab \"([^\"]*)\"$")
    public void iClickOnTab(String arg0){
        new HomePage().clickOnCellPhones();
    }

    @Then("^I should verify the cell phones text \"([^\"]*)\"$")
    public void iShouldVerifyTheCellPhonesText(String arg0)  {
        Assert.assertEquals("cell phones text not displayed",new CellPhonesPage().getCellPhonesText());

    }

    @And("^I verify the cell phones text \"([^\"]*)\"$")
    public void iVerifyTheCellPhonesText(String text)  {
        Assert.assertEquals("cell phones text not displayed",text,new CellPhonesPage().getCellPhonesText());
    }

    @And("^I click on list view tab$")
    public void iClickOnListViewTab() {
        new CellPhonesPage().clickListTab();
    }

    @And("^I click on phone product \"([^\"]*)\"$")
    public void iClickOnPhoneProduct(String text)  {
        new CellPhonesPage().clickOnNokiaLumia();
    }

    @And("^I verify the phone text \"([^\"]*)\"$")
    public void iVerifyThePhoneText(String text)  {
        Assert.assertEquals("phone text not verified",text,new ProductPage().getNokiaLumiaText());
    }

    @And("^I verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String text) throws Throwable {
        Assert.assertEquals("price not verified",text,new ProductPage().getNokiaLumiaPrice());

    }

    @And("^I change the phone quantity to \"([^\"]*)\"$")
    public void iChangeThePhoneQuantityTo(String num)  {
        new ProductPage().clearQuantity();
        new ProductPage().sendQuantity(num);
    }

    @And("^I verify the product message \"([^\"]*)\"$")
    public void iVerifyTheProductMessage(String text) {
        Assert.assertEquals("product added message not displayed",text,new ProductPage().getSuccessfullyAddedMessage());
    }

    @And("^I verify the phone quantity is \"([^\"]*)\"$")
    public void iVerifyThePhoneQuantityIs(String num) throws Throwable {
        Assert.assertEquals("phone quantity not verified", num, new ShoppingCartPage().getQuantity());
    }

    @And("^I verify the total price \"([^\"]*)\"$")
    public void iVerifyTheTotalPrice(String num) throws Throwable {
        Assert.assertEquals("total price not verified", num, new ShoppingCartPage().getTotalPriceShoppingCart());
    }

    @And("^I click on register tab$")
    public void iClickOnRegisterTab() {
        new SignInPage().clickOnRegister();
    }


    @And("^I verify the homepage welcome text \"([^\"]*)\"$")
    public void iVerifyTheHomepageWelcomeText(String text) {
        try {
            Assert.assertEquals("welcome text not displayed",text,new HomePage().getWelcomeText());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("^I verify the register text \"([^\"]*)\"$")
    public void iVerifyTheRegisterText(String text)  {
        Assert.assertEquals("register text not displayed",text,new RegisterPage().getRegisterText());
    }

    @And("^I register first name \"([^\"]*)\"$")
    public void iRegisterFirstName(String text) throws Throwable {
        new RegisterPage().enterFirstName(text);
    }

    @And("^I register last name \"([^\"]*)\"$")
    public void iRegisterLastName(String text) throws Throwable {
        new RegisterPage().enterLastName(text);
    }

    @And("^I register email \"([^\"]*)\"$")
    public void iRegisterEmail(String text) throws Throwable {
        new RegisterPage().enterEmail(text);
    }

    @And("^I enter registration password \"([^\"]*)\"$")
    public void iEnterRegistrationPassword(String text) throws Throwable {
        new RegisterPage().enterPassword(text);
    }

    @And("^I enter registration confirmation password \"([^\"]*)\"$")
    public void iEnterRegistrationConfirmationPassword(String text) throws Throwable {
        new RegisterPage().enterConfirmPassword(text);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickRegisterButton();
    }

    @And("^I verify the registration complete message \"([^\"]*)\"$")
    public void iVerifyTheRegistrationCompleteMessage(String text) throws Throwable {
        Assert.assertEquals("registration complete message not appearing", text,new RegisterPage().registrationCompleteMessage());
    }

    @And("^I click on continue after registration completed$")
    public void iClickOnContinueAfterRegistrationCompleted() {
        new RegisterPage().clickContinueButton();
    }

    @Then("^I should verify product is added successfully$")
    public void iShouldVerifyProductIsAddedSuccessfully() {
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new RegisterPage().clickContinueButton();
    }

    @And("^I close the success message$")
    public void iCloseTheSuccessMessage() {
    }

    @And("^I click on go to cart button$")
    public void iClickOnGoToCartButton() {
        new RegisterPage().clickContinueButton();
    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String arg0) {
    }

    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
    }
}

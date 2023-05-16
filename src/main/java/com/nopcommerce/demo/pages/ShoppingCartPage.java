package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-2 update-cart-button']")
    WebElement updateButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']/strong")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@name='termsofservice']")
    WebElement termsOfService;
    @CacheLookup
    @FindBy(xpath = "//input[@name='termsofservice']")
    WebElement termsOfServiceRadioButton;
    @CacheLookup
    @FindBy(xpath = "//button[@name='checkout']")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//button[@name='checkout']")
    WebElement checkoutButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement welcomeText;

    public String getWelcomeText() {
        log.info("Getting payment method text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public String getShoppingCartMessage() {
        log.info("Getting shopping cart text " + shoppingCartMessage.toString());
        return getTextFromElement(shoppingCartMessage);
    }
    public String verifyShoppingCartMessage() {
        log.info("Getting shopping cart text " + shoppingCartMessage.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void clearQuantity() {
        log.info("Clearing quantity");
        quantity.clear();
    }

    public void sendQuantity(String quantityNum) {
        log.info("Enter quantity "+quantityNum+ "to email field "+quantity.toString());
        sendTextToElement(quantity, quantityNum);
    }

    public void clickOnUpdateShoppingCart() {
        log.info("Clicking on update shopping cart Button " + updateButton.toString());
        clickOnElement(updateButton);
    }

    public String getTotalPriceShoppingCart() throws InterruptedException{
        log.info("Getting total price " + totalPrice.toString());
        Thread.sleep(100);
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService() {
        log.info("Clicking on terms of service " + termsOfService.toString());
        clickOnElement(termsOfService);
    }
    public void selectTermsOfService() {
        log.info("Clicking on terms of service " + termsOfService.toString());
        clickOnElement(termsOfServiceRadioButton);
    }

    public void clickOnCheckout() {
        log.info("Clicking on checkout Button " + checkout.toString());
        clickOnElement(checkout);
    }
    public void clickOnCheckoutButton() {
        log.info("Clicking on checkout Button " + checkout.toString());
        clickOnElement(checkoutButton);
    }

    public String getQuantity() {
        log.info("Getting quantity " + quantity.getAttribute("value"));
        return quantity.getAttribute("value");
    }
}

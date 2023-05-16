package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1" )
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']" )
    WebElement checkoutAsGuest;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]" )
    WebElement registerButton;

    public String getWelcomeText() {
        Reporter.log("Getting welcome text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickCheckoutAsGuest() throws InterruptedException{
        Reporter.log("Clicking on checkout as guest " + checkoutAsGuest.toString());
        Thread.sleep(1000);
        clickOnElement(checkoutAsGuest);
    }
    public void clickOnRegister(){
        Reporter.log("Clicking on register " + registerButton.toString());
        clickOnElement(registerButton);
    }



}

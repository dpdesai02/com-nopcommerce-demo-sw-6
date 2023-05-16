package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]" )
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']" )
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']" )
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']" )
    WebElement radioHDD400GB;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']" )
    WebElement radioOSVistaPremium;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']" )
    WebElement totalCommanderRadio;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']/span" )
    WebElement actualPrice;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-essential']//button[text()='Add to cart']" )
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']/p" )
    WebElement actualProductAddedToShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']/span" )
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]" )
    WebElement shoppingCartHover;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]" )
    WebElement goToCartButton;
    //******************************************************************
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]" )
    WebElement nokiaLumiaText;
    @CacheLookup
    @FindBy(id = "price-value-20" )
    WebElement nokiaLumiaPrice;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20" )
    WebElement quantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20" )
    WebElement addToCartButtonNokia;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]" )
    WebElement successfullyAddedMessage;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]" )
    WebElement successCloseButton;


    public String getBuildYourOwnComputerText() {
        log.info("Getting build your own computer text " + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor(String inputProcessor) throws InterruptedException {
        log.info("selecting processor " + inputProcessor.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(processorDropDown, inputProcessor);
    }

    public void selectRAM(String inputRAM) throws InterruptedException {
        log.info("selecting RAM " + inputRAM.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(ramDropDown, inputRAM);
    }

    public void clickHDD() throws InterruptedException {
        log.info("Clicking on HDD 400GB " + radioHDD400GB.toString());
        Thread.sleep(1000);
        clickOnElement(radioHDD400GB);
    }

    public void clickOS() throws InterruptedException {
        log.info("Clicking on OS Vista Premium " + radioOSVistaPremium.toString());
        Thread.sleep(1000);
        clickOnElement(radioOSVistaPremium);
    }

    public void clickTotalCommander() throws InterruptedException {
        log.info("Clicking on total commander Button " + totalCommanderRadio.toString());
        Thread.sleep(1000);
        clickOnElement(totalCommanderRadio);
    }

    public String getTextActualPrice() throws InterruptedException {
        log.info("Getting actual price text " + actualPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(actualPrice);
    }

    public void clickAddToCartButton() throws InterruptedException {
        log.info("Clicking on add to cart Button " + addToCartButton.toString());
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getProductAddedToCartMessage() {
        log.info("Getting added to cart message " + actualProductAddedToShoppingCart.toString());
        return getTextFromElement(actualProductAddedToShoppingCart);
    }

    public void clickCloseButton() {
        log.info("Clicking on close button " + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void mouseHoverOnShoppingCart() {
        log.info("hovering on shopping cart " + shoppingCartHover.toString());
        mouseHoverToElement(shoppingCartHover);
    }

    public void clickOnGoToCart() {
        log.info("Clicking on go to cart Button " + goToCartButton.toString());
        clickOnElement(goToCartButton);
    }

    public String getNokiaLumiaText() {
        log.info("Getting Nokia Lumia text " + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String getNokiaLumiaPrice() {
        log.info("Getting nokia lumia text " + nokiaLumiaPrice.toString());
        return getTextFromElement(nokiaLumiaPrice);
    }

    public void clearQuantity() {
        log.info("Clearing quantity");
        quantity.clear();
    }

    public void sendQuantity(String inputQuantity) {
        log.info("Enter quantity"+inputQuantity+ "to field "+quantity.toString());
        sendTextToElement(quantity, inputQuantity);
    }

    public void clickaddToCartNokia() throws InterruptedException{
        log.info("Clicking on add to cart" + addToCartButtonNokia.toString());
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButtonNokia);
    }
    public String getSuccessfullyAddedMessage() {
        log.info("Getting successfully added text " + successfullyAddedMessage.toString());
        return getTextFromElement(successfullyAddedMessage);
    }
    public void closeSuccessMessage(){
        log.info("Clicking close on success message " + successCloseButton.toString());
        clickOnElement(successCloseButton);
    }




}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName" )
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName" )
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId" )
    WebElement countrySelect;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId" )
    WebElement stateSelect;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email" )
    WebElement email;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City" )
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1" )
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode" )
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber" )
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']" )
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']" )
    WebElement nextDayRadioButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continueFromShipping;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']" )
    WebElement creditCardPaymentMethod;
    @CacheLookup
    @FindBy(id = "CreditCardType" )
    WebElement paymentMethodDropDown;
    @CacheLookup
    @FindBy(id = "CardholderName" )
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber" )
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']" )
    WebElement expiryMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']" )
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']" )
    WebElement cVV;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']" )
    WebElement continueAfterBilling;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[@class='value']" )
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[@class='value']" )
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']" )
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]" )
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='section order-completed']/div[@class='title']/strong" )
    WebElement orderSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']" )
    WebElement confirmMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']/button[4]" )
    WebElement continueAfterRegistrationBilling;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']" )
    WebElement continueAfterOrderPlaced;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']" )
    WebElement continueAfterPaymentMethod;
    @CacheLookup
    @FindBy(id = "shippingoption_1" )
    WebElement radioSecondDayAir;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]" )
    WebElement logoutLink;





    public void sendFirstName(String inputFirstName) {
        log.info("Enter first name"+inputFirstName+ "to field "+firstName.toString());
        sendTextToElement(firstName, inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        log.info("Enter last name"+inputLastName+ "to field "+lastName.toString());
        sendTextToElement(lastName, inputLastName);
    }

    public void sendEmail(String inputEmail) {
        log.info("Enter email"+inputEmail+ "to email field "+email.toString());
        sendTextToElement(email, inputEmail+getRandomString(3)+"@gmail.com");
    }

    public void selectCountryName(String inputCountry) {
        log.info("selecting " + inputCountry.toString());
        selectByVisibleTextFromDropDown(countrySelect, inputCountry);
    }

    public void selectStateName(String inputstateName) {
        log.info("selecting " + inputstateName.toString());
        selectByVisibleTextFromDropDown(stateSelect, inputstateName);
    }

    public void sendCityName(String inputCityName) {
        log.info("Enter city "+inputCityName+ "to field "+city.toString());
        sendTextToElement(city, inputCityName);
    }

    public void sendAddressName(String inputAddressName) {
        log.info("Enter address"+inputAddressName+ "to address field "+address.toString());
        sendTextToElement(address, inputAddressName);

    }

    public void sendPostCode(String inputPostCode) {
        log.info("Enter postcode"+inputPostCode+ "to field "+postCode.toString());
        sendTextToElement(postCode, inputPostCode);

    }

    public void sendPhoneNumber(String inputPhoneNumber) {
        log.info("Enter phone number"+inputPhoneNumber+ "to field "+phoneNumber.toString());
        sendTextToElement(phoneNumber, inputPhoneNumber);

    }

    public void clickContinue() {
        log.info("Clicking on continue Button " + continueButton.toString());
        clickOnElement(continueButton);

    }

    public void chooseShipping() {
        log.info("Clicking on shipping Button " + nextDayRadioButton.toString());
        clickOnElement(nextDayRadioButton);

    }

    public void clickContinueFromShipping() {
        log.info("Clicking on continue Button " + continueFromShipping.toString());
        clickOnElement(continueFromShipping);

    }

    public void selectPaymentTypeRadioButton() throws InterruptedException {
        log.info("Clicking on credit card payment type radio button " + creditCardPaymentMethod.toString());
        Thread.sleep(200);
        clickOnElement(creditCardPaymentMethod);


    }

    public void selectCardType(String paymentMethodOption) throws InterruptedException {
        log.info("selecting " + paymentMethodOption.toString());
        Thread.sleep(200);
        selectByVisibleTextFromDropDown(paymentMethodDropDown, paymentMethodOption);

    }

    public void sendCardholderName(String inputcardHolderName) {
        log.info("Enter card holder name"+inputcardHolderName+ "to field "+cardHolderName.toString());
        sendTextToElement(cardHolderName, inputcardHolderName);

    }

    public void sendCardNumber(String inputcardNumber) {
        log.info("Enter card number"+inputcardNumber+ "to card number field "+cardNumber.toString());
        sendTextToElement(cardNumber, inputcardNumber);

    }

    public void selectExpiryMonth(String inputExpiryMonth) {
        log.info("selecting " + inputExpiryMonth.toString());
        selectByVisibleTextFromDropDown(expiryMonth, inputExpiryMonth);

    }

    public void selectExpiryYear(String inputExpiryYear) {
        log.info("selecting " + inputExpiryYear.toString());
        selectByVisibleTextFromDropDown(expiryYear, inputExpiryYear);

    }

    public void sendCVVCode(String inputCVV) {
        log.info("Enter CVV code"+inputCVV+ "to field "+cVV.toString());
        sendTextToElement(cVV, inputCVV);

    }

    public void clickContinueAfterBilling() {
        log.info("Clicking on continue Button " + continueAfterBilling.toString());
        clickOnElement(continueAfterBilling);

    }
    public void clickContinueAfterPaymentMethod() {
        log.info("Clicking on continue Button " + continueAfterPaymentMethod.toString());
        clickOnElement(continueAfterPaymentMethod);

    }

    public String getTextPaymentMethod() {
        log.info("Getting payment method text " + paymentMethod.toString());
        return getTextFromElement(paymentMethod);
    }


    public String getTextShippingMethod() {
        log.info("Getting shipping text " + shippingMethod.toString());
        return getTextFromElement(shippingMethod);
    }

    public String getTextExpectedTotalAmount() {
        log.info("Getting expected total amount text " + totalAmount.toString());
        return getTextFromElement(totalAmount);
    }

    public void clickConfirm() {
        log.info("Clicking on confirm " + confirmMessage.toString());
        clickOnElement(confirmMessage);
    }

    public String getTextThankYou() throws InterruptedException{
        log.info("Getting thank you text " + thankYouText.toString());
        Thread.sleep(1000);
        return getTextFromElement(thankYouText);
    }

    public String getTextOrderSuccessfullyPlaced() {
        log.info("Getting order successfully placed message " + orderSuccessMessage.toString());
        return getTextFromElement(orderSuccessMessage);
    }

    public void clickContinueAfterOrderPlaced(){
        log.info("Clicking on continue Button " + continueAfterOrderPlaced.toString());
        clickOnElement(continueAfterOrderPlaced);
    }

    public void clickContinueAfterRegistrationBilling(){
        log.info("Clicking on continue Button " + continueAfterRegistrationBilling.toString());
        clickOnElement(continueAfterRegistrationBilling);
    }
    public void clickRadioShipping(){
        log.info("Clicking on shipping radio Button " + radioSecondDayAir.toString());
        clickOnElement(radioSecondDayAir);
    }
    public void clickLogoutLink(){
        log.info("Clicking on logout Button " + logoutLink.toString());
        clickOnElement(logoutLink);
    }
    public String getCurrentURL(){
        log.info("Getting current URL " );
        return driver.getCurrentUrl();
    }

}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirth;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationSuccess;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    public String getRegisterText() {
        log.info("Getting Register text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String inputFirstName) {
        log.info("Enter first name" + inputFirstName + "to field " + firstName.toString());
        sendTextToElement(firstName, inputFirstName);
    }

    public void enterLastName(String inputLastName) {
        log.info("Enter last name" + inputLastName + "to field " + lastName.toString());
        sendTextToElement(lastName, inputLastName);
    }

    public void enterDateOfBirthDay(String inputDay) {
        log.info("Select Day from Date Of Birth " + inputDay.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, inputDay);
    }

    public void enterMonthOfBirth(String inputMonth) {
        log.info("Select Month from Date Of Birth " + inputMonth.toString());
        selectByVisibleTextFromDropDown(monthOfBirth, inputMonth);
    }

    public void enterYearofBirth(String inputYear) {
        log.info("Select Year from Date Of Birth " + inputYear.toString());
        selectByVisibleTextFromDropDown(yearOfBirth, inputYear);
    }

    public void enterEmail(String inputEmail) {
        log.info("Enter email" + inputEmail + "to field " + email.toString());
        sendTextToElement(email, inputEmail + getRandomString(3) + "@gmail.com");
    }

    public void enterPassword(String inputPassword) {
        log.info("Enter password" + inputPassword + "to field " + password.toString());
        sendTextToElement(password, inputPassword);
    }

    public void enterConfirmPassword(String inputConfirmPassword) {
        log.info("Enter password" + inputConfirmPassword + "to confirm password field " + confirmPassword.toString());
        sendTextToElement(confirmPassword, inputConfirmPassword);
    }

    public void clickRegisterButton() {
        log.info("Clicking on register Button " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String registrationCompleteMessage() {
        log.info("Getting registration complete text " + registrationSuccess.toString());
        return getTextFromElement(registrationSuccess);
    }

    public void clickContinueButton() {
        log.info("Clicking on continue Button " + continueButton.toString());
        clickOnElement(continueButton);
    }

}

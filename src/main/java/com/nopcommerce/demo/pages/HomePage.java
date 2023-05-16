package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'header-menu']/ul/li")
    List<WebElement> headerMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Computers ']")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Computers ']")
    WebElement computer;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Desktops ']")
    WebElement desktopOption;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Desktops ']")
    WebElement desktopOptionTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='topic-block-title']/h2")
    WebElement welcomeToOurStoreText;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Electronics ']")
    WebElement electronicsTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/ul[@class='sublist first-level']/li/a[text()='Cell phones ']")
    WebElement cellPhonesTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    public String getWelcomeText()throws InterruptedException{
        Thread.sleep(200);
        return getTextFromElement(welcomeText);
    }

    public String getTitleOfPage() {
        return getTextFromElement(pageTitle);
    }

    public void selectMenu(String menu) {
        List<WebElement> menuList = headerMenu;
        try {
            //loop through list with for loop
            for (WebElement menuOption : menuList) {
                System.out.println(menuOption.getText());
                //if option matches with the parameter then click
                if (menuOption.getText().equals(menu)) {
                    menuOption.click();
                }
            }
            //catch exceptions
        } catch (StaleElementReferenceException e) {
            menuList = headerMenu;
        }
    }

    public void hoverOnComputer() {
        log.info("Hovering over Computer " + computerTab.toString());
        mouseHoverToElement(computer);
    }

    public void hoverOnComputerTab() throws InterruptedException{
        log.info("Hovering over Computer " + computerTab.toString());
        Thread.sleep(1000);
        mouseHoverToElement(computerTab);

    }

    public void hoverOnElectronics() {
        log.info("Hovering over Electronics " + electronicsTab.toString());
        mouseHoverToElement(electronicsTab);
    }

    public void clickOnCellPhones() {
        log.info("Hovering on Cell Phones " + cellPhonesTab.toString());
        clickOnElement(cellPhonesTab);
    }

    public void clickOnDesktop() {
        log.info("Clicking on desktop " + desktopOption.toString());
        mouseHoverToElementAndClick(desktopOption);
    }

    public void clickOnDesktopTab() throws InterruptedException{
        log.info("Clicking on desktop " + desktopOption.toString());
        Thread.sleep(100);
        mouseHoverToElementAndClick(desktopOptionTab);
    }

    public String getWelcomeToOurStoreText() {
        log.info("Getting welcome text " + welcomeToOurStoreText.toString());
        return getTextFromElement(welcomeToOurStoreText);
    }

}

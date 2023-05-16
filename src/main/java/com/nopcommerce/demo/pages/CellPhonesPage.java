package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1" )
    WebElement cellPhonesText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='viewmode-icon list']" )
    WebElement listTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Nokia Lumia 1020')]" )
    WebElement productNokiaLumiaLink;

    public String getCellPhonesText() {
        log.info("Getting cell phones text " + cellPhonesText.toString());
        return getTextFromElement(cellPhonesText);
    }
    public void clickListTab(){
        log.info("Clicking on list tab " + listTab.toString());
        clickOnElement(listTab);
    }
    public void clickOnNokiaLumia(){
        log.info("Clicking on Nokia Lumia " + productNokiaLumiaLink.toString());
        clickOnElement(productNokiaLumiaLink);
    }

}

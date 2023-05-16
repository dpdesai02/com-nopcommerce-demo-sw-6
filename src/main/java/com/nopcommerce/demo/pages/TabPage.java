package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabPage extends Utility {
    private static final Logger log = LogManager.getLogger(TabPage.class.getName());
    public TabPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1" )
    WebElement pageTitle;
    public String getPageTitleText() {
        log.info("Getting page title text " + pageTitle.toString());
        return getTextFromElement(pageTitle);
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(BooksPage.class.getName());

    public BooksPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]" )
    WebElement books;

    public String getBooksText() {
        log.info("Getting books text " + books.toString());
        return getTextFromElement(books);
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']" )
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']" )
    List<WebElement> productsPath;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]" )
    WebElement addToCartButton;

    public void sortByZtoA(String sortByZToA){
        log.info("Clicking on sort by Z to A " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy,sortByZToA);
    }
    public void sortByAtoZ(String sortByAToZ){
        log.info("Clicking on credit card payment type radio button " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy,sortByAToZ);
    }
    public void selectSortByAtoZ(String sortByAToZ){
        log.info("Clicking on credit card payment type radio button " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy,sortByAToZ);
    }
    public void addToCart() throws InterruptedException{
        log.info("Clicking on add to cart button " + addToCartButton.toString());
        Thread.sleep(500);
        mouseHoverToElementAndClick(addToCartButton);
    }
    public ArrayList beforeSorting() {
        List<WebElement> product = productsPath ;
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement list : product) {
            originalList.add(list.getText());
        }
        return originalList;
    }
    public ArrayList afterSorting(){
        Collections.reverse(beforeSorting());
        System.out.println(beforeSorting());
        List<WebElement>products = productsPath;
        ArrayList<String>afterSortingList = new ArrayList<>();
        for (WebElement newSortList : products){
            afterSortingList.add(newSortList.getText());
        }
        return afterSortingList;
    }
}

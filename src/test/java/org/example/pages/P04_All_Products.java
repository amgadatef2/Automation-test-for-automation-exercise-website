package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P04_All_Products {
    public P04_All_Products () {

        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "features_items")
    public WebElement items;

    @FindBy(css = "a[href=\"/product_details/1\"]")
    public WebElement FIRST_PRODUCT;

    @FindBy(css = "div[class=\"product-information\"]")
    public WebElement PRODUCT_DETAILS;

}

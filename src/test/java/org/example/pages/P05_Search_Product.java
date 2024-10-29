package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P05_Search_Product {
    public P05_Search_Product () {

        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "features_items")
    public WebElement items;

    @FindBy(css = "a[href=\"/product_details/1\"]")
    public WebElement FIRST_PRODUCT;

    @FindBy(css = "div[class=\"product-information\"]")
    public WebElement PRODUCT_DETAILS;

    @FindBy(id= "search_product")
    public WebElement Search_engine;

    @FindBy(id = "submit_search")
    public WebElement search_button;

    @FindBy(css = "div[class=\"features_items\"]>div>div>div[class=\"single-products\"]>div>p")
    public List<WebElement> Search_of_jeans;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/p")
    public WebElement BLUE;
}

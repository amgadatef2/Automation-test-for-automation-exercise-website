package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utilities.DataUtils;
import org.example.pages.P01_registerPages;
import org.example.pages.P04_All_Products;
import org.example.pages.P05_Search_Product;
import org.example.pages.P06_Add_product;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D06_Add_Product {

    P01_registerPages Register_Pages = new P01_registerPages();
    P04_All_Products allProducts = new P04_All_Products();
    P05_Search_Product Search=new P05_Search_Product();
    P06_Add_product add_product=new P06_Add_product();
    SoftAssert soft = new SoftAssert();
//    @When("User Click on Products button")
//    public void click_on_Product_Button() {
//        Register_Pages.Headers().get(1).click();
//    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {
//        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//        driver.switchTo().frame(iframes.get(0)); // Switch to the first iframe (assuming it's the interfering one)
//// Try closing the ad if a close button exists
//        WebElement closeButton = driver.findElement(By.cssSelector("button.close-ad"));
//        closeButton.click();
//        driver.switchTo().defaultContent();
        Actions action=new Actions(driver);


        WebElement element = add_product.items.get(0);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,400)");
        Thread.sleep(5000);
        action.moveToElement(Search.Search_of_jeans.get(0)).perform();

        element.click();
//        add_product.items.get(0).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(add_product.items.get(0)));

    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton(){
        WebDriverWait explicit=new WebDriverWait(driver, Duration.ofSeconds(4));
        explicit.until(ExpectedConditions.visibilityOf(add_product.window_appear));
        add_product.Continue_Button.click();
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        Actions action=new Actions(driver);
        action.moveToElement(Search.Search_of_jeans.get(1)).build().perform();
        add_product.items.get(1).click();
    }

    @And("Click View Cart button")
    public void clickViewCartButton(){
        WebDriverWait explicit=new WebDriverWait(driver, Duration.ofSeconds(4));
        explicit.until(ExpectedConditions.visibilityOf(add_product.window_appear));
add_product.View_items.click();
    }

    @Then("Verify both products are added to Cart and Verify their prices, quantity and total price")
    public void verifyBothProductsAreAddedToCartAndVerifyTheirPricesQuantityAndTotalPrice() {

for (int i = 0;i<add_product.Card_Products.size(); i++)
{

Assert.assertTrue(add_product.Card_Products.get(i).isDisplayed());


    }
}

}


package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utilities.DataUtils;
import org.example.pages.P01_registerPages;
import org.example.pages.P04_All_Products;
import org.example.pages.P05_Search_Product;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.FileNotFoundException;

import static java.awt.SystemColor.window;
import static org.example.stepDefs.Hooks.driver;

public class D05_Search_Product {

    P01_registerPages Register_Pages = new P01_registerPages();
    P04_All_Products allProducts = new P04_All_Products();
    P05_Search_Product Search=new P05_Search_Product();
    SoftAssert soft = new SoftAssert();

    @When("User Click on Products button")
    public void click_on_Product_Button() {
        Register_Pages.Headers().get(1).click();

    }

    @And("VERIFY THAT PRODUCT PAGE OPENED")
    public void verifyTHATPRODUCTPAGEOPENED() {

        Assert.assertTrue(driver.getCurrentUrl().contains("products"));
    }


    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() throws InterruptedException {
        Search.Search_engine.click();
        Search.Search_engine.sendKeys("jeans");
        Search.search_button.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,400)");
        Thread.sleep(5000);



    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() throws FileNotFoundException {
        for (int i=0;i< Search.Search_of_jeans.size();i++){
            String JEA=Search.Search_of_jeans.get(i).getText().toLowerCase();
            String Data=DataUtils.Get_jsonData("jeans","search data").toLowerCase();
            soft.assertTrue(JEA.contains(Data));
            soft.assertAll();

        }

    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {



    }
    }
//

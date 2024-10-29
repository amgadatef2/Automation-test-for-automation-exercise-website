package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_registerPages;
import org.example.pages.P04_All_Products;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_All_Product {

    P01_registerPages Register_Pages = new P01_registerPages();
    P04_All_Products allProducts = new P04_All_Products();
    SoftAssert soft = new SoftAssert();

    @When("that home page is visible successfully")
    public void home_page_visible() {
        Assert.assertTrue(Register_Pages.Headers().get(0).getCssValue("color").contains("rgba(255, 165, 0, 1)"));

    }

    @And("Click on Products button")
    public void clickOnProductsButton() {
        Register_Pages.Headers().get(1).click();
    }


    @Then("The products list is visible")
    public void theProductsListIsVisible() {
        soft.assertTrue(allProducts.items.isDisplayed());

        soft.assertAll();

    }

    @When("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        allProducts.FIRST_PRODUCT.click();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1");
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        soft.assertTrue(allProducts.PRODUCT_DETAILS.getText().contains("Blue Top"));
        soft.assertTrue(allProducts.PRODUCT_DETAILS.getText().contains("Category: Women > Tops"));
        soft.assertTrue(allProducts.PRODUCT_DETAILS.getText().contains("Polo"));
        soft.assertTrue(allProducts.PRODUCT_DETAILS.getText().contains("Availability:"));

        soft.assertAll();
    }
}

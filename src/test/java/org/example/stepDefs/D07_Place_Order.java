package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utilities.AssertionUtilities;
import org.example.Utilities.DataUtils;
import org.example.Utilities.Utilities;
import org.example.pages.P01_registerPages;
import org.example.pages.P02_Log_inPages;
import org.example.pages.P07_Place_Order;

import java.io.IOException;

import static org.example.stepDefs.Hooks.driver;
public class D07_Place_Order {


    P07_Place_Order Place_order=new P07_Place_Order();

    @When("Click Signup _Login button")
    public void ClickSignupLoginbutton(){
//        Place_order.Headers.get(3).click();
      Place_order.Head_Icons.get(3).click();
//        P07_Place_Order.Head_Icons.get(3).getText();
//System.out.print(P07_Place_Order.Head_Icons.get(3).getText());

    }


    @And("Fill email, password and click Login button")
    public void fillEmailPasswordAndClickLoginButton() throws IOException {
Place_order.Emails.sendKeys(DataUtils.get_properties("Email"));
Place_order.Password.sendKeys(DataUtils.get_properties("Password"));
Place_order.Login_Button.click();
    }

    @Then("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        AssertionUtilities.hard_assertion.assertElementDisplayed(driver,Place_order.loginTxt);
    }

//    @When("Add products to cart")
//    public void addProductsToCart() {
//    }

    @And("Click Cart button")
    public void clickCartButton() {
        Utilities.ClickingOnElement(driver,Place_order.Card_Button);
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
Utilities.ClickingOnElement(driver,Place_order.Proceed_To_Checkout);
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        Utilities.Send_Data(driver,Place_order.commentAboutYourOrder,"Thanks for this Product");
        Utilities.ClickingOnElement(driver,Place_order.Place_Order);
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        Utilities.Send_Data(driver,Place_order.nameorCard,"AmgadAtef");
        Utilities.Send_Data(driver,Place_order.Card_Number,"15154823");
        Utilities.Send_Data(driver,Place_order.CVC,"145");
Utilities.Send_Data(driver,Place_order.Expiration,"06");
Utilities.Send_Data(driver,Place_order.Year,"2011");

    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        Utilities.ClickingOnElement(driver,Place_order.payBtn);
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
AssertionUtilities.hard_assertion.assertElementDisplayed(driver,Place_order.order_Placed);
    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
        Utilities.ClickingOnElement(driver,Place_order.Delet_Account);
    }

    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        AssertionUtilities.hard_assertion.assertElementDisplayed(driver,Place_order.account_Deleted_Txt);
        Utilities.ClickingOnElement(driver,Place_order.continuebtn);
    }
}

package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utilities.DataUtils;
import org.example.pages.P02_Log_inPages;
import org.example.pages.P03_Log_outPages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.example.stepDefs.Hooks.driver;

public class D03_Log_OutStepDef {

P02_Log_inPages Po2_register=new P02_Log_inPages();
P03_Log_outPages pages= new P03_Log_outPages();
SoftAssert soft=new SoftAssert();
//@When("Click on Signup  Login button")
//    public void click_login_signup(){
//Po2_register.Headers.get(3).click();
//    }
//
//
//    @And("Enter vaild email address")
//    public void enterVaildEmailAddress() throws IOException {
//
//            String Emails=DataUtils.get_properties("Email");
//
//        Po2_register.Email.sendKeys(Emails);
//    }
//
//    @And("Enter vaild password")
//    public void enterVaildPassword() throws IOException {
//    String pass=DataUtils.get_properties("Password");
//    Po2_register.Pass.sendKeys(pass);
//
//    }
//
//    @And("click login button")
//    public void clickLoginButton() {
//    Po2_register.Login_button.click();
//    }
//
//    @Then("Home page is opened")
//    public void homePageIsOpened() {
//        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
//
//    }
//
//
//
//    @Then("error message is diaplyed")
//    public void errorMessageIsDiaplyed() {
//String actual =driver.findElement(By.linkText("Your email or password is incorrect!")).getText().toLowerCase();
//    String Expected="Your email or password is incorrect!".toLowerCase();
//    }
//
//    @And("Enter invaild email address {string}")
//    public void enterInvaildEmailAddress(String arg0) {
//    Po2_register.Email.sendKeys(arg0);
//    }
//
//    @And("Enter invaild password  {string}")
//    public void enterInvaildPassword(String arg0) {
//    Po2_register.Pass.sendKeys(arg0);
//    }

//    @When("login As Useris Appeard")
//    public void loginAsUserisAppeard() {
//        Assert.assertTrue(pages.Headers.get(9).getText().toLowerCase().contains("quincy.lang".toLowerCase()));
//
//
//    }


    @And("user clicks on log_out button")
    public void log_out(){
        pages.log_out.get(3).click();


    }


    @Then("user should be in login-setup page")
    public void userShouldBeInLoginSetupPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

      String OR_COLOR=pages.OR_COLOR.getCssValue("background");
Assert.assertTrue(OR_COLOR.contains("rgb(254, 152, 15)"));
    }


}

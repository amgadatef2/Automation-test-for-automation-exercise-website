package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utilities.AssertionUtilities;
import org.example.Utilities.DataUtils;
import org.example.pages.P02_Log_inPages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.example.stepDefs.Hooks.driver;
public class D02_registerStepDef {

P02_Log_inPages Po2_register=new P02_Log_inPages();

SoftAssert soft=new SoftAssert();
@When("Click on Signup  Login button")
    public void click_login_signup(){
Po2_register.Headers.get(3).click();
    }


    @And("Enter vaild email address")
    public void enterVaildEmailAddress() throws IOException {

            String Emails=DataUtils.get_properties("Email");

        Po2_register.Email.sendKeys(Emails);
    }

    @And("Enter vaild password")
    public void enterVaildPassword() throws IOException {
    String pass=DataUtils.get_properties("Password");
    Po2_register.Pass.sendKeys(pass);

    }

    @And("click login button")
    public void clickLoginButton() {
    Po2_register.Login_button.click();
    }

    @Then("Home page is opened")
    public void homePageIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

    }



    @Then("error message is diaplyed")
    public void errorMessageIsDiaplyed() {
//String actual =driver.findElement(By.linkText("Your email or password is incorrect!")).getText().toLowerCase();
//    String Expected="Your email or password is incorrect!".toLowerCase();
//  Alert message = driver.switchTo().alert();
        Assert.assertTrue(driver.switchTo().alert().getText().contains("Please include an'@'in the email address.'ADASD.GASD'"));

    }

    @And("Enter invaild email address {string}")
    public void enterInvaildEmailAddress(String arg0) {
    Po2_register.Email.sendKeys(arg0);
    }

    @And("Enter invaild password  {string}")
    public void enterInvaildPassword(String arg0) {
    Po2_register.Pass.sendKeys(arg0);
    }
}

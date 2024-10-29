package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Utilities.AssertionUtilities;
import org.example.Utilities.DataUtils;
import org.example.pages.P01_registerPages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef {
    P01_registerPages Pages = new P01_registerPages();
    Faker fake = new Faker();
    SoftAssert Soft = new SoftAssert();

    @When("Click on Signup -Login  button")
    public void signup_login() {
        Pages.Headers().get(3).click();

    }

    @And("Enter name")
    public void enterName() throws IOException {
        String name = fake.name().username();
        Pages.user_name().sendKeys(name);
        //DataUtils.Set_jsonData("Reg","User_name",name);

    }

    @And("email address")
    public void emailAddress() throws IOException {

        String Email = fake.internet().safeEmailAddress();
        Pages.Email().sendKeys(Email);
        DataUtils.set_properties("Email", Email);
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        Pages.click_SignUp().click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        String text = driver.getCurrentUrl().toLowerCase();
        Assert.assertTrue(text.contains("signup"));
    }

    @When("Fill  Title")
    public void fillTitle() {
        Pages.Gender().get(0).click();
    }


    @And("Fill Password")
    public void FillPassword() {
        String PASS = fake.internet().password();
        DataUtils.set_properties("Password", PASS);
        Pages.Pass().sendKeys(PASS);
    }

    @And("Date of birth")
    public void dateOfBirth() {
        Select DAYS = new Select(Pages.Date_of_days());
        DAYS.selectByValue("1");
        Select MONTHS = new Select(Pages.Date_of_Months());
        MONTHS.selectByVisibleText("October");
        Select years = new Select(Pages.Date_of_years());
        years.selectByValue("2000");

    }

    @And("Fill details")
    public void fillDetails() {
        Pages.fill_details1().click();
        ;
        Pages.fill_details2().click();
    }

    @And("FillFirst name")
    public void fill_firstName() {
        String first_name = fake.name().firstName();
        DataUtils.set_properties("first_name", first_name);
        Pages.First_name().sendKeys(first_name);

    }

    @And("FillLast name")
    public void fill_lastName() {
        String last_name = fake.name().lastName();
        DataUtils.set_properties("last_name", last_name);
        Pages.Last_name().sendKeys(last_name);
    }

    @And("FillCompany")
    public void fill_company() {
        String COMPANY = fake.name().name();
        DataUtils.set_properties("company", COMPANY);
        Pages.Company().sendKeys(COMPANY);
    }

    @And("FillAddress")
    public void fill_address() {
        String ADDRESS = fake.address().fullAddress();
        DataUtils.set_properties("address", ADDRESS);
        Pages.Address().sendKeys(ADDRESS);
    }

    @And("FillAddressTWO")
    public void fill_address_two() {
        String ADDRESS2 = fake.address().secondaryAddress();
        DataUtils.set_properties("address2", ADDRESS2);
        Pages.Address_Two().sendKeys(ADDRESS2);
    }

    @And("FillCountry")
    public void fill_country() {
        String COUNTRY = fake.address().country();
        DataUtils.set_properties("COUNTRY", COUNTRY);
        Pages.Country().sendKeys(COUNTRY);
    }

    @And("FillState")
    public void fill_state() {
        String STATE = fake.address().state();
        DataUtils.set_properties("STATE", STATE);
        Pages.State().sendKeys(STATE);
    }

    @And("FillCity")
    public void fill_city() {

        String CITY = fake.address().city();
        DataUtils.set_properties("CITY", CITY);
        Pages.City().sendKeys(CITY);
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        Pages.CREAT_ACCOUNT().click();
    }

    @Then("verify that account created is visible")
    public void verifyThatAccountCreatedIsVisible() {
//        String actual_text = driver.findElement(By.partialLinkText("Account Created")).getText().toLowerCase();
//        String Expected_text = "Account Created!".toLowerCase();
//        Assert.assertEquals(actual_text, Expected_text);
        AssertionUtilities.hard_assertion.assertElementDisplayed(driver,Pages.ACCEDPTED_MESSAGE);
    }

    @And("FillZip_Code")
    public void fillzip_code() {
        String zip_code = fake.address().zipCode();
        Pages.Zip_code().sendKeys(zip_code);
        DataUtils.set_properties("Zip_Code", zip_code);

    }

    @And("FillMobile_Number")
    public void fillmobile_number() {
        String mobile_number = fake.phoneNumber().phoneNumber();
        Pages.Mobile_number().sendKeys(mobile_number);
        DataUtils.set_properties("Mobil_Number", mobile_number);

    }


}



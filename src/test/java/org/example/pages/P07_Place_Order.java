package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P07_Place_Order {

    public P07_Place_Order() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[class=\"nav navbar-nav\"]>li>a")
    public  List<WebElement> Head_Icons;


    @FindBy(css = "input[data-qa=\"login-email\"]")
    public  WebElement Emails;

    @FindBy(css = "input[data-qa=\"login-password\"]")
    public  WebElement Password;

    @FindBy(css ="button[data-qa=\"login-button\"]")
        public WebElement Login_Button;

 public   By loginTxt= By.linkText(" Logged in as ");

 public By Card_Button =By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
    public By Proceed_To_Checkout =By.linkText("Proceed To Checkout");

    public By commentAboutYourOrder=By.className("form-control");

    public By Place_Order=By.linkText("Place Order");

    public By nameorCard=By.cssSelector("[class=\"form-control\"]");

    public By Card_Number=By.cssSelector("[name=\"card_number\"]");

    public By CVC=By.cssSelector("[name=\"cvc\"]");

    public By Expiration=By.cssSelector("[name=\"expiry_month\"]");

    public  By Year=By.cssSelector("[name=\"expiry_year\"]");
    public By payBtn=By.id("submit");
    public By order_Placed=By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    public By Delet_Account=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    public By account_Deleted_Txt=By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    public By continuebtn=By.linkText("Continue");
}

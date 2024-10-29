package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;
public class P02_Log_inPages {


    public P02_Log_inPages() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[class=\"nav navbar-nav\"]>li>a")
    public List<WebElement> Headers;


    @FindBy(css = "input[data-qa=\"login-email\"]")
    public WebElement Email;


    @FindBy(css = "input[data-qa=\"login-password\"]")
    public WebElement Pass;

    @FindBy(css = "button[data-qa=\"login-button\"]")
    public WebElement Login_button;

}

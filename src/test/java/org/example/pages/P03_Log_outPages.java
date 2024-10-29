package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_Log_outPages {


    public P03_Log_outPages(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "ul[class=\"nav navbar-nav\"]>li>a")
    public List<WebElement> Headers;

    @FindBy(css= "ul[class=\"nav navbar-nav\"]>li>a")
    public List<WebElement> log_out;


    @FindBy (className = "or")
    public WebElement OR_COLOR;


}

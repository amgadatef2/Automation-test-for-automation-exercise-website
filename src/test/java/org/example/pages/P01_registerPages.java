package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;


public class P01_registerPages {

    public List<WebElement> Headers(){

        return driver.findElements(By.cssSelector("ul[class=\"nav navbar-nav\"]>li>a"));
    }
    public WebElement user_name(){

        return driver.findElement(By.cssSelector("input[data-qa=\"signup-name\"]"));
    }

    public WebElement Email(){

        return driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]"));
    }
    public WebElement click_SignUp(){

        return driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]"));
    }

    public List<WebElement> Gender(){

return driver.findElements(By.cssSelector("input[id*=\"id_gender1\"]"));

    }

    public WebElement Pass(){

        return driver.findElement(By.cssSelector("input[type=\"password\"]"));
    }
    public WebElement Date_of_days(){
return driver.findElement(By.id("days"));


    }
    public WebElement Date_of_Months(){
        return driver.findElement(By.id("months"));


    }

    public WebElement Date_of_years(){
        return driver.findElement(By.id("years"));


    }


    public WebElement First_name(){
return driver.findElement(By.cssSelector("input[data-qa=\"first_name\"]"));
    }


    public WebElement  Last_name(){
return driver.findElement(By.cssSelector("input[data-qa=\"last_name\"]"));
    }


    public WebElement Company(){
return driver.findElement(By.cssSelector("input[data-qa=\"company\"]"));

    }

    public WebElement Address(){
return driver.findElement(By.cssSelector("input[data-qa=\"address\"]"));

    }

    public WebElement Address_Two(){

return driver.findElement(By.cssSelector("input[data-qa=\"address2\"]"));
    }

    public WebElement Country(){

return driver.findElement(By.cssSelector("select[name=\"country\"]"));
    }

    public WebElement State(){

return driver.findElement(By.cssSelector("input[data-qa=\"state\"]"));
    }

    public WebElement City(){

return driver.findElement(By.cssSelector("input[data-qa=\"city\"]"));
    }

    public WebElement Zip_code(){

return driver.findElement(By.cssSelector("input[data-qa=\"zipcode\"]"));
    }

    public WebElement Mobile_number(){

        return driver.findElement(By.cssSelector("input[data-qa=\"mobile_number\"]"));
    }

    public WebElement fill_details1(){
        return driver.findElement(By.cssSelector("input[name=\"newsletter\"]"));
    }
    public WebElement fill_details2(){
        return driver.findElement(By.cssSelector("input[name=\"optin\"]"));
    }

    public WebElement CREAT_ACCOUNT(){

        return driver.findElement(By.cssSelector("button[data-qa=\"create-account\"]"));

    }

    public By ACCEDPTED_MESSAGE=By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");

}

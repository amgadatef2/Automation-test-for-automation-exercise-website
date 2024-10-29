package org.example.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities {

    public static void ClickingOnElement(WebDriver driver, By Locators){

        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(Locators));
        driver.findElement(Locators).click();


    }

    public static void ClickingOnElementS(WebDriver driver, By Locators,int i){

        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(Locators));
        driver.findElements(Locators).get(i).click();


    }

    public static void Send_Data(WebDriver driver, By Locators,String Data){

        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(Locators));
        driver.findElement(Locators).sendKeys(Data);




    }

    public static String Get_Text(WebDriver driver, By Locators){

        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(Locators));
        driver.findElement(Locators).click();
return driver.findElement(Locators).getText();

    }

    public static WebDriverWait General_Wait(WebDriver driver){
        return new WebDriverWait(driver,Duration.ofSeconds(6));

    }

//    public static void ClickingOnElement(WebDriver driver, By Locators) {
//
////        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"),FindWebElement(driver.)
//
//
//    }
    public static WebElement FindWebElement(WebDriver driver, By Locators){

     return driver.findElement(Locators);


    }

}

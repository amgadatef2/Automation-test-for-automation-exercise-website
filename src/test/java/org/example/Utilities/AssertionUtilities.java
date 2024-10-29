package org.example.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AssertionUtilities {

public static class hard_assertion{

    public static void assertElementDisplayed(WebDriver driver, By Locator){
        WebElement Element=driver.findElement(Locator);
        Assert.assertTrue(Element.isDisplayed(),"Element should be displayed:"+Locator.toString());


    }

    public static void assertElementNOTDisplayed(WebDriver driver, By Locator){
        WebElement Element=driver.findElement(Locator);
        Assert.assertFalse(Element.isDisplayed(),"Element should not be displayed:"+Locator.toString());


    }
    public static void assertElementEnabled(WebDriver driver, By Locator){
        WebElement Element=driver.findElement(Locator);
        Assert.assertTrue(Element.isEnabled(),"Element should be Enabled:" +Locator.toString());


    }

    public static void assertElementDisEnabled(WebDriver driver, By Locator){
        WebElement Element=driver.findElement(Locator);
        Assert.assertTrue(Element.isDisplayed(),"Element should be DisEnabled:" +Locator.toString());


    }
    public static void assertElementText(WebDriver driver, By Locator, String expected_text){
        WebElement Element=driver.findElement(Locator);
        String actual_text=Element.getText();
        Assert.assertEquals(actual_text,expected_text,"text should be" +expected_text +"but was"+actual_text);


    }

    public static void asserElementAttribute(WebDriver driver,By Locator,String expectedValue,String attribute){

        WebElement Element=driver.findElement(Locator);
        String actualValue=Element.getAttribute(attribute);
        Assert.assertEquals(actualValue,expectedValue,"attribute" +attribute +"should be"+expectedValue+"but was"+actualValue);

    }
    public static void assetUrl(WebDriver driver,By Locator,String ExpectedUrl ){

        String Element=driver.getCurrentUrl();

        Assert.assertEquals(Element,ExpectedUrl);

    }
    public static void assertElementsDisplayed(WebDriver driver, By Locator,int i){
       List<WebElement>Element = driver.findElements(Locator);
        Assert.assertTrue(Element.get(i).isDisplayed(),"Element should be displayed:"+Locator.toString());


    }
    public static void assertElementssDisplayed(WebDriver driver, By Locator,int i){
        List<WebElement>Element = driver.findElements(Locator);
        Assert.assertTrue(Element.get(i).isDisplayed(),"Element should be displayed:"+Locator.toString());


    }


}


    public static class soft_assertion{

        private final   SoftAssert Soft_assertion=new SoftAssert();




    }



}

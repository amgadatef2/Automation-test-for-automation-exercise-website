package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P06_Add_product {
  public P06_Add_product () {

    PageFactory.initElements(driver, this);
  }

  @FindBy(css = "div[class=\"productinfo text-center\"]>a")
    public List<WebElement>items;

  @FindBy(css = "button[class=\"btn btn-success close-modal btn-block\"]")
    public WebElement Continue_Button;

  @FindBy(css = "a[href=\"/view_cart\"]>u")
    public WebElement View_items;

  @FindBy(xpath="//*[@id=\"cart_info_table\"]/tbody")
    public List<WebElement>Card_Products;


  @FindBy(css = "div[class=\"modal-content\"]")
  public WebElement window_appear;
}

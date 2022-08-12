package org.seleniumhq.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumhq.selenium.stepDefs.Hooks;

import java.util.List;

public class P04_homePage {
    public  String crrentlink()
    {return  Hooks.driver.getCurrentUrl();}
    public void  go_homePage()
    {
        Hooks.driver.get("https://demo.nopcommerce.com/");}
    public WebElement search()
    {
        return  Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement search_btn()
    {
        return  Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List<WebElement> list()

    {
        return  Hooks.driver.findElements(By.cssSelector("div[class=\"details\"]>h2>a"));
    }

public  WebElement sr()
{return  Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] >a"));}

    public  WebElement sk()
    {return  Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"] > span[class=\"value\"]"));}
}



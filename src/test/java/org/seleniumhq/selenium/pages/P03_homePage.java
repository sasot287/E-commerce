package org.seleniumhq.selenium.pages;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.selenium.stepDefs.Hooks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.seleniumhq.selenium.stepDefs.Hooks.driver;

public class P03_homePage {

    public String crrentlink() {
        return Hooks.driver.getCurrentUrl();
    }

    public void go_homePage() {
        driver.get("https://demo.nopcommerce.com/");
    }

    public WebElement currency() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> list() {
        return driver.findElements(By.xpath("span[class=\"price actual-price\"]"));
    }

    public WebElement elementtxt() {
        return driver.findElement(By.xpath("//a[@href=\"/desktops\"]"));
    }

    public String find_hover() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//a[@href=\"/computers\"]"));

        System.out.println(element.getText());
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.xpath("//a[@href=\"/desktops\"]"));
        String l = element2.getText();
        action.moveToElement(element2).perform();
        Thread.sleep(4000);
        element2.click();
        return l;
    }

    public WebElement sbtxt() {
        return driver.findElement(By.xpath("//div[@class=\"page-title\"]"));
    }

    public WebElement slide1() {

        return driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]>img[src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]"));
    }

    public WebElement slide2() {

        return driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]"));
    }
    public WebElement fb1() {

        return driver.findElement(By.cssSelector("ul[class=\"networks\"]> li[class=\"facebook\"]"));
    }

    public WebElement yt() {
        return driver.findElement(By.cssSelector("ul[class=\"networks\"]> li[class=\"youtube\"]"));
    }

    public WebElement rss() {
        return driver.findElement(By.cssSelector("ul[class=\"networks\"]> li[class=\"rss\"]"));
    }

    public WebElement tw() {
        return driver.findElement(By.cssSelector("ul[class=\"networks\"]> li[class=\"twitter\"]"));
    }
    public String tablink(WebElement ele) throws InterruptedException {
ele.click();
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        driver.switchTo().window(tabs.get(1));
        String rl=(driver.getCurrentUrl());
        Thread.sleep(4000);
        driver.close();
        tabs = new ArrayList<>(driver.getWindowHandles());
return rl;
    }

    public WebElement wish()

    {
        return  Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"]>div[class=\"details\"]>div[class=\"add-info\"]>div[class=\"buttons\"]>button[title=\"Add to wishlist\"]"));
    }
    public WebElement wishtxt()
    {
        return  Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));}
public WebElement wbc()
{ return  Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));}

public void   cwish() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("p[class=\"content\"]")));
    driver.findElement(By.cssSelector("a[class=ico-wishlist]")).click();
}
public int contite(){
String S=driver.findElement(By.cssSelector("input[class=qty-input]")).getAttribute("value");
System.out.print(S);
return Integer.parseInt(S.trim());

}}


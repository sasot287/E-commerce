package org.seleniumhq.selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.selenium.stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

public class Register {
    public WebElement registerlink()
    {
        return  Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement choose_gender()
    {
        return  Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement FirstName()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public void day() throws InterruptedException {
        //return  Hooks.driver.findElement(By.name("DateOfBirthDay"));
        WebElement list = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        Select droplist = new Select(list);
        Thread.sleep(2000);
        droplist.selectByIndex(3);
    }
    public void month() throws InterruptedException {
        WebElement list =Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select droplist = new Select(list);
        Thread.sleep(2000);
        droplist.selectByIndex(1);

    }
    public void year() throws InterruptedException {
        WebElement list =Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select droplist = new Select(list);
        Thread.sleep(2000);
        droplist.selectByIndex(1);


    }

    public WebElement Email()
    {
        return  Hooks.driver.findElement(By.name("Email"));
    }

    public WebElement Password()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement cPassword()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement register_button()
    {
        return  Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement register_message()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
    public static void waitt()

    {
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}

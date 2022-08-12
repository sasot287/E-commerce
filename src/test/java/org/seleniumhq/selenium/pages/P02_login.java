package org.seleniumhq.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumhq.selenium.stepDefs.Hooks;

public class P02_login {
 public  String crrentlink()
 {return  Hooks.driver.getCurrentUrl();}
    public WebElement loggin_link()
    {
        return  Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement  mail ()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()

    {

        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement log_btn()

    {
        return  Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public WebElement account_tab()

    {
        return Hooks.driver.findElement(By.className("ico-account"));

    }

    public WebElement err_msg()

    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

}

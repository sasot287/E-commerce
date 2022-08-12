package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.seleniumhq.selenium.pages.P02_login;
import org.seleniumhq.selenium.pages.Register;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login log = new P02_login();

    @Given("user go to login page")
    public void gologginPage() {
        System.out.println(" beforestart  code");
        log.loggin_link().click();
    }

    @When("^user login \"(.*)\" and \"(.*)\"$")
    public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
        log.mail().sendKeys(username);
        log.password().sendKeys(password);

    }

    @And("user press on login button")
    public void logbtn() {
        System.out.print("clickkk");
        log.log_btn().click();
    }


    @Then("user login to the system successfully")
    public void sccesslggin() {
        SoftAssert soft=new SoftAssert();
        String actual_result=log.crrentlink();
        String expected_result="https://demo.nopcommerce.com/";
        // soft.assertTrue(actual_result.contains(expected_result));
        System.out.print(actual_result);
        System.out.print(log.account_tab().isDisplayed());
        soft.assertEquals(actual_result.contains(expected_result),true);
        soft.assertEquals(log.account_tab().isDisplayed(),true);


    }
    @Then ("user could not login to the system")
    public void logfailed()
    {   SoftAssert soft2=new SoftAssert();
        String actual_result=log.err_msg().getText();
        String expected_result="Login was unsuccessful";
        soft2.assertEquals(actual_result.contains(expected_result),true);
        String text_color=log.err_msg().getCssValue("color");
        soft2.assertEquals((Color.fromString(text_color).asHex().equalsIgnoreCase("#e4434b")),true);
        System.out.print(text_color);
        soft2.assertAll();
    }

}
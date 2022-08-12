package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.seleniumhq.selenium.pages.Register;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
   Register register=new Register();
    @Given("user go to register page")
    public void goRegisterPage()
    {

        System.out.println(" before start code");
        register.registerlink().click();

    }
    @When("user select gender type")
    public  void  choose_gender()
    {
        register.choose_gender().click();
        register.waitt();}
    @And ("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public  void  enter_name(String f,String l){
        register.FirstName().sendKeys(f);
        register.waitt();
        register.lastName().sendKeys(l);
        register.waitt();
    }
    @And("user enter date of birth")
    public  void  enter_birthdate() throws InterruptedException {
        register.day();
        register.month();
        register.year();
        register.waitt();

    }
    @And("^user enter email \"(.*)\" field$")
    public  void  mail(String l)
    {
        register.Email().sendKeys(l);
        register.waitt();
    }
    @And("^user fills Password fields \"(.*)\"$")
    public void enter_password(String p)
    {
        register.Password().sendKeys(p);
        register.cPassword().sendKeys(p);
        register.waitt();
    }
    @And("user clicks on register button")
    public  void click_register_button()
    {register.register_button().click();
    }

    @Then("success message is displayed")
            public  void register_done()
    {
        SoftAssert soft=new SoftAssert();
String actual_result=register.register_message().getText();
String expected_result="Your registration completed";

        String text_color=register.register_message().getCssValue("color");
        String color_expected_result="rgba(76, 177, 124, 1)";
        System.out.println(actual_result);
        System.out.println(text_color);
        soft.assertEquals(expected_result.equalsIgnoreCase(actual_result.trim()),true);
        soft.assertEquals(text_color.equals(color_expected_result), true);
        soft.assertAll();
    }



}

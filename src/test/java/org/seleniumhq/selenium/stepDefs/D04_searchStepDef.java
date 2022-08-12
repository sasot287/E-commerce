package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.seleniumhq.selenium.pages.P04_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P04_homePage p4=new P04_homePage();
    String stxt="";

    @Given("user go to Home page and click in search textbox")
   public  void gohoe()
    {p4.search().clear();}
  @When("^user enter\"([^\"]*)\"$")

    public void search(String txt)
    {p4.search().sendKeys(txt);
        stxt=txt;
        p4.search_btn().click();
    }
    @Then("search result will appear")
    public void search_reslt()
    {
        SoftAssert soft=new SoftAssert();
        System.out.println(p4.crrentlink());
        soft.assertEquals(p4.crrentlink().contains("https://demo.nopcommerce.com/search?q="),true);

    for (int e=0;e<=p4.list().size()-1;e++)
    {
        System.out.println(p4.list().size());
        System.out.println(p4.list().get(e).getText());
    soft.assertEquals(p4.list().get(e).getText().toLowerCase().contains(stxt),true);
    }
    soft.assertAll();
    }

    @Then("click on the product in search result")
    public  void resltclick()
    {
    System.out.print(p4.sr().getText());
        p4.sr().click();


    }
@Then("search by sku result will appear")
public void assertres()
{
    SoftAssert s=new SoftAssert();
    System.out.print(p4.sk().getText());
    s.assertEquals(p4.sk().getText().equalsIgnoreCase(stxt),true);
    s.assertAll();
}}


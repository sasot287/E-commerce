package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.seleniumhq.selenium.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {

    P03_homePage p3=new P03_homePage();
    @Given("user goto Home page")
    public  void gohoe()
    {p3.go_homePage();}
 @Then("user  click on first slider")
    public void clickslide()
 {p3.slide1().click();}
    @Then("user  click on seconed slider")
    public void clickslide2()
    {p3.slide2().click();}
    @Then("^first slider to direct user to this url \"(.*)\"$")
    public  void  cheklink(String rl)
   {
       SoftAssert soft = new SoftAssert();

       soft.assertEquals( p3.crrentlink().contains(rl),true);
soft.assertAll();
}
}

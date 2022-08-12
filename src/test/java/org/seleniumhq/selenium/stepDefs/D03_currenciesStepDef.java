package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.seleniumhq.selenium.pages.P03_homePage;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage p3=new P03_homePage();

{p3.go_homePage();}
@When ("^user press on CHome pageurrencyList and choose\"(.*)\"$")
public void currency(String c) {
    p3.currency().sendKeys(c);
}

@Then("^Symbol \"(.*)\"is shown on the 4 products displayed in Home page$")
    public void  choose (String c) {
    List<WebElement> res=p3.list();
    String text="";
    SoftAssert soft2=new SoftAssert();
    for(int i=1;i<=res.size();i++)
    {
       text= res.get(i).getText();
       System.out.print(text);
       soft2.assertEquals(text.contains(c),true);
       soft2.assertAll();
    }
    }
}

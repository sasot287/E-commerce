package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.seleniumhq.selenium.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D05_hoverCategoriesStepDef {

        P03_homePage p3=new P03_homePage();
        @Given("user  go to Home page")
        public  void gohoe()
        {p3.go_homePage();}
        String ll="";
        @When("user hover Computers item and click \"Desktops\"")
        public void hover_category() throws InterruptedException
        { System.out.println("before when");
                ll=p3.find_hover();
                System.out.println("inside when");
        }
@Then("the sub-category page title contains sub-category text")
        public void checktitle()
{ System.out.println("inside assert");
        SoftAssert soft=new SoftAssert();
String stxt=p3.sbtxt().getText();
System.out.println(stxt);
soft.assertEquals(ll.equalsIgnoreCase(ll.trim()),true);
}
}

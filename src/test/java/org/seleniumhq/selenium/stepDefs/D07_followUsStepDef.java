package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.seleniumhq.selenium.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D07_followUsStepDef {
    String link;
    P03_homePage p3=new P03_homePage();
    @When("user opens facebooklink")
    public void linktab() throws InterruptedException {
   link=p3.tablink(p3.fb1());
        }
  //  @Then("^new tab will open by this link \"(.*)\"$")
  @When("user opens twitter link")
  public void twtab() throws InterruptedException {
      link=p3.tablink(p3.tw());
  }

    @When("user opens youtube link")
    public void yotab() throws InterruptedException {
        link=p3.tablink(p3.yt());
    }

    @When("user opens rss link")
    public void rsstab() throws InterruptedException {
        link=p3.tablink(p3.rss());
    }
  @Then("^\"(.*)\"is opened in new tab$")
    public void verify(String actallink)
    {   System.out.println("verify");
        System.out.println(link);
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(link.trim().equals(actallink.trim()),true);
soft.assertAll();
    }
}

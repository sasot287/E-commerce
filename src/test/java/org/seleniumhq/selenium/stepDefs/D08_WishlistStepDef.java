package org.seleniumhq.selenium.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.seleniumhq.selenium.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    P03_homePage p8=new P03_homePage();
    @When("user click Add to wish")
    public  void clickwish()
    {p8.wish().click();}
    @Then("^success message \"(.*)\" will appear$")
    public void assertwish(String ar)
    { SoftAssert soft=new SoftAssert();
        String txt=p8.wishtxt().getText();
        String act="The product has been added to your wishlist";
        String back_color=p8.wbc().getCssValue("background-color");
        soft.assertEquals(txt.equalsIgnoreCase(act),true);
        soft.assertEquals((Color.fromString(back_color).asHex().contains("#4bb07a")),true);
        System.out.println(txt);
        System.out.println(Color.fromString(back_color).asHex());
        soft.assertAll();

    }

@Then("user click wishlist link")
        public void clickwishl()throws InterruptedException{
p8.wish().click();
p8.cwish();
    }

    @Then("Qty is bigger than zero")
    public void cwishstep() {
        SoftAssert soft=new SoftAssert();
    soft.assertEquals(p8.contite()>0,true
    );}

}

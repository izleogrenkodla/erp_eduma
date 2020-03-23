package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class CollectionSectionSD extends LoginPageObject {

    HomePageObject homePageObject = new  HomePageObject(driver);

    @When("^I click on the collection course \"(.*?)\"$")
    public void i_click_on_the_collection_course(String collectionName) throws Throwable {
       Thread.sleep(4000);
       homePageObject.scrollclickcode();
        Thread.sleep(4000);
       homePageObject.collectionClick(collectionName);
    }

    @Then("^I should be on collection page$")
    public void i_should_be_on_collection_page() throws Throwable {
        Thread.sleep(8000);
        homePageObject.collectionPageDisplay();




    }


}

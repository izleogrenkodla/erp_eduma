package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class ScrollDownSD extends LoginPageObject {

    HomePageObject homePageObject = new HomePageObject(driver);

    @When("^I click on the scroll down button$")
    public void i_click_on_the_scroll_down_button() throws Throwable {
        Thread.sleep(5000);
        homePageObject.scrollclickcode();
    }

    @Then("^I should see the collection list$")
    public void i_should_see_the_collection_list() throws Throwable {
        Thread.sleep(5000);
        homePageObject.validateCollectionDisplay();

    }
}

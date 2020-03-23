package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidSearch extends LoginPageObject {

    HomePageObject homePageObject = new HomePageObject(driver);

    @When("^I enter the search result as \"(.*?)\"$")
    public void i_enter_the_search_result_as(String invalidTerm) throws Throwable {
        Thread.sleep(4000);
        homePageObject.invalidSearchFunction(invalidTerm);
    }

    @Then("^I should see no course found in dropdown$")
    public void i_should_see_no_course_found_in_dropdown() throws Throwable {
        Thread.sleep(4000);
        homePageObject.invalidSearchDisplay();
    }
}

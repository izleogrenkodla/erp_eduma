package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import com.erp.gic.lms.login.LoginPageObject;
import com.erp.gic.lms.login.stepDefination.LoginSD;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class ValidSearchSD extends LoginPageObject{

    HomePageObject homePageObject = new HomePageObject(driver);

    @When("^I enter the search result as \"(.*?)\" and select course from dropdown$")
    public void i_enter_the_search_result_as_and_select_course_from_dropdown(String value) throws Throwable {
        Thread.sleep(6000);
        homePageObject.validSearchFunction(value);
    }

    @Then("^I should see the selected course detail$")
    public void i_should_see_the_selected_course_detail() throws Throwable {
        Thread.sleep(6000);
        homePageObject.courseNameValidation();
    }
}

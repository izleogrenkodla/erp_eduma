package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSD {

    HomePageObject homePageObject = new HomePageObject();

    @When("^I enter the search result as \"(.*?)\" and select course from dropdown$")
    public void i_enter_the_search_result_as_and_select_course_from_dropdown(String value) throws Throwable {
        homePageObject.validSearchFunction(value);
    }

    @Then("^I should see the selected course detail$")
    public void i_should_see_the_selected_course_detail() throws Throwable {
        homePageObject.courseNameValidation();
    }

    @When("^I enter the invalid search result as \"(.*?)\"$")
    public void i_enter_the_invalid_search_result_as(String invalidTerm) throws Throwable {
        homePageObject.invalidSearchFunction(invalidTerm);
    }

    @Then("^I should see no course found in dropdown$")
    public void i_should_see_no_course_found_in_dropdown() throws Throwable {
        homePageObject.invalidSearchDisplay();
    }

    @When("^I click on the scroll down button$")
    public void i_click_on_the_scroll_down_button() throws Throwable {
        homePageObject.scrollClickCode();
    }

    @Then("^I should see the collection list$")
    public void i_should_see_the_collection_list() throws Throwable {
        homePageObject.validateCollectionDisplay();
    }
}
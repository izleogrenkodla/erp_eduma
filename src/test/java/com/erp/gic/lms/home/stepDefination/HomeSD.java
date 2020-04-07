package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSD {

    HomePageObject homePageObject = new HomePageObject();
    int value;

    @When("^I click on the collection course \"(.*?)\"$")
    public void i_click_on_the_collection_course(String collectionName) throws Throwable {
        homePageObject.collectionClick(collectionName);
    }

    @Then("^I should be on collection page$")
    public void i_should_be_on_collection_page() throws Throwable {
        homePageObject.collectionPageDisplay();
    }

    @When("^I scroll down to what people say section and click on person image$")
    public void i_scroll_down_to_what_people_say_section_and_click_on_person_image() throws Throwable {
        homePageObject.imageClick();
    }

    @Then("^I should see information about what they say$")
    public void i_should_see_information_about_what_they_say() throws Throwable {
        homePageObject.validateImageDisplay();
    }

    @When("^I hover over the \"(.*?)\" and click read more button$")
    public void i_hover_over_the_and_click_read_more_button(String courseName) throws Throwable {
        value = homePageObject.popularCourseCode(courseName);
        homePageObject.clickReadMore(value);
    }

    @Then("^I should be redirected to \"(.*?)\" page$")
    public void i_should_be_redirected_to_page(String courseName)  throws Throwable {
        homePageObject.courseNamePage(courseName);
    }

    @When("^I click on the \"(.*?)\" name$")
    public void i_click_on_the_name(String course) throws Throwable {
        value = homePageObject.popularCourseCode(course);
        homePageObject.courseNameClick(value);
    }

    @When("^I click on the admin link of \"(.*?)\"$")
    public void i_click_on_the_admin_link(String course) throws Throwable {
        value = homePageObject.popularCourseCode(course);
        homePageObject.adminLink(value);
    }

    @Then("^I should be redirected to profile page$")
    public void i_should_be_redirected_to_profile_page()  throws Throwable {
        homePageObject.profilePage();
    }

    @When("^I click on the view all button$")
    public void i_click_on_the_view_all_button() throws Throwable {
        homePageObject.viewAllClick();
    }

    @When("^I click on logout button on home page$")
    public void i_click_on_logout_button_on_home_page() throws Throwable {
        homePageObject.clickLogout();
    }

    @Then("^I should be successfully logged out from application$")
    public void i_should_be_successfully_logged_out_from_application() throws Throwable {
        homePageObject.validateLogout();
    }


}
package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PopularCoursesSD extends LoginPageObject {

    HomePageObject homePageObject = new HomePageObject(driver);
    int value;

    @When("^I hover over the \"(.*?)\" and click read more button$")
    public void i_hover_over_the_and_click_read_more_button(String courseName) throws Throwable {
        Thread.sleep(4000);
        value = homePageObject.popularCourseCode(courseName);
        homePageObject.clickReadMore(value);
    }

    @Then("^I should be redirected to \"(.*?)\" page$")
    public void i_should_be_redirected_to_page(String courseName)  throws Throwable {
        Thread.sleep(3000);
        homePageObject.courseNamePage(courseName);
    }

    @When("^I click on the \"(.*?)\" name$")
    public void i_click_on_the_name(String course) throws Throwable {
        Thread.sleep(3000);
        value = homePageObject.popularCourseCode(course);
        homePageObject.courseNameClick(value);
    }

    @When("^I click on the admin link of \"(.*?)\"$")
    public void i_click_on_the_admin_link(String course) throws Throwable {
        Thread.sleep(3000);
        value = homePageObject.popularCourseCode(course);
        homePageObject.adminLink(value);
    }

    @Then("^I should be redirected to profile page$")
    public void i_should_be_redirected_to_profile_page()  throws Throwable {
        Thread.sleep(3000);
        homePageObject.profilePage();
    }

    @When("^I click on the view all button$")
    public void i_click_on_the_view_all_button() throws Throwable {
        Thread.sleep(3000);
        homePageObject.viewAllClick();
    }
}

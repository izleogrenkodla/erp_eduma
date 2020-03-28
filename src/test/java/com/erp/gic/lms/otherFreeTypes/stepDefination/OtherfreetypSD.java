package com.erp.gic.lms.otherFreeTypes.stepDefination;

import com.erp.gic.lms.login.LoginPageObject;
import com.erp.gic.lms.otherFreeTypes.OtherFreeTypesPageObjects;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OtherfreetypSD extends LoginPageObject
{
    OtherFreeTypesPageObjects obj =new OtherFreeTypesPageObjects(driver);

    @When("^I hover over the COURSES menu and select Other Free Types submenu option$")
    public void i_hover_over_the_menu_and_select_submenu_option() throws Throwable {
        Thread.sleep(3000);
     obj.courses();
    }

    @Then("^I should be on the technology page$")
    public void i_should_be_on_the_technology_page() throws Throwable {
     Thread.sleep(3000);
     obj.technology();
    }
    @Then("^I click on the Admin link$")
    public void i_click_on_the_link() throws Throwable {
        Thread.sleep(3000);
      obj.admin();
    }

    @Then("^I should redirect to profile page$")
    public void i_should_redirect_to_profile_page() throws Throwable {
        Thread.sleep(3000);
        obj.profile();
    }


}

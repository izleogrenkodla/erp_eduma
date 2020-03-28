package com.erp.gic.lms.becomeInstructor.stepDefination;

import com.erp.gic.lms.becomeAnInstructor.BecomeAnInstructorPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BecomeAnInstructorSD {

    BecomeAnInstructorPO instructorObj = new BecomeAnInstructorPO();

    @When("^I go to \"(.*?)\" and click on it$")
    public void i_go_to_and_click_on_it(String tab) throws Throwable {
        instructorObj.selectTab(tab);
    }

    @Then("^I should see \"(.*?)\" information$")
    public void i_should_see_information(String desc) throws Throwable {
        instructorObj.validateTabDesc(desc);
    }
}
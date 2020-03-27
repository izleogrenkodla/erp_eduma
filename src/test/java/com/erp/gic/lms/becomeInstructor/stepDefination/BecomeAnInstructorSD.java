package com.erp.gic.lms.becomeInstructor.stepDefination;

import com.erp.gic.lms.becomeAnInstructor.BecomeAnInstructorPO;
import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BecomeAnInstructorSD extends LoginPageObject {

    BecomeAnInstructorPO instructorObj = new BecomeAnInstructorPO(driver);

    @When("^I go to \"(.*?)\" and click on it$")
    public void i_go_to_and_click_on_it(String tab) throws Throwable {
        Thread.sleep(4000);
        instructorObj.selectTab(tab);
        Thread.sleep(4000);
    }

    @Then("^I should see \"(.*?)\" information$")
    public void i_should_see_information(String desc) throws Throwable {
        Thread.sleep(3000);
        instructorObj.validateTabDesc(desc);
    }

}

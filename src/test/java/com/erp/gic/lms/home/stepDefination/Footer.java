package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import cucumber.api.java.en.When;

public class Footer {

    HomePageObject homePageObject = new HomePageObject();

    @When("^I scroll to the footer section and click on \"(.*?)\" link under \"(.*?)\"$")
    public void i_scroll_to_the_footer_section_and_click_on_link_under(String link, String section) throws Throwable {
        homePageObject.footerClick(link,section);
    }

    @When("^I click on \"(.*?)\" on footer section$")
    public void i_click_on_on_footer_section(String link) throws Throwable {
        homePageObject.footer(link);
    }

}

package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class HeaderWithSubmenuOption extends LoginPageObject {

    HomePageObject homePageObject = new HomePageObject(driver);

    @When("^I hover over the menu option as \"(.*?)\" and select the submenu option as \"(.*?)\"$")
    public void i_hover_over_the_menu_option_as_and_select_the_submenu_option_as(String menu, String submenu) throws Throwable {
       Thread.sleep(5000);
        homePageObject.menuSubmenuOption(menu,submenu);

    }

    @Then("^I should be on the selected option page$")
    public void i_should_be_on_the_selected_option_page() throws Throwable {
        Thread.sleep(6000);
        homePageObject.validateSubmenuPage();
    }

}

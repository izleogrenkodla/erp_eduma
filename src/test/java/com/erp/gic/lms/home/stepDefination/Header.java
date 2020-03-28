package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Header {

    HomePageObject homePageObject = new HomePageObject();

    @When("^I hover over the menu option as \"(.*?)\"$")
    public void i_hover_over_the_menu_option_as(String menu) throws Throwable {
        homePageObject.hoverOverMenu(menu);
    }

    @When("^I select the submenu option as \"(.*?)\"$")
    public void i_select_the_submenu_option_as(String submenu) throws Throwable {
        homePageObject.submenuOption(submenu);
    }

    @Then("^I should be on \"(.*?)\" page$")
    public void i_should_be_on_page(String optionPage) throws Throwable {
        homePageObject.validateMenuPage(optionPage);
    }

    @When("^I click on the menu option \"(.*?)\"$")
    public void i_click_on_the_menu_option(String menuClick) throws Throwable {
        homePageObject.menuClick(menuClick);
    }
}
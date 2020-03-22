package com.erp.gic.lms.login.stepDefination;

import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSD {

    public static WebDriver driver;
    LoginPageObject loginPageObject = new LoginPageObject();

    @Given("^I am on the application url$")
    public void i_am_on_the_application_url() throws Throwable {
        loginPageObject.launch("http://sethuonline.com/lms_r2/");
    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        loginPageObject.loginClick();
    }

    @When("^I enter the username as \"(.*?)\" and password as \"(.*?)\" and click on login button$")
    public void i_enter_the_username_as_and_password_as_and_click_on_login_button(String username, String password) throws Throwable {
        Thread.sleep(3000);
        loginPageObject.getLoginDetails(username,password);
    }

    @Then("^I should be successfully logged in and be on home page$")
    public void i_should_be_successfully_logged_in_and_be_on_home_page() throws Throwable {
        Thread.sleep(3000);
        loginPageObject.validateLogin();
        loginPageObject.browserQuit();
    }

}

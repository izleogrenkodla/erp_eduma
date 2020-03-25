package com.erp.gic.lms.home.stepDefination;

import com.erp.gic.lms.home.HomePageObject;
import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.en.When;

public class HeaderWithMenuOption extends LoginPageObject {

    HomePageObject homePageObject = new HomePageObject(driver);
    
    @When("^I click on the menu option \"(.*?)\"$")
    public void i_click_on_the_menu_option(String menu) throws Throwable {
        Thread.sleep(3000);
       homePageObject.menuClick(menu);
    }
}

package com.erp.gic.lms;

import com.erp.gic.lms.login.LoginPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LMSHooks {

    LoginPageObject loginPageObject = new LoginPageObject();

    @Before
    public void beforeTest()
    {
        loginPageObject.browserLaunch();
    }

    @After
    public void afterTest()
    {
        loginPageObject.browserQuit();
    }
}

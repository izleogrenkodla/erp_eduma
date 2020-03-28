package com.erp.gic.lms;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = false,strict = true
        ,format = {"html:reports/cucumber-pretty","json:reports/cucumber.json"}
        //,tags = {"@login,@instructor"}
        )
public class LMSRunner {
}

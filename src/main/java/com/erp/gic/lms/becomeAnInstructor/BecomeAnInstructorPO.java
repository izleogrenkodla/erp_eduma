package com.erp.gic.lms.becomeAnInstructor;

import com.erp.gic.lms.login.LoginPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BecomeAnInstructorPO extends LoginPageObject {

    int i = 0;

    @FindBy(xpath = "//*[@id=\"1471191075767-71032b6f-42fe\"]/div[2]/div/div")
    WebElement instructor;

    @FindBy(xpath = "//*[@id=\"1471191075781-f8bcfdd3-4be6\"]/div[2]/div/div")
    WebElement rules;

    @FindBy(xpath = "//*[@id=\"1471191079146-bea36456-c6e5\"]/div[2]/div/div")
    WebElement course;

    public void selectTab(String tab)
    {
        implicitWait();
        if(tab.equals("Become an Instructor"))
        {
            i = 1;
        }
        else if(tab.equals("Instructor Rules"))
        {
            i = 2;
        }
        else if (tab.equals("Start with courses"))
        {
            i = 3;
        }
        driver.findElement(By.xpath("//*[@id=\"post-2780\"]/div/div[5]/div[2]/div/div/div/div/div[1]/ul/li["+i+"]/a")).click();
    }

    //validate tab description
    public void validateTabDesc(String desc)
    {
        if(desc.equals("Instructor"))
        {
            instructor.isDisplayed();
        }
        else if (desc.equals("Rules"))
        {
            rules.isDisplayed();
        }
        else if (desc.equals("Course"))
        {
           course.isDisplayed();
        }
    }
}
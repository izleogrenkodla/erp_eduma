package com.erp.gic.lms.home;

import com.erp.gic.lms.login.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject{

    public HomePageObject(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="s")
    WebElement searchTxtFld;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/ul/li[1]/a")
    WebElement courseNameDropDown;

    @FindBy(xpath="//*[@id=\"lp-single-course\"]/h1")
    WebElement courseName;

    public void searchFunction(String text) throws Exception
    {
       searchTxtFld.sendKeys(text);
       Thread.sleep(3000);
       courseNameDropDown.click();
    }

    public void CourseNameValidation()
    {
        courseName.isDisplayed();
    }
}

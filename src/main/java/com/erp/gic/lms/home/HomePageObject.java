package com.erp.gic.lms.home;

import com.erp.gic.lms.login.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject{

    @FindBy(name="s")
    WebElement searchTxtFld;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/ul/li[1]/a")
    WebElement courseNameDropDown;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/ul/li/i")
    WebElement noCourseDropDown;

    @FindBy(xpath="//*[@id=\"lp-single-course\"]/h1")
    WebElement courseName;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[1]/a")
    WebElement scrollClick;

    @FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div/div/div[1]/div/div/a[1]")
    WebElement collection1;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[3]/div/div/div/div/div/div[2]/div/div/a[1]")
    WebElement collection2;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[3]/div/div/div/div/div/div[3]/div[1]/div/div/a[1]")
    WebElement collection3;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[3]/div/div/div/div/div/div[3]/div[2]/div/div/a[1]")
    WebElement collection4;

    @FindBy(xpath="//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h2")
    WebElement collectionPage;

    public HomePageObject(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    /*Valid search click code*/
    public void validSearchFunction(String text) throws Exception
    {
       searchTxtFld.sendKeys(text);
       Thread.sleep(5000);
       courseNameDropDown.click();
    }

    /*Invalid search click code*/
    public void invalidSearchFunction(String text) throws Exception
    {
        searchTxtFld.sendKeys(text);
    }

    /*Validate valid course display*/
    public void courseNameValidation()
    {
        courseName.isDisplayed();
    }

    /*Validate invalid course display*/
    public void invalidSearchDisplay()
    {
        noCourseDropDown.isDisplayed();
    }

    /*Scroll click code*/
    public void scrollclickcode()
    {
        scrollClick.click();
    }

    /*Validate collection display*/
    public void validateCollectionDisplay()
    {
        collection1.isDisplayed();
    }

    /*Validate collection click*/
    public void collectionClick(String collectionName)
    {
        String value;
        switch (value = collectionName) {
            case "Education WordPress Theme":
                collection1.click();
                break;
            case "Best Courses for Photography":
                collection2.click();
                break;
            case "Top Tutorials Code for Startup":
                collection3.click();
                break;
            case"The Top PHP Tutorials":
                collection4.click();
                break;
            default:
        }
    }

    /*Validate collection page*/
    public void collectionPageDisplay()
    {
        collectionPage.isDisplayed();
    }
}

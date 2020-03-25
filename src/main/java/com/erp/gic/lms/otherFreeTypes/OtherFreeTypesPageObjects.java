package com.erp.gic.lms.otherFreeTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherFreeTypesPageObjects {

public static WebDriver driverLoc;
    @FindBy(xpath = "//*[@id=\"lp-single-course\"]/div[1]/div[1]/div/div/a")
    WebElement admin;
    public OtherFreeTypesPageObjects(WebDriver driver)
    {

    this.driverLoc=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"menu-item-8148\"]/a")
    WebElement courses;
    @FindBy(xpath = "//*[@id=\"menu-item-8145\"]/a")
    WebElement otherFreeTypes;
@FindBy(xpath = "//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h2")
WebElement technology;
public void technology(){
    technology.isDisplayed();
}

    @FindBy(xpath = "//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h1")
    WebElement profile;
    public void profile()
    {
        profile.isDisplayed();
    }
    public void courses()
    {

        Actions hover = new Actions(driverLoc);

            hover.moveToElement(courses).perform();
     otherFreeTypes.click();
        }
    public void admin()
    {
        admin.click();
    }

}

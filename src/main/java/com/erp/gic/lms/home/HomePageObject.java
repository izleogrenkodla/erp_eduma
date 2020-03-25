package com.erp.gic.lms.home;

import com.erp.gic.lms.login.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject{

    public static WebDriver driverLoc;
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

    @FindBy(xpath = "//*[@id=\"menu-item-8148\"]/a")
    WebElement hoverCourses;

    @FindBy(xpath = "//*[@id=\"menu-item-8110\"]/a")
    WebElement hoverFeatures;

    @FindBy(xpath="//*[@id=\"breadcrumbs\"]/li[1]/a")
    WebElement submenuPageDisplay1;

    public HomePageObject(WebDriver driver)
    {
        this.driverLoc = driver;
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

    //hover menu and click submenu
    public void menuSubmenuOption(String menu,String submenu)
    {
        int i = 0;
        Actions hover = new Actions(driverLoc);
        if (menu.equals("COURSES"))
        {
            hover.moveToElement(hoverCourses).perform();
            if(submenu.equals("Free Access Type"))
            {
                i = 8143;
            }
            else if(submenu.equals("Other Free Type"))
            {
                i = 8145;
            }
            else if (submenu.equals("Paid Type"))
            {
                i = 8144;
            }
            else if(submenu.equals("Other Paid Type"))
            {
                i = 8146;
            }
            else if (submenu.equals("Courses Archive"))
            {
                i = 8131;
            }
            else if(submenu.equals("Demo Accounts"))
            {
                i = 8130;
            }
            else if (submenu.equals("Become an Instructor"))
            {
                i = 8132;
            }
            else if (submenu.equals("Instructor Profile"))
            {
                i = 8133;
            }
        }
        else if(menu.equals("FEATURES")) {
            hover.moveToElement(hoverFeatures).perform();
            if (submenu.equals("Gallery")) {
                i = 8135;
            } else if (submenu.equals("About Us")) {
                i = 8122;
            } else if (submenu.equals("FAQs")) {
                i = 8111;
            }
        }
        driverLoc.findElement(By.xpath("//*[@id=\"menu-item-"+i+"\"]/a")).click();
    }

    //validate menu and submenu page
    public void validateSubmenuPage()
    {
        submenuPageDisplay1.isDisplayed();
    }

    //menu option click
    public void menuClick(String menu)
    {
        int i = 0;
        if (menu.equals("HOME"))
        {
            i = 8141;
        }
        else if (menu.equals("COURSES"))
        {
            i = 8148;
        }
        else if (menu.equals("EVENTS"))
        {
            i = 8149;
        }
        else if (menu.equals("PORTFOLIO"))
        {
            i = 8134;
        }
        else if (menu.equals("BLOG"))
        {
            i = 8113;
        }
        else if (menu.equals("CONTACT"))
        {
            i = 8112;
        }
        else if (menu.equals("SHOP"))
        {
            i = 8114;
        }
        driverLoc.findElement(By.xpath("//*[@id=\"menu-item-"+i+"\"]/a")).click();
    }
}

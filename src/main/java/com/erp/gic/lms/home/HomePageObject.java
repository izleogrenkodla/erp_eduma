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
    int i = 0;

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

    @FindBy(xpath="//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h2")
    WebElement submenuPageName1;

    @FindBy(xpath="//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h1")
    WebElement submenuPageName2;

    @FindBy(xpath="//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h1")
    WebElement profilePage;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/a")
    WebElement viewAllBtn;

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
    public void validateSubmenuPage(String page)
    {
        if(page.equals("HOME"))
        {
            searchTxtFld.isDisplayed();
        }
        else if(page.equals("GENERAL"))
        {
            Assert.assertEquals(submenuPageName1.getText(),"GENERAL");
        }
        else if (page.equals("TECHNOLOGY"))
        {
            Assert.assertEquals(submenuPageName1.getText(),"TECHNOLOGY");
        }
        else if (page.equals("BACKEND"))
        {
            Assert.assertEquals(submenuPageName1.getText(),"BACKEND");
        }
        else if (page.equals("ALL COURSES"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"ALL COURSES");
        }
        else if (page.equals("DEMO ACCOUNTS"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"DEMO ACCOUNTS");
        }
        else if (page.equals("BECOME A TEACHER"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"BECOME A TEACHER");
        }
        else if (page.equals("GALLERY"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"GALLERY");
        }
        else if (page.equals("ABOUT US"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"ABOUT US");
        }
        else if (page.equals("FAQ PAGE"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"FAQ PAGE");
        }
        else if (page.equals("ALL COURSES"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"ALL COURSES");
        }
        else if (page.equals("EVENTS"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"EVENTS");
        }
        else if (page.equals("PORTFOLIO MASONRY"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"PORTFOLIO MASONRY");
        }
        else if (page.equals("BLOG"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"BLOG");
        }
        else if (page.equals("CONTACT"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"CONTACT");
        }
        else if (page.equals("SHOP"))
        {
            Assert.assertEquals(submenuPageName2.getText(),"SHOP");
        }
        else if(page.isEmpty())
        {
            submenuPageName2.isDisplayed();
        }
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

    //popular course section value
    public int popularCourseCode(String courseName)
    {
        if(courseName.equals("Introduction LearnPress – LMS plugin"))
        {
            i = 1;
        }
        else if (courseName.equals("Learn Python – Interactive Python Tutorial"))
        {
            i = 2;

        }
        else if (courseName.equals("Your Complete Guide to Photography"))
        {
            i = 3;

        }
        else if (courseName.equals("Learning jQuery Mobile for Beginners"))
        {
            i = 4;
        }
        else if(courseName.equals("Become a PHP Master and Make Money Fast"))
        {
            i = 5;
        }
        else if (courseName.equals("The Art of Black and White Photography"))
        {
            i = 6;

        }
        else if (courseName.equals("HTML5/CSS3 Essentials in 4-Hours"))
        {
            i = 7;

        }
        else if (courseName.equals("Complete Beginner to JavaScript Developer"))
        {
            i = 8;
        }

        return i;
    }

    //popular course section course and click read more button

    public void clickReadMore(int value)
    {
        Actions hover = new Actions(driverLoc);
        WebElement imageHover = driverLoc.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[1]/a[1]"));
        hover.moveToElement(imageHover).perform();
        driverLoc.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[1]/a[2]")).click();
    }

    //course name click
    public void courseNameClick(int value)
    {
        driverLoc.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[2]/h2/a")).click();
    }

    //course name click
    public void adminLink(int value)
    {
        driverLoc.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[2]/div[1]/div/div/a")).click();
    }


    //validate course name page
    public void courseNamePage(String courseNameValue)
    {
        Assert.assertEquals(courseNameValue,courseName.getText());
    }

    //validate profile page
    public void profilePage()
    {
        Assert.assertEquals("PROFILE",profilePage.getText());
    }

    //view all button click
    public void viewAllClick()
    {
        viewAllBtn.click();
    }



}

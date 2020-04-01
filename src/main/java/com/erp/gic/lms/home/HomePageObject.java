package com.erp.gic.lms.home;

import com.erp.gic.lms.login.LoginPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends LoginPageObject{
    
    int i = 0;
    
    @FindBy(name="s")
    WebElement searchTxtFld;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/ul/li[1]/a")
    WebElement courseNameDropDown;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/ul/li/i")
    WebElement noCourseDropDown;

    @FindBy(xpath="//*[@id=\"lp-single-course\"]/h1")
    WebElement courseNameDisplay;

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

    @FindBy(xpath="//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h1")
    WebElement submenuPageName1;

    @FindBy(xpath="//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h2")
    WebElement submenuPageName2;

    @FindBy(xpath="//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h1")
    WebElement profilePage;

    @FindBy(xpath="//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/a")
    WebElement viewAllBtn;

    @FindBy(xpath = "//*[@id=\"colophon\"]/div/div/div[1]/a")
    WebElement physCodePage;

    @FindBy(xpath="//*[@id=\"masthead\"]/div/div/div[2]/a[1]")
    WebElement thimpressPage;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div[1]/header/div[2]/div/div/a")
    WebElement envatoPage;

    @FindBy(xpath="//*[@id=\"wporg-header\"]/div/h1/a")
    WebElement wordPressPage;

    //Valid search click code
    public void validSearchFunction(String text)
    {
        implicitWait();
        searchTxtFld.sendKeys(text);
        courseNameDropDown.click();
    }

    //Invalid search click code
    public void invalidSearchFunction(String text)
    {
        implicitWait();
        searchTxtFld.sendKeys(text);
    }

    //Validate valid course display
    public void courseNameValidation()
    {
        implicitWait();
        courseNameDisplay.isDisplayed();
    }

    //Validate invalid course display
    public void invalidSearchDisplay()
    {
        noCourseDropDown.isDisplayed();
    }

    //Scroll click code
    public void scrollClickCode()
    {
        scrollClick.click();
    }

    //Validate collection display
    public void validateCollectionDisplay()
    {
        collection1.isDisplayed();
    }

    //Validate collection click
    public void collectionClick(String collectionName)
    {
        implicitWait();
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

    //Validate collection page
    public void collectionPageDisplay()
    {
        collectionPage.isDisplayed();
    }

    //hover over header menu
    public void hoverOverMenu(String menu)
    {
        implicitWait();
        Actions hover = new Actions(driver);
        if (menu.equals("COURSES"))
        {
            hover.moveToElement(hoverCourses).perform();
        }
        else if(menu.equals("FEATURES")) {
            hover.moveToElement(hoverFeatures).perform();
        }
    }

    //click submenu
    public void submenuOption(String submenu)
    {
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
            else if (submenu.equals("Gallery"))
            {
                i = 8135;
            } else if (submenu.equals("About Us"))
            {
                i = 8122;
            } else if (submenu.equals("FAQs"))
            {
                i = 8111;
            }
            driver.findElement(By.xpath("//*[@id=\"menu-item-"+i+"\"]/a")).click();
    }

    //validate submenu page
    public void validateMenuPage(String page)
    {
        if(page.equals("GENERAL"))
        {
        Assert.assertEquals("General",submenuPageName2.getAttribute("innerHTML"));
        }
        else if (page.equals("TECHNOLOGY"))
        {
            Assert.assertEquals("Technology",submenuPageName2.getAttribute("innerHTML"));
        }
        else if (page.equals("BACKEND"))
        {
            Assert.assertEquals("Backend",submenuPageName2.getAttribute("innerHTML"));
        }
        else if (page.equals("ALL COURSES"))
        {
            Assert.assertEquals("All Courses",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("DEMO ACCOUNTS"))
        {
            Assert.assertEquals("Demo Accounts",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("BECOME A TEACHER"))
        {
            Assert.assertEquals("Become a Teacher",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("GALLERY"))
        {
            Assert.assertEquals("Gallery",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("ABOUT US"))
        {
            Assert.assertEquals("About Us",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("FAQ PAGE"))
        {
            Assert.assertEquals("FAQ Page",submenuPageName1.getAttribute("innerHTML"));
        }
        else if(page.equals("HOME"))
        {
            searchTxtFld.isDisplayed();
        }
        else if (page.equals("EVENTS"))
        {
            Assert.assertEquals("Events",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("PORTFOLIO MASONRY"))
        {
            Assert.assertEquals("Portfolio Masonry",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("BLOG"))
        {
            Assert.assertEquals("Blog",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("CONTACT"))
        {
            Assert.assertEquals("Contact",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("SHOP"))
        {
            Assert.assertEquals("Shop",submenuPageName1.getAttribute("innerHTML"));
        }
        else if (page.equals("Phys code"))
        {
            physCodePage.isDisplayed();
        }
        else if (page.equals("THIMPRESS"))
        {
            thimpressPage.isDisplayed();
        }
        else if (page.equals("envarto Market Page"))
        {
            envatoPage.isDisplayed();
        }
        else if (page.equals("WordPress.Org"))
        {
            wordPressPage.isDisplayed();
        }
        else if(page.isEmpty())
        {
            submenuPageName2.isDisplayed();
        }
    }

    //menu option click
    public void menuClick(String menu)
    {
        implicitWait();
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
        driver.findElement(By.xpath("//*[@id=\"menu-item-"+i+"\"]/a")).click();
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
        implicitWait();
        Actions hover = new Actions(driver);
        WebElement imageHover = driver.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[1]/a[1]"));
        hover.moveToElement(imageHover).perform();
        driver.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[1]/a[2]")).click();
    }

    //course name click
    public void courseNameClick(int value)
    {
        driver.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[2]/h2/a")).click();
    }

    //course name click
    public void adminLink(int value)
    {
        driver.findElement(By.xpath("//*[@id=\"main-home-content\"]/div[4]/div/div/div/div[2]/div/div["+value+"]/div/div[2]/div[1]/div/div/a")).click();
    }

    //validate course name page
    public void courseNamePage(String courseNameValue)
    {
        Assert.assertEquals(courseNameValue,courseNameDisplay.getAttribute("innerHTML"));
    }

    //validate profile page
    public void profilePage()
    {
        Assert.assertEquals("Profile",profilePage.getAttribute("innerHTML"));
    }

    //view all button click
    public void viewAllClick()
    {
        viewAllBtn.click();
    }

    //footer click
    public void footerClick(String footer,String section)
    {
        implicitWait();
        if(footer.equals("About Us"))
        {
            i = 8123;
        }
        else if(footer.equals("Blog"))
        {
            i = 8126;
        }
        else if (footer.equals("Contact"))
        {
            i = 8124;
        }
        else if(footer.equals("Become a Teacher"))
        {
            i = 8125;
        }
        else if(footer.equals("Courses"))
        {
            i = 8147;
        }
        else if(footer.equals("Events"))
        {
            i = 8127;
        }
        else if(footer.equals("Gallery"))
        {
            i = 8136;
        }
        else if(footer.equals("FAQs"))
        {
            i = 8128;
        }
        else if(footer.equals("Documentation"))
        {
            i = 8115;
        }
        else if(footer.equals("Forums"))
        {
            i = 8116;
        }
        else if(footer.equals("Language Packs"))
        {
            i = 8117;
        }
        else if(footer.equals("Release status"))
        {
            i = 8118;
        }
        else if(footer.equals("WordPress"))
        {
            i = 8139;
        }
        else if(footer.equals("LearnPress"))
        {
            i = 8140;
        }
        else if(footer.equals("WooCommerce"))
        {
            i = 8129;
        }
        else if(footer.equals("bbPress"))
        {
            i = 8137;
        }
        driver.findElement(By.xpath("//*[@id=\"menu-item-"+i+"\"]/a")).click();
    }

    public void footer(String linkText)
    {
        if(linkText.equals("Privacy"))
        {
            i = 8119;
        }
        else if(linkText.equals("Terms"))
        {
            i = 8120;
        }
        else if(linkText.equals("Sitemap"))
        {
            i = 8121;
        }
        else if(linkText.equals("Purchases"))
        {
            i = 8138;
        }
        driver.findElement(By.xpath("//*[@id=\"menu-item-"+i+"\"]/a")).click();

    }
}
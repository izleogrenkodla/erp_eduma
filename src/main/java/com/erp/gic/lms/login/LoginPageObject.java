package com.erp.gic.lms.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPageObject {

    public static WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath="//*[@id=\"login-popup-2\"]/div/div[1]/a")
    WebElement loginBtn;

    @FindBy(name="user_login")
    WebElement usernameTxtFld;

    @FindBy(name="user_password")
    WebElement passwordTxtFld;

    @FindBy(name="wp-submit")
    WebElement login;

    @FindBy(xpath="//*[@id=\"login-popup-2\"]/div/div/a[2]")
    WebElement logout;

    public LoginPageObject()
    {
        PageFactory.initElements(driver,this);
    }

    public void browserLaunch()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void browserQuit()
    {
        driver.quit();
    }

    public void loginClick()
    {
        implicitWait();
        loginBtn.click();
    }

    public void getLoginDetails(String username,String pwd)
    {
        usernameTxtFld.sendKeys(username);
        passwordTxtFld.sendKeys(pwd);
        login.click();
    }

    public void validateLogin()
    {
       logout.isDisplayed();
    }

    public void implicitWait()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void explicitWait(WebElement elementName)
    {
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(elementName));
    }
}
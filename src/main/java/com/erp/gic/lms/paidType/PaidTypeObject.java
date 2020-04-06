package com.erp.gic.lms.paidType;

import com.erp.gic.lms.login.LoginPageObject;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PaidTypeObject extends LoginPageObject {

    int i = 0;
    @FindBy(xpath = "//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h1")
    WebElement courseNameDisplay;

    @FindBy(xpath = "//*[@id=\"lp-single-course\"]/div[2]/form/button")
    WebElement checkoutbutton;

    @FindBy(id = "billing_first_name")
    WebElement firstNameTxt;

    @FindBy(id = "billing_last_name")
    WebElement lastNameTxt;

    @FindBy(id="billing_company")
    WebElement companyNameTxt;

    @FindBy(id = "billing_country")
    WebElement countryTxt;

    @FindBy(id="order_comments")
    WebElement orderNotesTxt;

    @FindBy(id="billing_address_1")
    WebElement address1Txt;

    @FindBy(id="billing_address_2")
    WebElement address2Txt;

    @FindBy(id="billing_city")
    WebElement townTxt;

    @FindBy(id="billing_state")
    WebElement countryAddressTxt;

    @FindBy(id="billing_postcode")
    WebElement postcodeTxt;

    @FindBy(id="billing_phone")
    WebElement phoneTxt;

    @FindBy(id="billing_email")
    WebElement emailTxt;

    @FindBy(xpath="//*[@id=\"payment_method_cod\"]")
    WebElement cashOnDelivery;

    @FindBy(xpath = "//*[@id=\"payment_method_instamojo\"]")
    WebElement instamojo;

    @FindBy(id="place_order")
    WebElement placeOrder;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/p[2]")
    WebElement paymentPage;

    public void allCourseClick(String course)
    {
        implicitWait();
        if(course.equals("BACKEND"))
        {
            i = 1;
        }
        else if (course.equals("CSS"))
        {
            i = 2;
        }
        else if (course.equals("FRONTEND"))
        {
            i = 3;
        }
        else if (course.equals("GENERAL"))
        {
            i = 4;
        }
        else if (course.equals("IT & SOFTWARE"))
        {
            i = 5;
        }
        else if (course.equals("PHOTOGRAPHY"))
        {
            i = 6;
        }
        else if (course.equals("PROGRAMMING LANGUAGE"))
        {
            i = 7;
        }
        else if (course.equals("TECHNOLOGY"))
        {
            i = 8;
        }
        driver.findElement(By.xpath("//*[@id=\"course-categories-2\"]/div/ul/li["+i+"]/a")).click();
    }

    public void courseDisplay(String courseNameValidate)
    {
        explicitWait(courseNameDisplay);
        Assert.assertEquals(courseNameValidate,courseNameDisplay.getText());
    }

    public void clickCheckoutBtn()
    {
        checkoutbutton.click();
    }

    public void getBillingDetails(String firstName, String lastName, String companyName, String countryData, String orderNotes, String address1, String address2, String town, String countryAddress, String postcode, String phone, String email, String payment) throws InterruptedException {

        firstNameTxt.clear();
        firstNameTxt.sendKeys(firstName);

        lastNameTxt.clear();
        lastNameTxt.sendKeys(lastName);

        companyNameTxt.clear();
        companyNameTxt.sendKeys(companyName);

        Select selectObj = new Select(countryTxt);
        selectObj.selectByVisibleText(countryData);

        orderNotesTxt.clear();
        orderNotesTxt.sendKeys(orderNotes);

        address1Txt.clear();
        address1Txt.sendKeys(address1);

        address2Txt.clear();
        address2Txt.sendKeys(address2);

        townTxt.clear();
        townTxt.sendKeys(town);

        countryAddressTxt.clear();
        countryAddressTxt.sendKeys(countryAddress);

        postcodeTxt.clear();
        postcodeTxt.sendKeys(postcode);

        emailTxt.clear();
        emailTxt.sendKeys(email);

        if(payment.equals("Cash on delivery"))
        {
            Thread.sleep(7000);
            cashOnDelivery.click();
        }
        else if(payment.equals("Instamojo"))
        {
            Thread.sleep(7000);
            instamojo.click();
        }
    }

    public void clickPlaceOrder() throws InterruptedException {
        placeOrder.click();
    }

    public void paymentPage()
    {
        explicitWait(paymentPage);
        Assert.assertEquals("Instapay",paymentPage.getText());
    }
}

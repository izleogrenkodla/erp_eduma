package com.erp.gic.lms.paidType.stepDefination;

import com.erp.gic.lms.login.LoginPageObject;
import com.erp.gic.lms.paidType.PaidTypeObject;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class PaidType{

    PaidTypeObject paidObj = new PaidTypeObject();

    @When("^I click on \"(.*?)\" link  in course section$")
    public void i_click_on_link_in_course_section(String courseName) throws Throwable {
        paidObj.allCourseClick(courseName);
    }

    @Then("^I should be on \"(.*?)\" course page$")
    public void i_should_be_on_course_page(String courseName) throws Throwable {
        paidObj.courseDisplay(courseName);
    }

    @Given("^I click on checkout button under course name$")
    public void i_click_on_checkout_button_under_course_name() throws Throwable {
        paidObj.clickCheckoutBtn();
    }

    @Given("^I enter my billing details first name as \"(.*?)\" last name as \"(.*?)\" company name as \"(.*?)\" country as \"(.*?)\" order notes as \"(.*?)\" street address as \"(.*?)\" and \"(.*?)\" town as \"(.*?)\" country as \"(.*?)\" postcode as \"(.*?)\" phone no as \"(.*?)\" email as \"(.*?)\" and payment as \"(.*?)\"$")
    public void i_enter_my_billing_details_first_name_as_last_name_as_company_name_as_country_as_order_notes_as_street_address_as_and_town_as_country_as_postcode_as_phone_no_as_email_as_and_payment_as(String firstName, String lastName, String companyName, String countryData, String orderNotes, String address1, String address2, String town, String countryAddress, String postcode, String phone, String email, String payment) throws Throwable {
        paidObj.getBillingDetails(firstName,lastName,companyName,countryData,orderNotes,address1,address2,town,countryAddress,postcode,phone,email,payment);
    }

    @When("^I click on place order$")
    public void i_click_on_place_order() throws Throwable {
        paidObj.clickPlaceOrder();
    }

    @Then("^I should see success message$")
    public void i_should_see_success_message() throws Throwable {
        paidObj.paymentPage();
    }


}

package com.erp.gic.lms.shop.stepDefination;

import com.erp.gic.lms.shop.ShopPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shop {

    ShopPageObject shopObj = new ShopPageObject();
    int value;

    @When("^I click on product name \"(.*?)\"$")
    public void i_click_on_product_name(String product) throws Throwable {
        value =  shopObj.getProductNumber(product);
        shopObj.productNameClick(value);
    }

    @Then("^I should see \"(.*?)\"  product description$")
    public void i_should_see_product_description(String product) throws Throwable {
        shopObj.validateProductPage(product);
    }

    @Given("^I scroll down to bottom and click on next page$")
    public void i_scroll_down_to_bottom_and_click_on_next_page() throws Throwable {
        shopObj.nextPageClick();
    }
}

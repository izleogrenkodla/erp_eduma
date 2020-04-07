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

    @Given("^I hover over the cart icon of \"(.*?)\" product and click it$")
    public void i_hover_over_the_cart_icon_of_product_and_click_it(String product) throws Throwable {
        value =  shopObj.getProductNumber(product);
        shopObj.cartClick(value);
    }

    @Given("^I click on view cart button of \"(.*?)\" product$")
    public void i_click_on_view_cart_button_of_product(String product) throws Throwable {
        value =  shopObj.getProductNumber(product);
        shopObj.cartClickView(value);
    }

    @Given("^I click on proceed to checkout button$")
    public void i_click_on_proceed_to_checkout_button() throws Throwable {
        shopObj.clickCheckoutBtn();
    }

    @When("^I click on add to cart button$")
    public void i_click_on_add_to_cart_button() throws Throwable {
        shopObj.clickAddCart();
    }

    @Then("^I should be able to add the product to cart$")
    public void i_should_be_able_to_add_the_product_to_cart() throws Throwable {
        shopObj.viewCartBtn();
    }

    @When("^I click on view cart button$")
    public void i_click_on_view_cart_button() throws Throwable {
        shopObj.clickViewCart();
    }

    @Then("^I should see the cart page$")
    public void i_should_see_the_cart_page() throws Throwable {
        shopObj.cartPage();
    }




}

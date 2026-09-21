package com.saucedemo.stepdefinitions;

import io.cucumber.java.en.*;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.CompletePage;
import com.saucedemo.pages.OverviewPage;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.saucedemo.base.DriverManager;

public class CheckoutSteps {

    ProductsPage productPage =
            new ProductsPage(DriverManager.getDriver());

    CartPage cartPage =
            new CartPage(DriverManager.getDriver());

    CheckoutPage checkoutPage =
            new CheckoutPage(DriverManager.getDriver());
    OverviewPage overviewPage =
            new OverviewPage(DriverManager.getDriver());
    CompletePage completePage =
            new CompletePage(DriverManager.getDriver());

    @When("User adds product to cart")
    public void user_adds_product_to_cart() {
        productPage.addProduct();
    }

    @When("User opens cart")
    public void user_opens_cart() {
        productPage.clickCart();
    }

    @When("User clicks checkout")
    public void user_clicks_checkout() {
        cartPage.clickCheckout();
    }

    @When("User enters checkout details")
    public void user_enters_checkout_details() {
    	checkoutPage.enterDetails("Ashiq","M","625001");

    	
    }
    @When("User clicks continue")
    public void user_clicks_continue() {

        checkoutPage.clickContinue();

    }
    @When("User clicks finish")
    public void user_clicks_finish() {
        overviewPage.clickFinish();
    }

    @Then("User should see order confirmation")
    public void user_should_see_order_confirmation() {
    	Assert.assertTrue(completePage.getSuccessMessage().contains("Thank you for your order"));
    }
}
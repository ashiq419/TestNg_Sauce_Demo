package com.saucedemo.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.saucedemo.base.DriverManager;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginSteps {
    private final WebDriver driver = DriverManager.getDriver();
    private final LoginPage loginPage = new LoginPage(driver);
    private final ProductsPage productsPage = new ProductsPage(driver);

    @Given("user is on the SauceDemo login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks the login button")
    public void user_clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should see the products page")
    public void user_should_see_products_page() {
        Assert.assertTrue("Products page was not displayed.",
                productsPage.isProductsPageDisplayed());
    }

   

}

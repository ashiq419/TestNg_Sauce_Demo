package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    By cartBtn = By.className("shopping_cart_link");

    public void addProduct() {
        driver.findElement(addToCartBtn).click();
    }

    public void clickCart() {
        driver.findElement(cartBtn).click();
        
    }
    By productTitle = By.className("title");

    public boolean isProductsPageDisplayed() {
        return driver.findElement(productTitle).isDisplayed();
    }
}
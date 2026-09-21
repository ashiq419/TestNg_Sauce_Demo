package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
   

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String value) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(value);
    }

    public void enterPassword(String value) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(value);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

   
}

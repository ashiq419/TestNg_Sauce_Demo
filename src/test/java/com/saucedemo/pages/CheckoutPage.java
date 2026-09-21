package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

 

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

   
    public void enterDetails(String fname, String lname, String zip) {

        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fname);

        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lname);

        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(zip);
    }
   

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }
}
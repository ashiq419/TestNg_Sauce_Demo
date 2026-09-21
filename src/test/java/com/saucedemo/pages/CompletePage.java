package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {

    WebDriver driver;

    By successMsg = By.className("complete-header");

    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
    
    
}
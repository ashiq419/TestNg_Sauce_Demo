package com.saucedemo.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    WebDriver driver;

   
    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }


   
    By finishBtn = By.id("finish");

    public void clickFinish() {
    	
        driver.findElement(finishBtn).click();
    }
}
# SauceDemo Cucumber Selenium Project

## Tech Stack
- Java 17
- Selenium WebDriver
- Cucumber 7
- JUnit 4
- Maven
- Page Object Model

## Covered Topics
1. Cucumber Options
2. HTML and JSON Cucumber Reports
3. Data Tables
4. Page Object Model
5. Background
6. Hooks
7. Tags
8. Positive and negative login
9. Add/remove cart
10. Product sorting

## Prerequisites
- JDK 17+
- Maven
- Google Chrome

Selenium Manager automatically handles the compatible ChromeDriver in recent Selenium versions.

## Run All Tests

From the project root:

mvn clean test

## Run Tagged Tests

mvn test -Dcucumber.filter.tags="@smoke"

## Reports

After execution:
- target/cucumber-report.html
- target/cucumber.json

## SauceDemo Credentials

Username: standard_user
Password: secret_sauce

Website:
https://www.saucedemo.com/

## Framework Flow

Feature File
   |
   v
Step Definitions
   |
   v
Page Objects
   |
   v
Selenium WebDriver

Hooks handle browser setup/cleanup.
Background contains common business-level steps.
CucumberOptions controls execution and reporting.

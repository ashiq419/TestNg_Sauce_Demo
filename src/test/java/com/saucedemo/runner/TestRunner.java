package com.saucedemo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.saucedemo",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber.json"
    },
    monochrome = true,
    publish = false
)
public class TestRunner {
}

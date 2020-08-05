package com.example.selenium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/com/example/selenium/cuke" }, glue = {"com/example/selenium/cuke"})
public class FindItemCheckoutCukeRunner {

}

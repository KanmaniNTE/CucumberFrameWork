package com.orangehrm.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features"
		,glue = {"com.orangehrm.stepDefinitions"}
		, tags = "@PIM01"
//		, tags = "@TC03 or @TC04"
		, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		, dryRun = true
		)	

public class TestRunner {

}

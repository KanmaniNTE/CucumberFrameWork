package com.orangehrm.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features"
		,glue = {"com.orangehrm.stepDefinitions"}
		, tags = "@TC01"
//		, dryRun = true
		)	

public class TestRunner {

}

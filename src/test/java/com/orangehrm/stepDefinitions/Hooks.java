package com.orangehrm.stepDefinitions;

import com.orangehrm.base.Generic;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;

public class Hooks {

	Generic generic = new Generic();
	public static Scenario scenario;

	@Before()
	public void initializeTest() throws Exception {
		generic.launchApplication();

	}

	@After()
	public void closeBrowser() {
		generic.quitBrowser();
	}
	
	@BeforeStep()
	public void loggerHtml(Scenario scenario) {
		Hooks.scenario = scenario;
	}
	
	
	@AfterStep()
	public void captureScreenshot(Scenario scenario) throws Exception {
		generic.attachScreenshot(scenario);
	}
}

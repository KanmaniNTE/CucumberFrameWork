package com.orangehrm.stepDefinitions;

import com.orangehrm.base.Generic;
import com.orangehrm.pages.CommonPage;

import io.cucumber.java.en.When;

public class PIM_StepDefinition {
	
	CommonPage commonPage = new CommonPage(Generic.getDriver());
	
	@When("user clicks on {string} menu")
	public void user_clicks_on_menu(String string) {
		commonPage.goToGivenPageInOrangehrm(string);
	}

}

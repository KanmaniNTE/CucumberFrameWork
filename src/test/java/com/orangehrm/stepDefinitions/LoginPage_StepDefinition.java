package com.orangehrm.stepDefinitions;

import com.orangehrm.base.Generic;
import com.orangehrm.pages.CommonPage;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_StepDefinition {
	
	Generic generic = new Generic();
	LoginPage loginPage = new LoginPage(Generic.getDriver());
	CommonPage commonPage = new CommonPage(Generic.getDriver());
	
	@Given("user launches OrangeHRM page")
	public void user_launches_orange_hrm_page() throws Exception {
		generic.openApplication();
		generic.maximizeBrowserAndImplicitWait(15);
	}
	
	@Given("user launches OrangeHRM page1")
	public void user_launches_orange_hrm_page1() {
	    
		throw new io.cucumber.java.PendingException();
	}
	
	@Then("validate user is on login page")
	public void validate_user_is_on_login_page() {
		commonPage.verifyPageHeader("Login", "h5");
	}
	
	@When("user enters username and password and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button() {
//		loginPage.loginOrangeHRM1();
		loginPage.loginOrangeHRM("Admin", "admin123");
	
	}
	
	@When("user enters username as {string} and password {string} and clicks on login button")
	public void user_enters_username_as_and_password_and_clicks_on_login_button(String string, String string2) {
		loginPage.loginOrangeHRM(string, string2);
	}
	
	@When("user enters {string} and {string} and clicks on login button")
	public void user_enters_and_and_clicks_on_login_button(String string, String string2) {

	}
	
	@Then("user able to see home page of OrangeHRM")
	public void user_able_to_see_home_page_of_orange_hrm() {
		commonPage.verifyPageHeader("Dashboard", "h6");
		generic.pause(3);
	}
	
	@Then("validate that user not able to login")
	public void validate_that_user_not_able_to_login() {
		loginPage.validateUserDontHaveAccess();
	}


}

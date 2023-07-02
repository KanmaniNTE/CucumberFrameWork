package com.orangehrm.stepDefinitions;

import org.junit.Test;

import com.orangehrm.base.Generic;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_StepDefinition extends Generic {
	
//	Generic generic = new Generic();
	LoginPage loginPage = new LoginPage(getDriver());
	
	@Given("user launches OrangeHRM page")
	public void user_launches_orange_hrm_page() throws Exception {
//		generic.LaunchApplication();
		loginPage.loginOrangeHRM1();
	}
	
	@Given("user launches OrangeHRM page1")
	public void user_launches_orange_hrm_page1() {
	    
		throw new io.cucumber.java.PendingException();
	}
	
	@Then("validate user is on login page")
	public void validate_user_is_on_login_page() {
	    
	    
	}
	@When("user enters username and password and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button() {
	    
	    
	}
	@Then("user able to see home page of OrangeHRM")
	public void user_able_to_see_home_page_of_orange_hrm() {
	    
	    
	}


}

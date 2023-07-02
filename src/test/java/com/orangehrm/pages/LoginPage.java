package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.Generic;

public class LoginPage {
	WebDriver driver;
	Generic generic = new Generic();
	CommonPage commonPage = new CommonPage(Generic.getDriver());
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//to show the webelements to driver.
	}
	
	@FindBy(tagName = "h5") 
	WebElement text_LoginHeader;
	
	@FindBy(name = "username")
	WebElement textBox_UserName;
	
	@FindBy(name = "password")
	WebElement textBox_Password;
	
	@FindBy(xpath = "//button[contains(@class,'orangehrm-login-button')]")
	WebElement button_Login;
	
	@FindBy(xpath = "//p[text() = 'Forgot your password? ']")
	WebElement link_forgotYourPassword;
	
	@FindBy(xpath = "//a[contains(@href,'linkedin')]")
	WebElement link_LinkedIn;
	
	@FindBy(xpath = "//a[contains(@href,'facebook')]")
	WebElement link_Facebook;
	
	@FindBy(xpath = "//a[contains(@href,'twitter')]")
	WebElement link_Twitter;
	
	@FindBy(xpath = "//a[contains(@href,'youtube')]")
	WebElement link_YouTube;
	
//	@FindAll(xpath = "//div[@class = 'orangehrm-login-footer-sm']//a")
//	WebElement link_SocialMedia;
	
	@FindBy(name = "username")
	WebElement textBox_ForgotPassword_UserName;
	
	@FindBy(tagName = "h6")
	WebElement text_ResetPasswordHeader;
	
	@FindBy(xpath = "//button[text() = ' Cancel ']")
	WebElement button_Cancel;
	
	@FindBy(xpath = "//button[text() = ' Reset Password ']")
	WebElement button_resetPassword;
	
	@FindBy(tagName = "h6")
	WebElement text_ResetPasswordLinkSent;
	
//	@FindBy()
//	WebElement ;
	
	
	public void loginOrangeHRM(String userName, String password) {
		textBox_UserName.sendKeys(userName);
		textBox_Password.sendKeys(password);
		button_Login.click();
	}
	
	public void loginOrangeHRM1() {
//		base.sendTextToAnWebElement(textBox_UserName, "Admin");
//		base.sendTextToAnWebElement(textBox_Password, "admin123");
//		base.clickAnWebElement(button_Login);
		textBox_UserName.sendKeys("Admin");
		textBox_Password.sendKeys("admin123");
		button_Login.click();
//		base.pause(10);
	}
	
	
	public void forgotPassword(String userName) {
		link_forgotYourPassword.click();
		generic.waitForElementToBeVisible(text_ResetPasswordHeader, 5);
		textBox_ForgotPassword_UserName.sendKeys(userName);
		button_resetPassword.click();
		commonPage.verifyAPageByWebElement(text_ResetPasswordLinkSent, "Reset Password link sent successfully");
	}
	

}

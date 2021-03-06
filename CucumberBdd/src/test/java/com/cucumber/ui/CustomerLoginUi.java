package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginUi {
	WebDriver driver;
	
	public CustomerLoginUi(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email'][@name='username']")
	public WebElement usernameTxtBox;
	
	@FindBy(xpath="//input[@type='password'][@name='password']")
	public WebElement passwordTxtBox;
	
	@FindBy(xpath="//button[@type='submit'][text()='Login']")
	public WebElement loginButton;

}

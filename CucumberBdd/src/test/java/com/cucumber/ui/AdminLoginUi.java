package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginUi {
	WebDriver driver;
	

	public AdminLoginUi(WebDriver driver){
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email'][@type='text']")
	public WebElement emailTxtBox;

	@FindBy(xpath="//input[@name='password'][@type='password']")
	public WebElement passwordTxtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submitButton;
}

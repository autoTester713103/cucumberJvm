package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CustomerLoginUi {
	WebDriver driver;
	
	public CustomerLoginUi(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath="//input[@type='email'][@name='username']")
	public WebElement usernameTxtBox;
	
	@FindBy(xpath="//input[@type='password'][@name='password']")
	public WebElement passwordTxtBox;
	
	@FindBy(xpath="//button[@type='submit'][text()='Login']")
	public WebElement loginButton;

}

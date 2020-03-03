package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AdminCustomerCreationUi {
	WebDriver driver;

	public AdminCustomerCreationUi(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath="//input[@name='fname']")
	public WebElement firstNameTxtBox;
	
	@FindBy(xpath="//input[@name='lname']")
	public WebElement lastNameTxtBox;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailTxtBox;

	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordTxtBox;
	
	@FindBy(xpath="//select[@name='country']")
	public WebElement countryDropDown;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submitButton;
}

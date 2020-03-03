package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CustomerHeaderTopNavUi {
	WebDriver driver;

	public CustomerHeaderTopNavUi(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath="//li[not(@class='fr')]//a[@id='dropdownCurrency']")
	public WebElement myAccountDropDown;
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement loginLink;
	
	@FindBy(xpath="//div[@class='header-nav']//a[text()='Home']")
	public WebElement homeLink;
	
	@FindBy(xpath="//*[text()='Logout']")
	public WebElement logoutLink;

}

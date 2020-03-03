package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AdminNavBarUi {
	WebDriver driver;
	
	public AdminNavBarUi(WebDriver driver){
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath="//*[@id='logout']")
	public WebElement logOutButton;
}

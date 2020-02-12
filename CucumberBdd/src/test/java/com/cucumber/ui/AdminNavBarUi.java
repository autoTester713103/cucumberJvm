package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminNavBarUi {
	WebDriver driver;
	
	public AdminNavBarUi(WebDriver driver){
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='logout']")
	public WebElement logOutButton;
}

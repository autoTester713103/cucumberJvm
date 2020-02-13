package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSideBarUi {
	WebDriver driver;

	public AdminSideBarUi(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#ACCOUNTS']")
	public WebElement accountsDropDownMenu;
	
	@FindBy(xpath="//a[text()='Customers']")
	public WebElement customerLink;

}

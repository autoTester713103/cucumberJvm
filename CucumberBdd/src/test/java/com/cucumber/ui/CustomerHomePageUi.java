package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerHomePageUi {
	WebDriver driver;

	public CustomerHomePageUi(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='dest'][@type='search']")
	public WebElement destinationSearchBox;
	
	@FindBy(xpath="//ul[@class='select2-results']/li")
	public WebElement topDestinationOption;
	
	@FindBy(xpath="//input[@id='checkin']")
	public WebElement checkinDatePicker;
	
	@FindBy(xpath="//input[@id='checkout']")
	public WebElement checkOutDatePicker;
	
	@FindBy(xpath="//form[@name='HOTELS']//button[@type='submit']")
	public WebElement submitButton;
	
	@FindBy(xpath="//iframe[@id='chat-widget']")
	public WebElement chatWidget;
}

package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CustomerHomePageUi {
	WebDriver driver;

	public CustomerHomePageUi(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
	}

	@FindBy(xpath="//input[@name='dest'][@type='search']")
	public WebElement destinationSearchBox;
	
	@FindBy(xpath="//form[@name='HOTELS']//label[text()='Destination']/following-sibling::div[not(@class='clear')]/div")
	public WebElement destinationDiv;
	
	@FindBy(xpath="//ul[@class='select2-results']//ul[1]")
	public WebElement topDestinationOption;
	
	@FindBy(xpath="//input[@id='checkin']")
	public WebElement checkinDatePicker;
	
	@FindBy(xpath="//input[@id='checkout']")
	public WebElement checkOutDatePicker;
	
	@FindBy(xpath="//form[@name='HOTELS']//button[@type='submit']")
	public WebElement submitButton;
	
	@FindBy(xpath="//iframe[@id='chat-widget']")
	public WebElement chatWidget;
	
	@FindBy(xpath="//div[@dir='ltr']//button")
	public WebElement chatWidgetButton;
}

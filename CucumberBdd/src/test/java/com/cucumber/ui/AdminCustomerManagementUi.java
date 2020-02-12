package com.cucumber.ui;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdminCustomerManagementUi {
	WebDriver driver;

	public AdminCustomerManagementUi(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@type='submit'][contains(@class,'btn')]")
	public WebElement addButton;
	
	@FindBy(xpath="//iframe[@id='chat-widget']")
	public WebElement chatWidget;
	
	@FindBy(xpath="//button")
	public WebElement chatWidgetButton;
	
	@FindBy(xpath="//table")
	public WebElement customerTable;
	
	@FindBys(@FindBy(xpath="//table/tbody/tr"))
	public List<WebElement> customerTableRows;
	
	@FindBy(xpath="//div[@class='imagelogo']")
	public WebElement siteLogo;

}

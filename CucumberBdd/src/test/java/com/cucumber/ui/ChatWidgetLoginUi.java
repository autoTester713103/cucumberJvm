package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatWidgetLoginUi {
	WebDriver driver;

	public ChatWidgetLoginUi(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement nameTxtBox;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailTxtBox;
	
	@FindBy(xpath="//*[contains(text(),'Subject:')]/parent::label/following-sibling::input")
	public WebElement subjectTxtBox;
	
	@FindBy(xpath="//*[contains(text(),'Message:')]/parent::label/following-sibling::textarea")
	public WebElement messageTxtArea;
	
	@FindBy(xpath="//div[@dir='ltr']//button[@type='submit']")
	public WebElement leaveMessageButton;
	
	@FindBy(xpath="//div[@dir='ltr']//button[@type='button']")
	public WebElement minimizeChatButton;

}

package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerSearchResultsUi {
	WebDriver driver;

	public CustomerSearchResultsUi(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='loadMore']")
	public WebElement loadMoreButton;

}

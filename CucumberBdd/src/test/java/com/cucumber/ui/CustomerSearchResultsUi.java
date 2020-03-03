package com.cucumber.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CustomerSearchResultsUi {
	WebDriver driver;

	public CustomerSearchResultsUi(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath="//button[@id='loadMore']")
	public WebElement loadMoreButton;

}

package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.CustomerSearchResultsUi;

public class CustomerSearchResultsPo {
	private static final Logger log = LogManager.getLogger(CustomerSearchResultsPo.class);
	WebDriver driver;
	CustomerSearchResultsUi customerSearchResultsUi;

	public CustomerSearchResultsPo(WebDriver driver) {
		 this.driver = driver;
		 customerSearchResultsUi = new CustomerSearchResultsUi(driver);
	}
	
	public void viewMoreResults() {
		customerSearchResultsUi.loadMoreButton.click();
	}

}

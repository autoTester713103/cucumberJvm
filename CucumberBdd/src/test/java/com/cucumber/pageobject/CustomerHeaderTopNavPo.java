package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.CustomerHeaderTopNavUi;

public class CustomerHeaderTopNavPo {
	private static final Logger log = LogManager.getLogger(CustomerHeaderTopNavPo.class);
	WebDriver driver;
	CustomerHeaderTopNavUi customerHeaderTopNavUi;

	public CustomerHeaderTopNavPo(WebDriver driver) {
		 this.driver = driver;
		 customerHeaderTopNavUi = new CustomerHeaderTopNavUi(driver);
	}

	public void navigateToPage(String page) {
		log.traceEntry();
		
		switch (page) {
			case "Home Page":
				customerHeaderTopNavUi.homeLink.click();
				break;
			case "Login Page":
				customerHeaderTopNavUi.myAccountDropDown.click();
				customerHeaderTopNavUi.loginLink.click();
				break;
			case "Logout":
				customerHeaderTopNavUi.myAccountDropDown.click();
				customerHeaderTopNavUi.logoutLink.click();
				break;
			default:
				Assert.fail("Page link not available in top nav");
				
		}
		log.traceExit();
	}
}

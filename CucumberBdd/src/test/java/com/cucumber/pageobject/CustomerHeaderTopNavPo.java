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

	public void navigateToLogin() {
		log.traceEntry();
		customerHeaderTopNavUi.myAccountDropDown.click();
		customerHeaderTopNavUi.loginLink.click();
		log.traceExit();
	}
}

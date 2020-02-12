package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.CustomerHomePageUi;

public class CustomerHomePagePo {
	private static final Logger log = LogManager.getLogger(CustomerHomePagePo.class);
	WebDriver driver;
	CustomerHomePageUi customerHomePageUi;

	public CustomerHomePagePo(WebDriver driver) {
		 this.driver = driver;
		 customerHomePageUi = new CustomerHomePageUi(driver);
	}
	
	

}

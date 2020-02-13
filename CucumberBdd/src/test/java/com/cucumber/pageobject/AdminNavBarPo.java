package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.AdminNavBarUi;

public class AdminNavBarPo {
	private static final Logger log = LogManager.getLogger(AdminNavBarPo.class);
	WebDriver driver;
	AdminNavBarUi adminNavBarUi;

	public AdminNavBarPo(WebDriver driver) {
		this.driver = driver;
		adminNavBarUi = new AdminNavBarUi(driver);
	}

	public void logout() {
		log.traceEntry();
		adminNavBarUi.logOutButton.click();
		log.traceExit();
	}

}

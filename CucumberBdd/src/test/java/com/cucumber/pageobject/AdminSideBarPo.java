package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.AdminSideBarUi;

public class AdminSideBarPo {
	private static final Logger log = LogManager.getLogger(AdminSideBarPo.class);
	WebDriver driver;
	AdminSideBarUi adminSideBarUi;

	public AdminSideBarPo(WebDriver driver) {
		this.driver = driver;
		adminSideBarUi = new AdminSideBarUi(driver);
	}
	
	public void clickSideBarMenu(String link) {
		log.traceEntry();
		switch (link) {
			case "accounts":
				adminSideBarUi.accountsDropDownMenu.click();
				break;
			case "customer":
				adminSideBarUi.customerLink.click();
				break;
		}
		log.traceExit();
	}

}

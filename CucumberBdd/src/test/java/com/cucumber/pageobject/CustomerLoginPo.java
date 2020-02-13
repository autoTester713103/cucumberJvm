package com.cucumber.pageobject;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.CustomerLoginUi;

import cucumber.api.DataTable;

public class CustomerLoginPo {
	private static final Logger log = LogManager.getLogger(CustomerLoginPo.class);
	WebDriver driver;
	CustomerLoginUi customerLoginUi;

	public CustomerLoginPo(WebDriver driver) {
		 this.driver = driver;
		 customerLoginUi = new CustomerLoginUi(driver);
	}
	
	public void openPageAndLogin(DataTable dt) {
		log.traceEntry();
		
		List<Map<String, String>> map = dt.asMaps(String.class, String.class);
		Map<String, String> getMap = map.get(0);
		
		driver.get(getMap.get("url"));
		customerLoginUi.usernameTxtBox.clear();
		customerLoginUi.usernameTxtBox.sendKeys(getMap.get("Email"));
		customerLoginUi.passwordTxtBox.clear();
		customerLoginUi.passwordTxtBox.sendKeys(getMap.get("Password"));
		customerLoginUi.loginButton.click();
		log.traceExit();
	}

}

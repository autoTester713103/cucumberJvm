package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.AdminLoginUi;

public class AdminLoginPo {
	private static final Logger log = LogManager.getLogger(AdminLoginPo.class);
	WebDriver driver;
	AdminLoginUi adminLoginUi;
	private static String admin_url = "https://www.phptravels.net/admin";
	
	public AdminLoginPo(WebDriver driver) {
		this.driver = driver;
		adminLoginUi = new AdminLoginUi(driver);
	}
	
	public void openApp() {
		log.traceEntry();
		driver.get(admin_url);
		log.traceExit();
	}
	
	public void login(String username, String password) {
		log.traceEntry();
		adminLoginUi.emailTxtBox.clear();
		adminLoginUi.emailTxtBox.sendKeys(username);
		adminLoginUi.passwordTxtBox.clear();
		adminLoginUi.passwordTxtBox.sendKeys(password);
		adminLoginUi.submitButton.click();
		log.traceExit();
	}
}

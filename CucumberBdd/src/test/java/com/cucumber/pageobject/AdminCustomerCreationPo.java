package com.cucumber.pageobject;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.ui.AdminCustomerCreationUi;

import cucumber.api.DataTable;

public class AdminCustomerCreationPo {
	private static final Logger log = LogManager.getLogger(AdminCustomerCreationPo.class);
	WebDriver driver;
	AdminCustomerCreationUi adminCustomerCreationUi;

	public AdminCustomerCreationPo(WebDriver driver) {
		this.driver = driver;
		adminCustomerCreationUi = new AdminCustomerCreationUi(driver);
	}
	
	public void createCustomer(DataTable dt) {
		log.traceEntry();
		List<Map<String, String>> map = dt.asMaps(String.class, String.class);
		Map<String, String> getMap = map.get(0);
//		for(int x=0;x<map.size();x++) {
//			log.debug("list" + String.valueOf(x) + ":" + map.get(x));
//			log.debug("list" + String.valueOf(x) + ":" + map.get(x).get("First Name"));
//			log.debug("list" + String.valueOf(x) + ":" + map.get(x).get("Last Name"));
//		}
		adminCustomerCreationUi.firstNameTxtBox.clear();
		adminCustomerCreationUi.firstNameTxtBox.sendKeys(getMap.get("First Name"));
		adminCustomerCreationUi.lastNameTxtBox.clear();
		adminCustomerCreationUi.lastNameTxtBox.sendKeys(getMap.get("Last Name"));
		adminCustomerCreationUi.emailTxtBox.clear();
		adminCustomerCreationUi.emailTxtBox.sendKeys(getMap.get("Email"));
		adminCustomerCreationUi.passwordTxtBox.clear();
		adminCustomerCreationUi.passwordTxtBox.sendKeys(getMap.get("Password"));
		Select country = new Select(adminCustomerCreationUi.countryDropDown);
		country.selectByVisibleText(getMap.get("Country"));
		adminCustomerCreationUi.submitButton.click();
		
		log.traceExit();
		
	}

}

package com.cucumber.pageobject;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.ui.AdminCustomerManagementUi;

import cucumber.api.DataTable;

public class AdminCustomerManagementPo {
	private static final Logger log = LogManager.getLogger(AdminCustomerManagementPo.class);
	WebDriver driver;
	AdminCustomerManagementUi adminCustomerManagementUi;

	public AdminCustomerManagementPo(WebDriver driver) {
		this.driver = driver;
		adminCustomerManagementUi = new AdminCustomerManagementUi(driver);
	}
	
	public void clickAdd() {
		log.traceEntry();
		log.debug("Waiting for page to be ready");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(adminCustomerManagementUi.chatWidget));
		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		adminCustomerManagementUi.addButton.click();
	    
		log.traceExit();
	}
	
	public void verifyCustomerAdded (DataTable dt) {
		log.traceEntry();
		List<Map<String, String>> map = dt.asMaps(String.class, String.class);
		Map<String, String> getMap = map.get(0);
		for (WebElement row : adminCustomerManagementUi.customerTableRows) {
			log.debug(row.getText());
			if(row.getText().contains(getMap.get("First Name")) && row.getText().contains(getMap.get("Last Name")) && row.getText().contains(getMap.get("Email"))) {
				log.debug("Found customer");
				Assert.assertTrue("Customer Successfully Created", true);
				break;
			} else {
				Assert.fail("Did not see customer created on the list");
			}			
		}
		
		log.traceExit();
	}
}

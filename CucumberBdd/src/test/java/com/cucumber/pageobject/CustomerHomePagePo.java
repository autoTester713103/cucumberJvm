package com.cucumber.pageobject;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.ui.CustomerHomePageUi;

import cucumber.api.DataTable;

public class CustomerHomePagePo {
	private static final Logger log = LogManager.getLogger(CustomerHomePagePo.class);
	WebDriver driver;
	CustomerHomePageUi customerHomePageUi;

	public CustomerHomePagePo(WebDriver driver) {
		 this.driver = driver;
		 customerHomePageUi = new CustomerHomePageUi(driver);
	}
	
	public void openChatWidget() {
		log.traceEntry();
		
		driver.switchTo().frame(customerHomePageUi.chatWidget);
		customerHomePageUi.chatWidgetButton.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.traceExit();
	}
	
	public void searchRoom (DataTable dt) {
		log.traceEntry();
		
		List<Map<String, String>> map = dt.asMaps(String.class, String.class);
		Map<String, String> getMap = map.get(0);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(customerHomePageUi.chatWidget));
		driver.switchTo().defaultContent();
		
		customerHomePageUi.destinationDiv.click();
		customerHomePageUi.destinationSearchBox.clear();
		customerHomePageUi.destinationSearchBox.sendKeys(getMap.get("location"));
		customerHomePageUi.topDestinationOption.click();
		customerHomePageUi.checkinDatePicker.click();
		customerHomePageUi.checkinDatePicker.clear();		
		customerHomePageUi.checkinDatePicker.sendKeys(getMap.get("checkin"));
		customerHomePageUi.checkOutDatePicker.click();
		customerHomePageUi.checkOutDatePicker.clear();
		customerHomePageUi.checkOutDatePicker.sendKeys(getMap.get("checkout"));
		customerHomePageUi.submitButton.submit();
		
		log.traceExit();
	}

}

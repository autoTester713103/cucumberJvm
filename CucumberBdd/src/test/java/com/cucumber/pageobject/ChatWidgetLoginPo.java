package com.cucumber.pageobject;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.ChatWidgetLoginUi;

import cucumber.api.DataTable;

public class ChatWidgetLoginPo {
	private static final Logger log = LogManager.getLogger(AdminNavBarPo.class);
	WebDriver driver;
	ChatWidgetLoginUi chatWidgetLoginUi;

	public ChatWidgetLoginPo(WebDriver driver) {
		this.driver = driver;
		chatWidgetLoginUi = new ChatWidgetLoginUi(driver);
	}
	
	public void login(DataTable dt) {
		log.traceEntry();

		List<Map<String, String>> map = dt.asMaps(String.class, String.class);
		Map<String, String> getMap = map.get(0);
		
		chatWidgetLoginUi.nameTxtBox.clear();
		chatWidgetLoginUi.nameTxtBox.sendKeys(getMap.get("name"));
		chatWidgetLoginUi.emailTxtBox.clear();
		chatWidgetLoginUi.emailTxtBox.sendKeys(getMap.get("email"));
		chatWidgetLoginUi.subjectTxtBox.clear();
		chatWidgetLoginUi.subjectTxtBox.sendKeys(getMap.get("subject"));
		chatWidgetLoginUi.messageTxtArea.clear();
		chatWidgetLoginUi.messageTxtArea.sendKeys(getMap.get("message"));
		chatWidgetLoginUi.leaveMessageButton.submit();
		chatWidgetLoginUi.minimizeChatButton.click();
		
		driver.switchTo().defaultContent();
		
		log.traceExit();
	}

}

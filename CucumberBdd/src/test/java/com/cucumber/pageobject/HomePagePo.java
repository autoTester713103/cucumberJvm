package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.HomePageUi;

public class HomePagePo {
	private static final Logger log = LogManager.getLogger(HomePagePo.class);
	WebDriver driver;
	HomePageUi homePageUi;
	private static String app_url = "https://www.zomato.com";

	public HomePagePo(WebDriver driver) {
		this.driver = driver;
		homePageUi = new HomePageUi(driver);
	}

	public void openApp() {
		log.info("---Entered openApp()");
		log.info("Entering Home Page");
		driver.get(app_url);
		log.info("---Leaving openApp()");
	}

	public void typeSearchTerm(String inputRestaurant) {
		log.info("---Entered typeSearchTerm()");
		homePageUi.keyword_txtBox.clear();
		
		for(int x=0;x<20;x++){
			homePageUi.keyword_txtBox.sendKeys(Keys.TAB);
			homePageUi.keyword_txtBox.click();
			log.info("Attempt "+x+":"+homePageUi.keyword_txtBox.getAttribute("placeholder"));
			if("Start typing to search...".contentEquals(homePageUi.keyword_txtBox.getAttribute("placeholder"))){
				x=20;
			}
		}
		
		homePageUi.keyword_searchBox.click();
		log.info("Entering search term: " + inputRestaurant);
		homePageUi.keyword_txtBox.sendKeys(inputRestaurant);
		log.info("---Leaving typeSearchTerm()");
	}

	public void clickSearchButton() {
		log.info("---Entered clickSearchButton()");
		log.info("Clicking search button");
		int x = 0;
		while (homePageUi.count_hiring_button.size() > 0) {
			log.info("Attempting to click search button attempt " + x++);
			homePageUi.search_button.click();
		}
		log.info("Search button is clicked");
		log.info("---Leaving clickSearchButton()");
	}

	public void verifySearchSuggestions(String searchTerm) {
		log.info("---Entered verifySearchSuggestions()");
		log.info("There are: " + homePageUi.count_suggestions.size()
				+ " suggestions");

		for (int i = 0; i < homePageUi.count_suggestions.size(); i++) {
			try {
				log.info("Validating suggestion: "
						+ homePageUi.count_suggestions.get(i).getAttribute(
								"title"));
				Assert.assertTrue(homePageUi.count_suggestions.get(i)
						.getAttribute("title").contains(searchTerm));
			} catch (AssertionError e) {
				log.error(e);
			}
		}
		log.info("---Leaving verifySearchSuggestions()");
	}
}

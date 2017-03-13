package com.cucumber.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.ui.SearchResultsPageUi;

public class SearchResultsPagePo {
	private static final Logger log = LogManager
			.getLogger(SearchResultsPagePo.class);
	WebDriver driver;
	SearchResultsPageUi searchResultsPageUi;

	public SearchResultsPagePo(WebDriver driver) {
		this.driver = driver;
		log.info("Initializing SearchResultsPage");
		searchResultsPageUi = new SearchResultsPageUi(driver);
	}

	public void verifyList(String restaurant) {
		log.info("---Entered verifyList()");
		log.info("Verifying Search Result");
		Assert.assertTrue(searchResultsPageUi.search_results_finding.getText()
				.contains(restaurant.toLowerCase()));
		log.info("---Leaving verifyList()");
	}

	public void verifyNoResultsErrorMsg() {
		log.info("---Entered verifyNoResultsErrorMsg()");
		try {
			Assert.assertTrue("Error message is not displayed!",
					searchResultsPageUi.list_no_results_error.size() > 0);
		} catch (AssertionError e) {
			log.error(e);
		}
		log.info("---Leaving verifyNoResultsErrorMsg()");
	}

}

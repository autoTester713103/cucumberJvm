package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.SearchResultsPagePo;

import cucumber.api.java.en.Then;

public class SearchResultsPageStepDefs {
	
	SearchResultsPagePo searchResultsPagePo;
	Hooks hooks;
	
	public SearchResultsPageStepDefs() {
		searchResultsPagePo = new SearchResultsPagePo(hooks.driver);
	}
	
	@Then("^I should see a list of restaurants related to '(.*)'$")
	public void iShouldSeeAListOfRestaurantsRelatedTo(String restaurant){
		searchResultsPagePo.verifyList(restaurant);
	}
	
	@Then("^I should see an error message$")
	public void iShouldSeeAnErrorMessage() {
		searchResultsPagePo.verifyNoResultsErrorMsg();
	}
	
	
}
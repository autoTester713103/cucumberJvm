package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.CustomerSearchResultsPo;

import cucumber.api.java.en.*;

public class CustomerSearchResultsStepDefs {
	
	CustomerSearchResultsPo customerSearchResults;

	public CustomerSearchResultsStepDefs() {
		 customerSearchResults = new CustomerSearchResultsPo(Hooks.driver);
	}
	
	@When("^I see results")
	public void iSeeResults() {
		customerSearchResults.viewMoreResults();
	}

}

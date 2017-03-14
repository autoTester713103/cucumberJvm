package com.cucumber.lambdastepdefinition;

import com.cucumber.pageobject.SearchResultsPagePo;

import cucumber.api.java8.En;

public class SearchResultsPageStepDefs implements En{
	
	SearchResultsPagePo searchResultsPagePo;
	
	public SearchResultsPageStepDefs(SearchResultsPagePo searchResultsPagePo) {
		
		this.searchResultsPagePo = searchResultsPagePo;
		
		Then("^I should see a list of restaurants related to '(.*)'$",(String restaurant) ->{
			searchResultsPagePo.verifyList(restaurant);
		});
						
		Then("^I should see an error message$",() ->{
			searchResultsPagePo.verifyNoResultsErrorMsg();
		});
		
	}	
	
}
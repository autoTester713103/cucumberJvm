package com.cucumber.lambdastepdefinition;

import com.cucumber.pageobject.HomePagePo;

import cucumber.api.java8.En;

public class HomePageStepDefs implements En{

	private final HomePagePo homePagePo;

	public HomePageStepDefs(HomePagePo homePagePo) {
		this.homePagePo = homePagePo;
		
		Given("^I am on the Homepage$", () -> {
			homePagePo.openApp();
		});
		
		When("^I search for restaurant '(.*)'$", (String restaurant) -> {
			homePagePo.typeSearchTerm(restaurant);
			homePagePo.clickSearchButton();
		});
		
		When("^I type search term '(.*)'$", (String restaurant) -> {
			homePagePo.typeSearchTerm(restaurant);
		});
		
		Then("^I should see a list of search suggestions related to '(.*)'$", (String restaurant) -> {
			homePagePo.verifySearchSuggestions(restaurant);
		});
	}
}
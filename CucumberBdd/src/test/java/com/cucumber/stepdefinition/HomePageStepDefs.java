package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.HomePagePo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefs {

	HomePagePo homePage;
	Hooks hooks;

	public HomePageStepDefs() {
		homePage = new HomePagePo(hooks.driver);
	}

	@Given("^I am on the Homepage$")
	public void iAmOnTheHomepage() {
		homePage.openApp();
	}

	@When("^I search for restaurant '(.*)'$")
	public void iSearchForTestaurant(String restaurant) {
		homePage.typeSearchTerm(restaurant);
		homePage.clickSearchButton();
	}
	
	@When("^I type search term '(.*)'$")
	public void iTypeSearchTerm(String restaurant) {
		homePage.typeSearchTerm(restaurant);
	}
	
	@Then("^I should see a list of search suggestions related to '(.*)'$")
	public void iShouldSeeAListOfSearchSuggestionsRelatedTo(String restaurant){
		homePage.verifySearchSuggestions(restaurant);
	}

}
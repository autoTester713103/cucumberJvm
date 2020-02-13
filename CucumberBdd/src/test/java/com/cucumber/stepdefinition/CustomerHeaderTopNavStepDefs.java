package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.CustomerHeaderTopNavPo;

import cucumber.api.java.en.*;

public class CustomerHeaderTopNavStepDefs {

	CustomerHeaderTopNavPo customerHeaderTopNav;

	public CustomerHeaderTopNavStepDefs() {
		customerHeaderTopNav = new CustomerHeaderTopNavPo(Hooks.driver);
	}
	
	@Given("I navigate to \"([^\"]*)\"$")
	public void iNavigateTo(String page) {
		customerHeaderTopNav.navigateToPage(page);
	}
	
}

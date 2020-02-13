package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.CustomerHomePagePo;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class CustomerHomePageStepDefs {
	
	CustomerHomePagePo customerHomePage;

	public CustomerHomePageStepDefs() {
		 customerHomePage = new CustomerHomePagePo(Hooks.driver);
	}
	
	@Given("^I open the chat widget$")
	public void iOpenTheChatWidget() {
		customerHomePage.openChatWidget();
	}
	
	@Given("^I search for a hotel$")
	public void iSeachForAHotel(DataTable dt) {
		customerHomePage.searchRoom(dt);
	}

}

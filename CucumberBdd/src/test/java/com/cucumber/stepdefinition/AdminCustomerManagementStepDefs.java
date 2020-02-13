package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.AdminCustomerManagementPo;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class AdminCustomerManagementStepDefs {

	AdminCustomerManagementPo adminCustomerManagement;

	public AdminCustomerManagementStepDefs() {
		 adminCustomerManagement = new AdminCustomerManagementPo(Hooks.driver);
	}
	
	@Given("^I click Add Customer$")
	public void iClickAddCustomer() {
		adminCustomerManagement.clickAdd();
	}
	
	@Then("^I should see the customer created$")
	public void iShouldSeeTheCustomerCreated(DataTable dt) {
		adminCustomerManagement.verifyCustomerAdded(dt);
	}

}

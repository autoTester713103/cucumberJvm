package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.AdminCustomerCreationPo;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class AdminCustomerCreationStepDefs {
	
	AdminCustomerCreationPo adminCustomerCreation;

	public AdminCustomerCreationStepDefs() {
		adminCustomerCreation = new AdminCustomerCreationPo(Hooks.driver);
	}
	
	@Given("^I create a customer$")
	public void iCreateACustomer(DataTable dt) {
		adminCustomerCreation.createCustomer(dt);
	}

}

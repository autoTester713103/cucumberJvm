package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.CustomerLoginPo;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class CustomerLoginStepDefs {
	
	CustomerLoginPo customerLogin;

	public CustomerLoginStepDefs() {
		 customerLogin = new CustomerLoginPo(Hooks.driver);
	}
	
	@Given("^I log in the Customer Page$")
	public void iLogInTheCustomerPage (DataTable dt) {
		customerLogin.openPageAndLogin(dt);
	}
	

}

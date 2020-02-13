package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.AdminLoginPo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLoginStepDefs {
	
	AdminLoginPo adminLogin;
	
	public AdminLoginStepDefs() {
		adminLogin = new AdminLoginPo(Hooks.driver);
	}
	
	@Given("^I log in the Admin Page$")
	public void iLogInTheAdminPage() {
		adminLogin.openApp();
		adminLogin.login("admin@phptravels.com", "demoadmin");
	}

}
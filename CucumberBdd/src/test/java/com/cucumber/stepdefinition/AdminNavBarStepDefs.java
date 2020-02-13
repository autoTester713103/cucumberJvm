package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.AdminNavBarPo;

import cucumber.api.java.en.*;

public class AdminNavBarStepDefs {
	
	AdminNavBarPo adminNavBar;

	public AdminNavBarStepDefs() {
		adminNavBar = new AdminNavBarPo(Hooks.driver);
	}
	
	@Given("^I logout of the Admin Page$")
	public void iLogoutOfTheAdminPage() {
		adminNavBar.logout();
	}
}

package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.AdminSideBarPo;

import cucumber.api.java.en.*;

public class AdminSideBarStepDefs {
	
	AdminSideBarPo adminSideBar;

	public AdminSideBarStepDefs() {
		adminSideBar = new AdminSideBarPo(Hooks.driver);
	}
	
	@When("^I navigate to customer management$")
	public void iNavigateToCustomerManagement() {
		adminSideBar.clickSideBarMenu("accounts");
		adminSideBar.clickSideBarMenu("customer");
	}

}

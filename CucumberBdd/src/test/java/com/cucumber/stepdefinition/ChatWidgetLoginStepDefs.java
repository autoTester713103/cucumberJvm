package com.cucumber.stepdefinition;

import com.cucumber.helpers.Hooks;
import com.cucumber.pageobject.ChatWidgetLoginPo;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class ChatWidgetLoginStepDefs {
	
	ChatWidgetLoginPo chatWidgetLogin;

	public ChatWidgetLoginStepDefs() {
		 chatWidgetLogin = new ChatWidgetLoginPo(Hooks.driver);
	}
	
	@Given("^I log in to chat$")
	public void iLogInToChat(DataTable dt) {
		chatWidgetLogin.login(dt);
	}

}

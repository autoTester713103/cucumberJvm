package com.cucumber.stepdefinition;

import cucumber.api.java.en.*;

public class AddToCartStepDefs {

	@Given("^I am on the Item Details Page of '(.*)'$")
	public void i_am_on_the_item_details_page(String item){
		System.out.println("Entering Item Details page of "+item);
	}
	
	@And("^I have selected customer '(.*)'$")
	public void i_have_already_selected_customer(String customer) throws InterruptedException{
		System.out.println("Searching for customer "+customer);
		for(int i = 0; i < 3; i++){
			System.out.println("Loading...");
			Thread.sleep(1000);
		}
		System.out.println("Selecting customer "+customer);
	}
	
	@And("^I have already selected fulfilment '(.*)'$")
	public void i_have_already_selected_fulfilment(String fulfilment) throws InterruptedException{
		System.out.println("Selecting fulfilment "+fulfilment);
	}
	
	@When("^I Add the item to the cart$")
	public void i_add_the_item_to_the_cart(){
		System.out.println("Successfully added item to cart");
	}
	
	@Then("^I should see the \"([^\"]*)\" in the cart$")
	public void i_should_see_the_in_the_cart(String itemName){
		System.out.println(itemName + " has been added to cart");
	}
}

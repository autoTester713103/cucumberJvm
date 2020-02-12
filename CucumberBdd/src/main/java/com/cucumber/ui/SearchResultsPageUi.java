package com.cucumber.ui;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class SearchResultsPageUi {
	WebDriver driver;
	

	public SearchResultsPageUi(WebDriver driver){
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[(contains(@id,'orig-search-list')) and @class='ui cards']")
	public WebElement search_list_container;
	
	@FindBys(value=@FindBy(xpath="//*[(contains(@id,'orig-search-list')) and @class='ui cards']//child::div[contains(@class,'dish_search_display')]"))
	public List<WebElement> search_list;
	
	@FindBy(xpath="//*[contains(@class,'search_title')]")
	public WebElement search_results_finding;
	
	@FindBy(id="search_button")
	public WebElement search_button;
	
	@FindBy(xpath="//*[contains(@class,'ui button red')]")
	public WebElement hiring_button;
	
	@FindBys(value = @FindBy(xpath="//*[contains(@class,'ui button red')]"))
	public List<WebElement> count_hiring_button;
	
	@FindBy(xpath="//*[@class='tac message']//child::div[contains(text(),'No result')]")
	public WebElement no_results_error;
	
	@FindBys(value=@FindBy(xpath="//*[@class='tac message']//child::div[contains(text(),'No result')]"))
	public List<WebElement> list_no_results_error;
}

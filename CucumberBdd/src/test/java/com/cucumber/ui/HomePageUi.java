package com.cucumber.ui;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class HomePageUi {
	WebDriver driver;
	

	public HomePageUi(WebDriver driver){
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="keywords_input")
	public WebElement keyword_txtBox;
	
	@FindBy(id="keywords_pretext")
	public WebElement keyword_searchBox;
	
	@FindBy(xpath="//*[contains(@class,'keyword-search-start start-steps clearfix')]")
	public WebElement init_suggestions;
	
	@FindBys(value = @FindBy(xpath="//*[contains(@id,'explore-by')]//child::img"))
	public List<WebElement> init_suggestions_options;
	
	@FindBy(id="search_button")
	public WebElement search_button;
	
	@FindBy(xpath="//*[contains(@class,'ui button red')]")
	public WebElement hiring_button;
	
	@FindBys(value = @FindBy(xpath="//*[contains(@class,'ui button red')]"))
	public List<WebElement> count_hiring_button;
	
	@FindBys(value = @FindBy(xpath="//*[contains(@role,'option')]//child::a[contains(@class,'item')]"))
	public List<WebElement> count_suggestions;
}

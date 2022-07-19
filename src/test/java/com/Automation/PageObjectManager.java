package com.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojo_class.LoginPage3;
import com.pojo_class.SearchHotel_loginpage3;

public class PageObjectManager {
	public static WebDriver driver;		//null driver
	
	private LoginPage3 LP;
	private SearchHotel_loginpage3 search;
	
	public PageObjectManager(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver3, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public LoginPage3 getinstanceLP() {
		LP = new LoginPage3(driver);
		return LP;		
	}
	
	public SearchHotel_loginpage3 getinstancesearch() {
		search =new SearchHotel_loginpage3(driver);
		return search;
	}
	
}

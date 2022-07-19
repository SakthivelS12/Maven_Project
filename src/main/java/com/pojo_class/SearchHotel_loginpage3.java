package com.pojo_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_loginpage3 {
	public static WebDriver driver;	
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;

	public SearchHotel_loginpage3(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return Location;
	}
}

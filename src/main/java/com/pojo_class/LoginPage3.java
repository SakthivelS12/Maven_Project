package com.pojo_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 {
	public static WebDriver driver;				//null driver
	@FindBy(xpath = "//input[@name='username']")
	private WebElement UserName;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement Button;
	
	public LoginPage3(WebDriver driver) {		//Parameterized constructor	
		this.driver=driver;
		PageFactory.initElements(driver, this);	// to call driver wherever driver requires to run
	
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getButton() {
		return Button;
	}

	
}

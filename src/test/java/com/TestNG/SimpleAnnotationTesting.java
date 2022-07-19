package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotationTesting {
	//STCM	
	@BeforeSuite
	private void SetProperty() {
		System.out.println("Set Property");
	}
	@BeforeTest
	private void WebDriver() {
		System.out.println("Enter Webdriver");
	}
	@BeforeClass
	private void URL() {
		System.out.println("www.facebook.com");
	}
	@BeforeMethod
	private void Login() {
		System.out.println("Login the Page");
	}
	@Test(priority = -1)
	private void mobileSearch() {
		System.out.println("Mobile");
	}
	@Test(priority = 1)
	private void LaptopSearch() {
		System.out.println("Laptop");
	}
	@Ignore
	@Test(priority = 0)
	private void Clothes() {
		System.out.println("Clothes");
	}
	@AfterMethod
	private void Logout() {
		System.out.println("Logout the page");
	}
	@AfterClass
	private void HomePage() {
		System.out.println("Homepage");
	}
	@AfterTest
	private void closeBrowser() {
		System.out.println("Close");
	}
	@AfterSuite
	private void DeleteCookies() {
		System.out.println("Delete all Cookies");
	}	
}

package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	@Test(priority = 1)
	private void Amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//maximize screen
		driver.manage().window().maximize();
		//minimize screen
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(800, 600));	
		driver.manage().window().maximize();
	}
	@Test(priority = 2)
	private void Myntra(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//maximize screen
		driver.manage().window().maximize();
		//minimize screen
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(800, 600));	
		driver.manage().window().maximize();
	
}
	
}
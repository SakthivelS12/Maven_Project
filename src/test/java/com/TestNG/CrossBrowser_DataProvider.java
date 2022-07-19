package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CrossBrowser_DataProvider {

	@DataProvider
	private Object[][] logindata() {
		return new Object[][]{
				{"sakthi","12345"},
				{"vasanth","cr7@2412"},
				{"rajkumar","raj@97523"}
		};
	}	
	@Test(priority = 1, dataProvider = "logindata")
	private void CrossBrowser1(String Uname,String Pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();		
		WebElement Username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Username.sendKeys(Uname);	
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(Pass);		
		WebElement submitt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submitt.click();
		driver.close();
	}	
	@Test(priority = 2, dataProvider = "logindata")
	private void CrossBrowser2(String Uname,String Pass) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();		
		WebElement Username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Username.sendKeys(Uname);	
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(Pass);		
		WebElement submitt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submitt.click();
		driver.close();
	}	
}

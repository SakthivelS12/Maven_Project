package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

	@Parameters({"Username","Password"})
	@Test
	private void LoginDetails(@Optional("sakthi") String Uname ,@Optional("sakthi123") String Pass) {
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
		System.out.println("Username : "+ Uname);
		System.out.println("Password : "+ Pass);
	}
}

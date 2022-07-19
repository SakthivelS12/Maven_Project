package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseclass_adactin2 {
	public static WebDriver driver;
	public static WebDriver GetBrowser(String browsername) {		
		if (browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") +"\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();	
		}
		driver.manage().window().maximize();
		return driver;			
	}

	public static void GetUrl(String url) {
		driver.get(url);
	}
	
	public static void Inputcredentials(WebElement element, String details) {
		element.sendKeys(details);
	}
	public static void ClickButton(WebElement element) {
		element.click();
	}
	
	public static void closebrowser(String type) {
		if (type.equalsIgnoreCase("close")) {
		driver.close();
		}
		else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		}
}
}

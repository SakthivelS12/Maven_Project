package com.Automation;

import java.io.IOException;

import com.baseclass.baseclass_adactin3;
import com.helperFile.FileReadManager;

public class Adactin3 extends baseclass_adactin3 {
	public static void main(String[] args) throws InterruptedException, IOException{
		driver = GetBrowser("edge");

		GetUrl(FileReadManager.getinstance_FRM().getinstance_CR().get_url());	
		
		PageObjectManager pom = new PageObjectManager(driver);
				
		//Login Credentials
		//WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));			
		Inputcredentials(pom.getinstanceLP().getUserName(), FileReadManager.getinstance_FRM().getinstance_CR().get_uname());
		
		//WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));			
		Inputcredentials(pom.getinstanceLP().getPassword(), FileReadManager.getinstance_FRM().getinstance_CR().get_passwd());
		
		//WebElement Button = driver.findElement(By.xpath("//input[@type='Submit']"));
		ClickButton(pom.getinstanceLP().getButton());
				
		//WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));  			
		Dropdown(pom.getinstancesearch().getLocation(), "ByVisibleText", "Paris");
		
		Thread.sleep(500);
		closebrowser("quit");
}
}

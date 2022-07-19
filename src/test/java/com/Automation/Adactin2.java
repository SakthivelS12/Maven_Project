package com.Automation;

import com.baseclass.baseclass_adactin2;
import com.pojo_class.LoginPage2;

public class Adactin2 extends baseclass_adactin2 {

	public static void main(String[] args) throws InterruptedException{
		driver = GetBrowser("edge");

		GetUrl("https://adactinhotelapp.com/");	
		
		LoginPage2 LP = new LoginPage2(driver);	//creating a class variable object to access another class without using extends or implements keyword
		
		//Login Credentials
		//WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));			
		Inputcredentials(LP.getUserName(), "sakthivelS1206");
		
		//WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));			
		Inputcredentials(LP.getPassword(), "71933G");
		
		//WebElement Button = driver.findElement(By.xpath("//input[@type='Submit']"));
		ClickButton(LP.getButton());
		
		Thread.sleep(500);
		closebrowser("quit");
}
}
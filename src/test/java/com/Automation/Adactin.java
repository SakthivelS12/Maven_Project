package com.Automation;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.baseclass.baseclass_adactin;

public class Adactin extends baseclass_adactin {
	public static void main(String[] args) throws InterruptedException, IOException{
		GetBrowser("edge");
		navigation();
		GetUrl("https://adactinhotelapp.com/");	
		GetTitle();
		GetCurrentUrl();
		//Login Credentials
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));			
		Inputcredentials(UserName, "sakthivelS12");
		Getattribute(UserName, "sakthivelS12");
		Inputcredentials(UserName, "sakthivelS1206");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));			
		Inputcredentials(Password, "71933G");		
		WebElement Button = driver.findElement(By.xpath("//input[@type='Submit']"));
		ClickButton(Button);
		WindowHandling();
		
		//Booking Details
		WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));  			
		GetOptions(Location, "getoptions");
		Dropdown(Location, "ByVisibleText", "Paris");
		webelementMethod(Location, "gettext");
		sleep(200);
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));				
		GetOptions(Hotels, "firstselected");
		Dropdown(Hotels, "ByIndex", "2");
		sleep(300);
		WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));			
		GetOptions(RoomType, "allselected");
		Dropdown(RoomType, "ByIndex", "3");
		sleep(300);
		WebElement Rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));	
		Dropdown(Rooms, "ByValue", "2");
		sleep(300);
		WebElement CheckIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));			
		clear(CheckIn);
		enterdate(CheckIn, "11/08/2022");
		sleep(300);
		WebElement CheckOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));			
		clear(CheckOut);
		enterdate(CheckOut, "12/08/2022");
		webelementMethod(CheckOut, "displayed");
		sleep(300);
		WebElement Adults = driver.findElement(By.xpath("//select[@name='adult_room']"));			
		Dropdown(Adults, "ByValue", "4");
		sleep(300);
		WebElement Children = driver.findElement(By.xpath("//select[@name='child_room']"));			
		Dropdown(Children, "ByIndex", "0");
		sleep(500);
		WebElement Button2 = driver.findElement(By.xpath("//input[@type='submit']"));
		ClickButton(Button2);
		sleep(500);
		WindowHandling();
		
		//Select Hotel
		WebElement Select = driver.findElement(By.xpath("//input[@type='radio']"));
		ClickButton(Select);
		webelementMethod(Select, "Selected");
		sleep(200);
		WebElement Continue = driver.findElement(By.xpath("//input[@name='continue']"));
		ClickButton(Continue);
		sleep(500);
		WindowHandling();
		
		//one Person detail to Book a Hotel
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		Inputcredentials(FirstName, "Sakthivel");
		sleep(100);
		WebElement LastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		Inputcredentials(LastName, "K");
		sleep(100);
		WebElement Address = driver.findElement(By.xpath("//textarea[@name='address']"));
		Inputcredentials(Address, "No.6 ,Vivekanandar street,Dubai kuruku sandhu, Dubai main road, Dubai-00002 ");
		sleep(100);
		WebElement Creditcard = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		Inputcredentials(Creditcard, "8954273128883110");
		sleep(100);
		WebElement CCType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Dropdown(CCType, "ByVisibleText", "VISA");
		sleep(100);
		WebElement ExpMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Dropdown(ExpMonth, "ByVisibleText", "August");
		sleep(100);
		WebElement ExpYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Dropdown(ExpYear, "ByVisibleText", "2022");
		sleep(100);
		WebElement CVV = driver.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
		Inputcredentials(CVV, "1234");
		sleep(500);	
		WebElement Button3 = driver.findElement(By.xpath("//input[@id='book_now']"));
		ClickButton(Button3);
		sleep(10000);
		WindowHandling();
		
		
		//Screenshot of Booking confirmation
		ScreenShot();
		implicitlywait();
		
		//Site Logout
		WebElement Logout = driver.findElement(By.xpath("//input[@name='logout']"));
		ClickButton(Logout);
		Thread.sleep(500);
		
		closebrowser("close");
}	
}
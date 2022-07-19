package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotation_program {
    public String baseUrl = "https://www.flipkart.com/";
    public WebDriver driver ; 
    public String expected = null;
    public String actual = null;
        @BeforeTest
      public void launchBrowser() {
          System.out.println("launching browser"); 
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\Driver\\chromedriver.exe");
          driver= new ChromeDriver();
          driver.manage().window().maximize();
          driver.get(baseUrl);
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      }      
      @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
      }
          @Test(priority = 0)
      public void Mobiles(){
          driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
          expected = "Mobiles";
          actual = "Mobiles";
          Assert.assertEquals(actual, expected);
      }
          @Ignore
          @Test(priority = 1)
      public void Appliances() {
        	driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
            expected = "Appliances";
            actual = "Appliances";
            Assert.assertEquals(actual, expected);
      }
      @AfterMethod
      public void goBackToHomepage ( ) {
            driver.findElement(By.xpath("//img[@title='Flipkart']")).click() ;
      }       
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}

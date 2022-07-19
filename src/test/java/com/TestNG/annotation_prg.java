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

public class annotation_prg {
    WebDriver driver ; 
    String expected = null;
    String actual = null;
        @BeforeTest
      public void launchBrowser() {
          System.out.println("launching browser"); 
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\Driver\\chromedriver.exe");
          driver= new ChromeDriver();
          driver.get("http://demo.guru99.com/test/newtours/");
          driver.manage().window().maximize();
          
      }     
      @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
      }
          @Test(priority = 0)
      public void register(){
          driver.findElement(By.linkText("REGISTER")).click() ;
          expected = "Register: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
      }
          @Test(priority = 1,invocationCount = 3)
      public void support() {
            driver.findElement(By.linkText("SUPPORT")).click() ;
            expected = "Under Construction: Mercury Tours";
            actual = driver.getTitle();
            Assert.assertEquals(actual, expected);
      }
          @Ignore
          @Test(priority = -1)
          public void contact() {
                driver.findElement(By.linkText("SIGN-ON")).click() ;
                expected = "Sign-on: Mercury Tours";
                actual = driver.getTitle();
                Assert.assertEquals(actual, expected);
          }
      @AfterMethod
      public void goBackToHomepage ( ) {
            driver.findElement(By.linkText("Home")).click() ;
      }     
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}


package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass_adactin {

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
	public static void navigation() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}
	public static void GetUrl(String url) {
		driver.get(url);
	}
	public static void GetTitle() {
		String title = driver.getTitle();
		System.out.println("Title : "+title);
	}
	public static void GetCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url : "+currentUrl);
	}
	public static void Inputcredentials(WebElement element, String details) {
		element.sendKeys(details);
	}
	public static void ClickButton(WebElement element) {
		element.click();
	}
	public static void Dropdown(WebElement element, String type, String value) {
		Select S = new Select(element);
		if (type.equalsIgnoreCase("ByVisibleText")) {
			S.selectByVisibleText(value);			
		}
		else if (type.equalsIgnoreCase("ByIndex")) {
			int parseInt = Integer.parseInt(value);
			S.selectByIndex(parseInt);			
		}
		else if (type.equalsIgnoreCase("selectByValue")) {
			S.selectByValue(value);			
		}
	}
	public static void webelementMethod(WebElement element, String type1) {
		if (type1.equalsIgnoreCase("gettext")) {		
			String gettext = element.getText();
			System.out.println("Text : "+gettext);
		}
		else if (type1.equalsIgnoreCase("displayed")) {
			boolean displayed = element.isDisplayed();
			System.out.println("Displayed : "+displayed);
		}
		else if (type1.equalsIgnoreCase("enabled")) {
			boolean enabled = element.isEnabled();
			System.out.println("Enabled : "+enabled);
		}
		else if (type1.equalsIgnoreCase("Selected")) {
			boolean Selected = element.isSelected();
			System.out.println("Selected : "+Selected);
		}		
	}
	public static void Getattribute(WebElement element , String types) {
		String attribute = element.getAttribute(types);
		element.clear();
		System.out.println("Given Attribute : "+attribute);
	}
	public static void clear(WebElement element) {
		element.clear();	
	}
	public static void enterdate(WebElement element, String date) {
		element.sendKeys(date);
	}
	public static void GetOptions(WebElement element,String type) {
		Select S = new Select(element);
		if (type.equalsIgnoreCase("getoptions")) {
		System.out.println("Get Options : ");
		List<WebElement> alloptions = S.getOptions();
		for (WebElement all : alloptions) {
			String text=all.getText();
			System.out.println(text);			
			}
		}
		else if (type.equalsIgnoreCase("allselected")) {
			List<WebElement> allSelectedOptions = S.getAllSelectedOptions();
			for (WebElement all : allSelectedOptions) {
				String text1=all.getText();
				System.out.println("allselected : "+text1);
			}
		}
		else if (type.equalsIgnoreCase("firstselected")) {
			WebElement firstSelectedOption = S.getFirstSelectedOption();
			System.out.println("firstselected : "+firstSelectedOption);
		}
	}

	public static void ScreenShot() throws IOException {
		TakesScreenshot TS = (TakesScreenshot)driver;
		File Source = TS.getScreenshotAs(OutputType.FILE);
		File deFile = new File("C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\Screenshot\\Booking.png");
		FileUtils.copyFile(Source, deFile);
	}	
	@SuppressWarnings("deprecation")
	public static void implicitlywait() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			
	}
	public static void sleep(long value) throws InterruptedException {
		Thread.sleep(value);
	}
	public static void WindowHandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println("Window Handles : "+title);	
		}		
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
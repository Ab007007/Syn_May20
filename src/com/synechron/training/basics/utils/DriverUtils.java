package com.synechron.training.basics.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils {

	public static WebDriver driver = null;

	public static void getScreenshot()
	{
		TakesScreenshot ss = (TakesScreenshot) driver;
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("reports\\screeshots\\SS_" + ActitimeUtils.getDateAndtime() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getDateAndtime() {
		Date d  = new Date();
		String dateandtime = d.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dateandtime);
		return dateandtime;
	
	}
	public static String getConfigValue(String key)
	{
		String str = null;
		try
		{
			File f = new File("data\\config.properties");
			FileReader fr = new FileReader(f);
			Properties props = new Properties();
			
			props.load(fr);
			
			str = props.getProperty(key);
			
			fr.close();
		}
		catch(Exception ex )
		{
			System.out.println("Exception while reading file....");
		}
		
		return str;
	}
	
	
	/**
	 * getMyDriver function returns a chrome driver to a Test
	 * @author Aravind
	 * @return webdriver
	 */
	public static WebDriver getMyDriver() {
		System.out.println("Creating a webdriver object");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}
	
	public static WebDriver getMyDriver(String type) {
		System.out.println("Creating a webdriver object for "  +type);
		switch (type) {
		case "ff":
//			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "chrome" :
//			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ie" : 
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge" : 
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		default:
			System.out.println("Please contact Framework developers for other browsers..");
			break;
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}

	public static WebElement getMyElement(String locator, String locatorValue) {
		WebElement ele = null;
		System.out.println("Finding the element with " + locator + " and " + locatorValue);

		switch (locator.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(locatorValue));
			break;
		case "name":
			ele = driver.findElement(By.name(locatorValue));
			break;
		case "classname":
			ele = driver.findElement(By.className(locatorValue));
			break;
		case "tagname":
			ele = driver.findElement(By.tagName(locatorValue));
			break;
		case "linktext":
			ele = driver.findElement(By.linkText(locatorValue));
			break;
		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "css":
			ele = driver.findElement(By.cssSelector(locatorValue));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(locatorValue));
			break;

		default:
			System.out.println("Please pass the correct locator");
			break;
		}
		
		return ele;

	}

	
	public static void typeOnElement(String locator,String locatorValue,String textTotype)
	{
		System.out.println("------------Entering text " + textTotype);
		getMyElement(locator, locatorValue).sendKeys(textTotype);
		System.out.println("------------Entered Text on element successfully");
	}
	
	
	public static void clickOnElement(String locator,String locatorValue)
	{
		System.out.println("-------------clicking on element " );
		getMyElement(locator, locatorValue).click();
		System.out.println("-------------Click operation is successfull");
	}
	
	
	public static String getTextOnElement(String locator, String locatorValue)
	{
		String text = null;
		text = getMyElement(locator, locatorValue).getText();
		System.out.println("Text found on the element " + text);
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

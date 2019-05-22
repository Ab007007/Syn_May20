package com.synechron.training.basics.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

	public static WebDriver driver = null;

	public static WebDriver getMyDriver() {
		System.out.println("Creating a webdriver object");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
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

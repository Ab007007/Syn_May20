package com.synechron.training.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{

	public static void createCustomer(String customerName,String customerDesc)
	{
		typeOnElement("id", "customerLightBox_nameField", customerName);
		typeOnElement("id", "customerLightBox_descriptionField", customerDesc);
		clickOnElement("xpath", "//div[@id='customerLightBox_commitBtn']");
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		WebElement successMsg = wait.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//div[@class='toast']")));
		
		System.out.println(successMsg.getText());
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.invisibilityOf(getMyElement("xpath", "//div[@class='toast']")));
	}
	
	public static void launchApplication(String url)
	{
		System.out.println("Launching the application " + url);
		driver.get(url);
		
	
	}
	
	public static void validateTitle(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("PASS - Title is matched " + actualTitle);
		}
		else
		{
			System.out.println("**FAIL** - Expected " + expectedTitle + " but found " + actualTitle);
		}
	}
	
	public  static void loginToActitime(String un, String pwd)
	{
		System.out.println("logging into applicaiont with username " + un + " and password " + pwd);
		typeOnElement("id", "username", "admin");
		typeOnElement("name", "pwd", "manager");
		clickOnElement("id", "loginButton");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void clickOnTasks()
	{
		clickOnElement("xpath", "//a[div[text()='TASKS']]");
	}
	
	public static void clickOnCreateCutomerButton()
	{
		clickOnElement("xpath", "//div[@class='addNewContainer']");
		clickOnElement("xpath", "//div[contains(text(),'New Customer')]");
		
	}
}

package com.synechron.training.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActitimeUtils extends DriverUtils
{

	
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
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

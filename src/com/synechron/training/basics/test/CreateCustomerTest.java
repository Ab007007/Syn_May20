package com.synechron.training.basics.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.basics.utils.ActitimeUtils;

public class CreateCustomerTest extends ActitimeUtils
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = getMyDriver();
		launchApplication("http://localhost/login.do");
		loginToActitime("admin", "manager");
		clickOnTasks();
		clickOnCreateCutomerButton();
		
		createCustomer("customer2","customer2Desc");
		
		
		clickOnElement("id", "logoutLink");
	}

	
}

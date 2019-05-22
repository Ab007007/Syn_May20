package com.synechron.training.basics.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.basics.utils.ActitimeUtils;

public class CreateCustomerUsingExternalData extends ActitimeUtils
{

	public static void main(String[] args) 
	{
		WebDriver driver = getMyDriver();
		launchApplication(getConfigValue("url"));
		loginToActitime(getConfigValue("username"), getConfigValue("password"));
		clickOnTasks();
		clickOnCreateCutomerButton();
		createCustomer("customer4","customer4Desc");
		clickOnElement("id", "logoutLink");
	}

	
}

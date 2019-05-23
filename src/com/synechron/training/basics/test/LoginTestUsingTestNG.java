package com.synechron.training.basics.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.synechron.training.basics.utils.ActitimeUtils;

public class LoginTestUsingTestNG {

	WebDriver driver = null;
	
	
	@BeforeClass
	public void setup()
	{
		driver = ActitimeUtils.getMyDriver("ff");
		ActitimeUtils.launchApplication(ActitimeUtils.getConfigValue("url"));
		ActitimeUtils.loginToActitime("admin", "manager");
	}
	

	@AfterClass
	public void postCondition()
	{
		ActitimeUtils.logout();
	}
	
	
	@Test
	public void CreateCustomerTest()
	{
		ActitimeUtils.clickOnTasks();
		ActitimeUtils.clickOnCreateCutomerButton();
		ActitimeUtils.createCustomer("TestNGcustomer33","customer2Desc");
	}
	
	
	@Test(dependsOnMethods = "CreateCustomerTest")
	public void CreateProjectTest()
	{
		ActitimeUtils.clickOnTasks();		
		ActitimeUtils.clickOnCreateProjectButton();	
		ActitimeUtils.createProject("TestNGcustomer32", "Project11111", "desc");
		
	}
	
	
	
	
	
	
}

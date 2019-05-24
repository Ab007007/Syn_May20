package com.synechron.training.basics.test;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.synechron.training.basics.utils.ActitimeUtils;

public class LoginTestUsingTestNG {

	WebDriver driver = null;
	ExtentReports reports  = null;
	ExtentTest test = null;
	
	@BeforeSuite
	public void createReports()
	{
		reports = new ExtentReports("reports\\execution_" + ActitimeUtils.getDateAndtime()+".html");
	}
	
	@BeforeClass
	public void setup()
	{
		driver = ActitimeUtils.getMyDriver("chrome");
		
	}
	

	@BeforeMethod
	public void loginToApp()
	{
		ActitimeUtils.launchApplication(ActitimeUtils.getConfigValue("url"));
		ActitimeUtils.loginToActitime("admin", "manager");
	}
	
	@AfterMethod
	public void logout()
	{
		ActitimeUtils.logout();

	}
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}
	
	
	@Test(dataProvider = "customerdata", dataProviderClass = TestData.class)
	public void CreateCustomerTest(String cn, String cd)
	{
		test = reports.startTest("CreateCustomerTest");
		test.log(LogStatus.INFO, "Test is Started...");
				
		ActitimeUtils.clickOnTasks();
		test.log(LogStatus.PASS, "Clicking on Tasks is successfull");
		test.log(LogStatus.INFO, "Clicking on create customer button");
		
		ActitimeUtils.clickOnCreateCutomerButton();
		test.log(LogStatus.PASS, "Clicking on create customer successfull");
		
		test.log(LogStatus.INFO, "Creating a customer with");
		ActitimeUtils.createCustomer(cn,cd);
		test.log(LogStatus.PASS, "Customer created successfully");
		
	}
	
	
	@Test(dependsOnMethods = "CreateCustomerTest", dataProviderClass = TestData.class,dataProvider = "projectdata")
	public void CreateProjectTest(String cn, String pn, String pd)
	{
		test = reports.startTest("CreateProjectTest");
		test.log(LogStatus.INFO, "Test is Started...");
		
		ActitimeUtils.clickOnTasks();		
		test.log(LogStatus.PASS, "Clicking on Tasks is successfull");
		test.log(LogStatus.INFO, "Clicking on create project button");
		
		
		ActitimeUtils.clickOnCreateProjectButton();	
		test.log(LogStatus.PASS, "Clicking on Tasks is successfull");
		test.log(LogStatus.INFO, "Clicking on create Project button");
		
		ActitimeUtils.createProject(cn,pn,pd);
		test.log(LogStatus.PASS, "Project created successfully");
			
	}
	
	
	@AfterSuite
	public void saveReports()
	{
		reports.flush();
		//driver.close();
		driver = null;
		reports = null;
	}
	
	
	
}

package com.synechron.training.basics.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
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

public class ScreenShotsDemo {

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
		ActitimeUtils.launchApplication(ActitimeUtils.getConfigValue("url"));
		
		
	}

	@Test
	public void loginWithValidCreds()
	{
		test = reports.startTest("loginWithValidCreds");
		test.log(LogStatus.INFO, "Logging in to app");
		ActitimeUtils.loginToActitime("admin", "manager");
		ActitimeUtils.logout();
	}
	
	@Test
	public void loginWithInValidCreds()
	{
		test = reports.startTest("loginWithInValidCreds");
		test.log(LogStatus.INFO, "Logging in to app");
		ActitimeUtils.loginToActitime("admin123", "manager");
		ActitimeUtils.logout();
	}
	
	@AfterMethod
	public void checkExecutionStatus(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			
			ActitimeUtils.getScreenshot();
		}
	}
	@AfterClass
	public void postCondition()
	{
		driver.close();
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

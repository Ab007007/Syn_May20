package com.pom.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.page.DashBoardPage;
import com.pom.page.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.synechron.training.basics.utils.ActitimeUtils;

public class LoginTest {
	
	WebDriver driver = null;
	LoginPage lp = null;
	DashBoardPage dp = null;
	ExtentReports reports = null;
	ExtentTest test = null;
	
	@BeforeClass
	public void initPages()
	{
		driver = ActitimeUtils.getMyDriver();
		lp = new LoginPage(driver);
		dp = new DashBoardPage(driver);
		reports = new ExtentReports("reports\\pomreport_" + ActitimeUtils.getDateAndtime() + ".html");
	}

	
	
	@Test
	public void validLoginTest()
	{
		test = reports.startTest("ValidLoginTest");
		test.log(LogStatus.INFO, "dummy report");
		ActitimeUtils.launchApplication(ActitimeUtils.getConfigValue("url"));
		lp.loginToApplication("admin", "manager");
		dp.logout();
		
	}
	
	@AfterClass
	public void cleanup()
	{
		driver.close();
		reports.flush();
		
	}
}












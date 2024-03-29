package com.synechron.training.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActitimeUtils extends DriverUtils
{

	/**
	 * creates a customer in actitime application for the parameters passed
	 * @param customerName
	 * @param customerDesc
	 */
	public static void createCustomer(String customerName,String customerDesc)
	{
		typeOnElement("id", "customerLightBox_nameField", customerName);
		typeOnElement("id", "customerLightBox_descriptionField", customerDesc);
		clickOnElement("xpath", "//div[@id='customerLightBox_commitBtn']");
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		WebElement successMsg = wait.until(ExpectedConditions.visibilityOf
				(getMyElement("xpath", "//div[@class='toast']")));
		System.out.println(successMsg.getText());
		wait.until(ExpectedConditions.invisibilityOf(getMyElement
				("xpath", "//div[@class='toast']")));
	}
	/**
	 * launch the application for the given url
	 * @author Aravind
	 * @param url
	 */
	public static void launchApplication(String url)
	{
		System.out.println("Launching the application " + url);
		driver.get(url);
		
	
	}
	
	/**
	 * Asserts the given title is correct or not
	 * @author Aravind
	 * @param expectedTitle
	 */
	public static void validateTitle(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	/**
	 * login utility to login to the application with a 
	 * given credentials
	 * @param un
	 * @param pwd
	 */
	public  static void loginToActitime(String un, String pwd)
	{
		System.out.println("logging into applicaiont with username " + un + " and password " + pwd);
		typeOnElement("id", "username", un);
		typeOnElement("name", "pwd", pwd);
		clickOnElement("id", "loginButton");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * creates a project for a given values
	 * @param customerName - String
	 * @param projectName - String 
	 * @param projectDescription -String
	 */
	public static void createProject(String customerName, String projectName, String projectDescription ){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		typeOnElement("id", "projectPopup_projectNameField",projectName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clickOnElement("id", "projectPopup_customerSelectorPlaceholder");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement ele = wait1.until(ExpectedConditions.elementToBeClickable(getMyElement("xpath", "//a[text()='"+customerName+"']")));
		
		ele.click();		
		typeOnElement("id", "projectPopup_projectDescriptionField",projectDescription);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement("id", "projectPopup_commitBtn");
		
		WebElement successMsg = wait1.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//div[@class='toast']")));
		System.out.println(successMsg.getText());
		
		wait1.until(ExpectedConditions.invisibilityOf(getMyElement("xpath", "//div[@class='toast']")));
	
	}
	
	
	
	/**
	 * logout of the application
	 */
	public static void logout()
	{
		clickOnElement("id", "logoutLink");
	}
	
	/**
	 * to click on Tasks  - no arguments is required
	 */
	public static void clickOnTasks()
	{
		clickOnElement("xpath", "//a[div[text()='TASKS']]");
		validateTitle("actiTIME - Task List");
	}
	
	/**
	 * function ot click on Time Track present in the Dashboard page
	 */
	public static void clickOnTT()
	{
		clickOnElement("xpath", "//a[div[text()='TIME-TRACK']]");
		validateTitle("actiTIME - Enter Time-Track");
	}
	/**
	 * function to click on create customer button present in tasks page
	 * 
	 */
	public static void clickOnCreateCutomerButton()
	{
		clickOnElement("xpath", "//div[@class='addNewContainer']");
		clickOnElement("xpath", "//div[contains(text(),'New Customer')]");
		
	}
	/**
	 * function to click on create Project button present in tasks page
	 * 
	 */
	public static void clickOnCreateProjectButton()
	{
		clickOnElement("xpath", "//div[@class='addNewContainer']");
		clickOnElement("xpath", "//div[contains(text(),'New Project')]");
		
	}
}

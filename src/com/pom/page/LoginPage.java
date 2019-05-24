package com.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	WebElement usernameTextBox;
	
	@FindBy(name="pwd")
	WebElement passwordTextBox;
	
	@FindBy(id="loginButton")
	WebElement loginButton;
	
	
	
	public void loginToApplication(String un, String pwd)
	{
		usernameTextBox.sendKeys(un);
		passwordTextBox.sendKeys(pwd);
		loginButton.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}

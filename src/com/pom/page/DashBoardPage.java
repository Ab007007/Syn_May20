package com.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutLink;
	
	
	public void logout()
	{
		logoutLink.click();
	}

	
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
}

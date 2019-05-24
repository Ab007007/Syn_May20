package com.synechron.training.basics.test;

import java.nio.Buffer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.synechron.training.basics.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginParallel1 {

	
	@Test
	public void loginTest1()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get(ActitimeUtils.getConfigValue("url"));
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		
			}
}

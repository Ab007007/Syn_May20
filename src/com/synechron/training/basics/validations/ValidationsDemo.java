package com.synechron.training.basics.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://formy-project.herokuapp.com/enabled");
		
		if(driver.findElement(By.id("disabledInput")).isDisplayed())
		{
			System.out.println("Element is displayed....");
			if(driver.findElement(By.id("disabledInput")).isEnabled())
			{
				System.out.println("Element is enabled ...");
				driver.findElement(By.id("disabledInput")).sendKeys("type");
			}
			else
			{
				System.out.println("Element is disabled cant perform actions");
			}
		}
		else
		{
			System.out.println("Element is not displayed...");
		}
		
		driver.findElement(By.linkText("Form")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		
		WebElement ele  = driver.findElement(By.id("checkbox-1"));
		if(ele.isSelected())
		{
			System.out.println("Check box is already selected ..!!!");
		}
		else
		{
			System.out.println("selecting checkbox");
			ele.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

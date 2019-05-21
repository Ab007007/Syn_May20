package com.synechron.training.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActionsOnElement {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://formy-project.herokuapp.com/");
		
		/*
		 * WebElement formLink = driver.findElement(By.linkText("Form"));
		 * 
		 * formLink.click();
		 */
		driver.findElement(By.linkText("Form")).click();
		driver.findElement(By.id("first-name")).sendKeys("firstUser");
		driver.findElement(By.id("last-name")).sendKeys("lastName");
		driver.findElement(By.xpath("//input[@placeholder='Enter your job title']")).sendKeys("Architect");
		driver.findElement(By.id("radio-button-1")).click();
		driver.findElement(By.id("checkbox-1")).click();
	
		
		driver.close();
		driver=null;
	
	}
}

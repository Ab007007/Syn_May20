package com.synechron.training.basics.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/Synechron_WS_20_May/SeleniumPractice/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button")).click();
		
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		WebElement dynamicEle = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.id("demo"))));
		
		String msg = dynamicEle.getText();
		
		System.out.println("Message displayed is " + msg);
		
	}

}

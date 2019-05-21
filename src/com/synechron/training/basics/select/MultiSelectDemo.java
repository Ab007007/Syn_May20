package com.synechron.training.basics.select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/Synechron_WS_20_May/SeleniumPractice/html/multiSelect.html");
		
		WebElement mulitSelectDropDown = driver.findElement(By.xpath("//select"));
		
		Select sel = new Select(mulitSelectDropDown);
		
		sel.selectByIndex(0);
		Thread.sleep(2000);
		
		sel.selectByValue("saab");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		
		sel.deselectByValue("saab");
		Thread.sleep(2000);
		
		sel.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}
}

package com.synechron.training.basics.waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionsDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("UBS");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		
		System.out.println(autoSuggestions.size());
		
		for(WebElement suggestion:autoSuggestions)
		{
			System.out.println(suggestion.getAttribute("role") + " -- " + suggestion.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

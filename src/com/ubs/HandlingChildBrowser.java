package com.ubs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.basics.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElement(By.linkText("Contact Us")).click();
		Set<String> windowIds = driver.getWindowHandles();
		
		Iterator<String> it = windowIds.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		System.out.println("Patent ID --> " + parentID);
		System.out.println("Chile ID --> " + childID);
		driver.switchTo().window(childID);
		
		List<WebElement> emailIDs = driver.findElements(By.xpath("//a"));
		
		for (WebElement webElement : emailIDs) {
			System.out.println(webElement.getText());
		}
		
		
		driver.close();
		driver.switchTo().window(parentID);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'More')]"))).perform();
		
		Thread.sleep(3000);
		driver.close();
	}
}

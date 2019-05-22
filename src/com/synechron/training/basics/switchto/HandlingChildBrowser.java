package com.synechron.training.basics.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.basics.utils.ActitimeUtils;

public class HandlingChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		ActitimeUtils.clickOnElement("linktext", "Contact Us");
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
		act.moveToElement(ActitimeUtils.getMyElement("xpath", "//a[contains(text(),'More')]")).perform();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

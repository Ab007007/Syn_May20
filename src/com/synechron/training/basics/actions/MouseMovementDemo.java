package com.synechron.training.basics.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.basics.utils.ActitimeUtils;

public class MouseMovementDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("https://www.flipkart.com/");
		
		ActitimeUtils.clickOnElement("xpath", "//button[@class='_2AkmmA _29YdH8']");

		WebElement electronicsEle = ActitimeUtils.getMyElement("xpath", "//span[text()='Electronics']");
		WebElement womenEle = ActitimeUtils.getMyElement("xpath", "//span[text()='Women']");
		WebElement menEle = ActitimeUtils.getMyElement("xpath", "//span[text()='Men']");

		Actions act = new Actions(driver);
		act.moveToElement(electronicsEle).perform();
		Thread.sleep(5000);
		act.moveToElement(womenEle).perform();
		Thread.sleep(5000);
		act.moveToElement(menEle).perform();
		
		
		
		
		
		
		
	}
}

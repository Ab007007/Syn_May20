package com.synechron.training.basics.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.basics.utils.ActitimeUtils;

public class KeyBoardActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("http://localhost/login.do");
		Actions act  = new Actions(driver);
		
		act.sendKeys("admin").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("manager").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
			
	}
}

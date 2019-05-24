package com.synechron.training.basics.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.synechron.training.basics.utils.ActitimeUtils;

public class ScrollToElement {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getMyDriver("chrome");
		ActitimeUtils.launchApplication("http://formy-project.herokuapp.com/scroll");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, 800);");
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("name")));
	}
}

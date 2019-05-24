package com.synechron.training.basics.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.synechron.training.basics.utils.ActitimeUtils;

public class ClickUsingJS {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getMyDriver("chrome");
		ActitimeUtils.launchApplication("http://formy-project.herokuapp.com/datepicker");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("document.getElementById('datepicker').click();");
	}
	
}

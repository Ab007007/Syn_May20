package com.synechron.training.basics.multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.basics.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FFExe {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0);
		WebElement srcEle =driver.findElement(By.id("draggable"));
		WebElement destEle =driver.findElement(By.id("droppable"));
		
		Actions act =  new Actions(driver);
		
		act.dragAndDrop(srcEle,destEle).perform();
		
	}

}

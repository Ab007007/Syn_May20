package com.synechron.training.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Synechron_WS_20_May\\SeleniumPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
	
}

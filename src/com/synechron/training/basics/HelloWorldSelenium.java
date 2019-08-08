package com.synechron.training.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Synechron_WS_20_May\\SeleniumPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		//WebDriver driver = new OperaDriver();//new InternetExplorerDriver();//new EdgeDriver();
		/*
		 * webdriver.<<browsername>>.driver webdriver.ie.driver webdriver.gecko.driver
		 * webdriver.opera.driver
		 */
	
	
	}
	
}

package com.synechron.training.basics.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginUsingGrid {

	@Test
	public void loginTest1() throws MalformedURLException {
		String nodeUrl = "http://192.168.1.102:5556/wd/hub";

		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		 * options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
		 * UnexpectedAlertBehaviour.ACCEPT);
		 * options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 * options.addArguments("disable-infobars");
		 */
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriver driver = new RemoteWebDriver(new URL(nodeUrl), options);

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Synechron");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));

		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@class='sbct']"));

		System.out.println(autoSuggestions.size());

		for (WebElement suggestion : autoSuggestions) {
			System.out.println(suggestion.getText());
		}

	}
}

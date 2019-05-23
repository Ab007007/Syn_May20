package com.synechron.training.basics.multibrowser;

import static com.synechron.training.basics.utils.DriverUtils.getConfigValue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.synechron.training.basics.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriverDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		ActitimeUtils.driver = driver;
		ActitimeUtils.launchApplication(getConfigValue("url"));
		ActitimeUtils.loginToActitime(getConfigValue("username"), getConfigValue("password"));
		ActitimeUtils.logout();
		
	}

}

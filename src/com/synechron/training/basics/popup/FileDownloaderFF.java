package com.synechron.training.basics.popup;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.synechron.training.basics.utils.ActitimeUtils;

public class FileDownloaderFF {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver =  ActitimeUtils.getMyDriver("ff");
		ActitimeUtils.launchApplication("https://www.seleniumhq.org/download/");
		
		ActitimeUtils.clickOnElement("xpath", "//p[text()='Download version ']/a");
		
		Robot robot =  new Robot();
		robot.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		robot.keyPress(Event.ENTER);
		
		
	}
}

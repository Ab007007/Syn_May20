package com.synechron.training.basics.js;

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.synechron.training.basics.tooltip.ActitimeToolTip;
import com.synechron.training.basics.utils.ActitimeUtils;

public class ScrollToDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver("chrome");
		ActitimeUtils.launchApplication("http://formy-project.herokuapp.com/scroll");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 800);");
	}
}

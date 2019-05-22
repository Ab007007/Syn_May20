package com.synechron.training.basics.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.training.basics.utils.ActitimeUtils;

public class DragAndDropDemo {
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement srcEle = ActitimeUtils.getMyElement("id", "draggable");
		WebElement destEle = ActitimeUtils.getMyElement("id", "droppable");
		
		ActitimeUtils.getTextOnElement("id", "draggable");
		ActitimeUtils.getTextOnElement("id", "droppable");
		Actions act =  new Actions(driver);
		
		act.dragAndDrop(srcEle,destEle).perform();
		
		ActitimeUtils.getTextOnElement("id", "droppable");
		
	}

}

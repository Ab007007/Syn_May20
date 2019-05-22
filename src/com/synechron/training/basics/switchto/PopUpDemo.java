package com.synechron.training.basics.switchto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.basics.utils.ActitimeUtils;

public class PopUpDemo 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("http://localhost/login.do");
		ActitimeUtils.loginToActitime("admin", "manager");
		ActitimeUtils.clickOnTasks();
		ActitimeUtils.clickOnCreateCutomerButton();
		//ActitimeUtils.clickOnElement("xpath", "//td[@class='buttonsBox']/div[@id='customerLightBox_cancelBtn']");
		ActitimeUtils.typeOnElement("id", "customerLightBox_nameField", "dummyUser");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable
				(ActitimeUtils.getMyElement("xpath", "//div[text()='Cancel' and @class='greyButton cancelBtn']")));
		ele.click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		ActitimeUtils.clickOnCreateCutomerButton();
		ActitimeUtils.typeOnElement("id", "customerLightBox_nameField", "dummyUser");
		wait = new WebDriverWait(driver, 20);
		ele = wait.until(ExpectedConditions.elementToBeClickable(ActitimeUtils.getMyElement("xpath", "//div[text()='Cancel' and @class='greyButton cancelBtn']")));
		ele.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		System.out.println("END");
	}

}

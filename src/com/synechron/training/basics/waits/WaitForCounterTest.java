package com.synechron.training.basics.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class WaitForCounterTest {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/Synechron_WS_20_May/SeleniumPractice/html/CounterText.html");
		
	//	driver.findElement(By.xpath("//button")).click();
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("counter")))
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class);
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
			@Override
			public Boolean apply(WebElement ele) {
				if(ele.getText().equals("2"))
				{
					System.out.println("Text found!!!!!!!" + ele.getText());
					driver.close();
					return true;
				}
				else
				{
					System.out.println("Waiting!!!" + ele.getText());
					return false;
				}
				// TODO Auto-generated method stub
			}
		};
		wait.until(fun);
		System.out.println("END");
		
		
	}
}

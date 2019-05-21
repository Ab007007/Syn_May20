package com.synechron.training.basics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synechron.training.basics.utils.ActitimeUtils;

public class LoginTest
{

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("http://localhost/login.do");
		ActitimeUtils.validateTitle("actiTIME - Login");
		ActitimeUtils.loginToActitime("admin","manager");
		ActitimeUtils.validateTitle("actiTIME - Enter Time-Track");
	}

	
}

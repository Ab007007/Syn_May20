package com.synechron.training.basics.multibrowser;

import org.openqa.selenium.WebDriver;

import com.synechron.training.basics.utils.ActitimeUtils;
import static com.synechron.training.basics.utils.ActitimeUtils.getConfigValue;


public class FireFoxExecutionDemo 
{
	
	public static void main(String[] args) {
		WebDriver driver =  ActitimeUtils.getMyDriver(getConfigValue("browser"));
		ActitimeUtils.launchApplication(getConfigValue("url"));
		ActitimeUtils.loginToActitime(getConfigValue("username"), getConfigValue("password"));
		ActitimeUtils.logout();
	}

}

package com.synechron.training.basics.test;

import org.openqa.selenium.WebDriver;

import com.synechron.training.basics.utils.ActitimeUtils;
import com.synechron.training.basics.utils.ExcelUtils;

public class CreateProject extends ActitimeUtils
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= getMyDriver();
		launchApplication(getConfigValue("url"));
		loginToActitime(getConfigValue("username"), getConfigValue("password"));
		int rowCount = ExcelUtils.getRowCount("projectdata");
		
		for(int i=1;i<rowCount;i++)
		{
			clickOnTasks();		
			clickOnCreateProjectButton();		
			createProject(ExcelUtils.getMyCellValue("projectdata", i, 0),
					ExcelUtils.getMyCellValue("projectdata", i, 1),
					ExcelUtils.getMyCellValue("projectdata", i, 2));
			clickOnTT();
		
		}
		
			
		logout();

	}
}

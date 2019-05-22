package com.synechron.training.basics.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.training.basics.utils.ActitimeUtils;
import com.synechron.training.basics.utils.ExcelUtils;

public class CreateCustomerUsingExcelData extends ActitimeUtils
{

	public static void main(String[] args) 
	{
		String sheetname = "customerdata";
		WebDriver driver = getMyDriver();
		launchApplication(getConfigValue("url"));
		loginToActitime(getConfigValue("username"), getConfigValue("password"));
		clickOnTasks();
		int rowcout = ExcelUtils.getRowCount(sheetname);
		for(int i=1;i<rowcout;i++)
		{
			clickOnCreateCutomerButton();
			createCustomer(ExcelUtils.getMyCellValue(sheetname, i, 0),
					ExcelUtils.getMyCellValue(sheetname, i, 1));
			
		}
		
		
		
		logout();
	}

	
}

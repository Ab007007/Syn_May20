package com.synechron.training.basics.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	static File file = null;
	static FileInputStream fis = null;
	static Workbook wb = null;
	static Sheet sh = null;
	
	
	public static int getRowCount(String sheetName)
	{
		int rowCount = 0;
		try
		{
			file = new File(DriverUtils.getConfigValue("datafile"));
			fis = new FileInputStream(file);
	
			wb = WorkbookFactory.create(fis);
	
			sh = wb.getSheet(sheetName);
			
			rowCount = sh.getLastRowNum()+1;
		}
		catch(Exception ex )
		{
			System.out.println("exception while reading file...!!!!");
		}
	
		return rowCount;
	}

	
	public static String getMyCellValue(String sheetName, int rowNum, int cellNum)
	{
		Row row = null;
		Cell cell = null;
		try
		{
			file = new File(DriverUtils.getConfigValue("datafile"));
			fis = new FileInputStream(file);
	
			wb = WorkbookFactory.create(fis);
	
			sh = wb.getSheet(sheetName);
			
			row  =  sh.getRow(rowNum);
			cell = row.getCell(cellNum);
			fis.close();
		}
		catch(Exception ex )
		{
			System.out.println("exception while reading file...!!!!");
		}
		return cell.getStringCellValue();
	}
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//
//		File file = new File("data\\actitime_data.xls");
//		FileInputStream fis = new FileInputStream(file);
//
//		Workbook wb = WorkbookFactory.create(fis);
//
//		Sheet sh = wb.getSheet("customerdata");
//
//		System.out.println(sh.getLastRowNum() + 1);
//
//		for (int i = 1; i <= sh.getLastRowNum(); i++) {
//			Row row = sh.getRow(i);
//
//			Cell cell1 = row.getCell(0);
//			Cell cell2 = row.getCell(1);
//
//			System.out.print(cell1.getStringCellValue());
//			System.out.println(" -- " + cell2.getStringCellValue());
//		}
//
//		/*
//		 * int sheetCount = wb.getNumberOfSheets();
//		 * 
//		 * for (int i = 0; i < sheetCount; i++) {
//		 * System.out.println(wb.getSheetName(i));
//		 * 
//		 * 
//		 * 
//		 * }
//		 * 
//		 */
//		fis.close();
//
//	}

}

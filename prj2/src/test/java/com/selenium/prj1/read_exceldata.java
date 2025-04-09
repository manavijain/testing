package com.selenium.prj1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_exceldata {
	
	int lastrownum, lastcellnum;
	
	public static void main(String[] args) throws IOException
	{
		String s =excel_read();
		System.out.println(s);
		
	}
	
	public static String excel_read() throws IOException
	{
		
		String filename = "data.xlsx";
		String sheetname = "Sheet1";
		
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);
		
		XSSFRow r = sh.getRow(0);
		XSSFCell cell = r.getCell(0);
		String s = cell.getStringCellValue();
		//System.out.println(s);
		return s;

	}

}

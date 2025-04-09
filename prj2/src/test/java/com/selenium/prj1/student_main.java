package com.selenium.prj1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class student_main {

    public static void main(String[] args) throws IOException 
    {
        String filename = "students.xlsx";
        student_main obj = new student_main();
      
        HashMap<Integer, student> studentdata = obj.read_data(filename);
        
        obj.write_data(filename, studentdata);
    }

    
	public HashMap<Integer, student> read_data(String filename) throws IOException 
	{
	    HashMap<Integer, student> map = new HashMap<>();
	
	    FileInputStream fis = new FileInputStream(filename);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	 
	    XSSFSheet sheet1 = wb.getSheet("Sheet1");
	    for (int i = 1; i <=3; i++) 
	    { 
	        XSSFRow row = sheet1.getRow(i);
	
	        int sid = (int) row.getCell(0).getNumericCellValue(); 
	        int maths = (int) row.getCell(1).getNumericCellValue(); 
	        int phy = (int) row.getCell(2).getNumericCellValue(); 
		
	        student s = new student(sid, maths, phy, null, null); 
	        map.put(sid, s);
	    }
	
	
	    XSSFSheet sheet2 = wb.getSheet("Sheet2");
	    for (int i = 1; i <=3; i++) 
	    { 
	        XSSFRow row = sheet2.getRow(i);
	
	        int sid = (int) row.getCell(0).getNumericCellValue();
	        String name = row.getCell(1).getStringCellValue(); 
	        String sem = row.getCell(2).getStringCellValue(); 
	    
	        if (map.containsKey(sid)) 
	        {
	            student s = map.get(sid);
	            s.sname = name;
	            s.sem = sem;
	            map.put(sid, s); 
	        }
	    }
	    wb.close();
	    fis.close();
	
	    return map;
	}
	
	public void write_data(String filename,HashMap<Integer, student> map) throws IOException
	{
		FileInputStream fis = new FileInputStream(filename);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	 
	    XSSFSheet sheet2 = wb.getSheet("Sheet2");
	    
	    for(int i=1;i<4;i++)
	    {
	    	XSSFRow row = sheet2.getRow(i);
	    	int sid = (int) row.getCell(0).getNumericCellValue();
	    	
	    	 if (map.containsKey(sid))
	    	 {
	    		 student s = map.get(sid);
	    		 XSSFCell cell3 = row.createCell(3);
	 	    	 cell3.setCellValue(s.calcavg());
	    	 }	    	
	    }
	    
    	FileOutputStream fos = new  FileOutputStream(filename);
    	wb.write(fos);
	    wb.close();
	}
}

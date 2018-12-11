package com.xqt.framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excellibrary {

	
	public static String filepath="tests/testscenarios.xlsx";
	
	public String getExcelValue (String sheetName, int rowNum, int cellNum)throws EncryptedDocumentException, InvalidFormatException, IOException{
		String retValue=null;
		
		try {
			FileInputStream fis = new FileInputStream(filepath);
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			retValue = c.getStringCellValue();			
		}catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("SS");
		return retValue;
	
//REE
	}
	
	
	public int getExcelValueInt(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		int retValue=0;
		
		try {
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			String cellvalue = c.getStringCellValue();	
			retValue=Integer.parseInt(cellvalue);
		}catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retValue;
	}
	
	
	
	
	
	public static int getrowcount(String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException{
		int ratval=0;
		
		FileInputStream fis=new FileInputStream(filepath);
	 
	 Workbook	wb = WorkbookFactory.create(fis);
	
Sheet s=wb.getSheet(sheetname);
ratval=	s.getLastRowNum();
		
	
		return ratval;
	}
	
	@SuppressWarnings("deprecation")
	public void setExcelValue(String sheetName, int rowNum, int cellNum, String val){		
				try {
			FileInputStream fis = new FileInputStream(filepath);
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.createCell(cellNum);
			//c.setCellType(Cell.CELL_TYPE_NUMERIC);
		c.setCellType(Cell.CELL_TYPE_STRING);
			c.setCellValue(val);
			FileOutputStream fos = new FileOutputStream(filepath);
			wb.write(fos);		
			fos.close();
		}catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}	

	@SuppressWarnings("deprecation")
	public void setExcelValueInt(String sheetName, int rowNum, int cellNum, int val)throws EncryptedDocumentException, InvalidFormatException, IOException{		
		try {
	FileInputStream fis = new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet(sheetName);
	Row r = s.getRow(rowNum);
	Cell c = r.createCell(cellNum);
	c.setCellType(Cell.CELL_TYPE_NUMERIC);
    //c.setCellType(Cell.CELL_TYPE_STRING);
	c.setCellValue(val);
	FileOutputStream fos = new FileOutputStream(filepath);
	wb.write(fos);		
	fos.close();
}catch (InvalidFormatException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}

}		
	
public String getdateandtime(){

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    String ratval= dateFormat.format(date);	 
   return ratval;
	
}










}

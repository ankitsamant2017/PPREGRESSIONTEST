package com.xqt.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellibrary {

public String file="";	



public int getrowcount(String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException {
int ratval=0;
FileInputStream fis=new FileInputStream(file);
Workbook wb=  WorkbookFactory.create(fis);
Sheet s=wb.getSheet(sheetname);
ratval=s.getLastRowNum();
return ratval;
		
	}
	
	
public String getexcelvalue(String sheetname,int rownum,int Cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
String ratval=null;	

FileInputStream fis=new FileInputStream(file);
Workbook wb=WorkbookFactory.create(fis);
Sheet s=wb.getSheet(sheetname);
Row r=s.getRow(rownum);
Cell c=r.getCell(Cellnum);
ratval=c.getStringCellValue();
return ratval;

}
	



public void setvaluetoexcel(String sheetname,int rownum,int Cellnum,String value) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream(file);
Workbook wb=	WorkbookFactory.create(fis);
Sheet s=	wb.getSheet(sheetname);
Row r=s.getRow(rownum);
Cell c=r.createCell(Cellnum);
c.setCellType(Cell.CELL_TYPE_STRING);
c.setCellValue(value);
FileOutputStream fos=new FileOutputStream(file);
wb.write(fos);
fos.close();


}
	
	
	
	
	
	
}




















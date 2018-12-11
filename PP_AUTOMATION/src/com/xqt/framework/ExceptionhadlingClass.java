package com.xqt.framework;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class ExceptionhadlingClass {

	public static TeseExecutor te=new TeseExecutor();
	
	public void Setvaltoexcelwithexception(String element,String screenname,int teststep) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String str=null;
		
		try {
			str=webdriverclass.ff.findElement(By.xpath(element)).getText();	
			if(str!=null) {
				
				te.SetCounttoExcel(teststep,screenname,str);
			}
		}catch(NoSuchElementException e) {
			
			te.SetCounttoExcel(teststep,screenname,"0");
		}
		
	}







}

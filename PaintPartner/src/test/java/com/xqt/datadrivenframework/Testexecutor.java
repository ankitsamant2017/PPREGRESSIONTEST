package com.xqt.datadrivenframework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testexecutor {


	public WebElement element=null;
public  void executetest(String scenarioname) throws EncryptedDocumentException, InvalidFormatException, IOException {
		ExcelLibrary lib=new ExcelLibrary();
		ReadWER wer=new ReadWER();
		
int Totalteststeps=	lib.Getrowcount(scenarioname);
	
		for(int teststep=1;teststep<=Totalteststeps;teststep++) {
			
String elementidmethod=	ExcelLibrary.getexcelStringvalue(scenarioname, teststep, 2);
String logicalname=		ExcelLibrary.getexcelStringvalue(scenarioname, teststep, 3);
String elementidvalue=wer.getelemnetfromWER(logicalname, "G:\\selenium workspace\\GIT-Repository\\PaintPartner\\wer\\wer.properties");

String action=	ExcelLibrary.getexcelStringvalue(scenarioname, teststep, 4);
String data=		ExcelLibrary.getexcelStringvalue(scenarioname, teststep, 5);


//element identification

if(elementidmethod.equals("name")) {
	element=Startup.driver.findElement(By.name(elementidvalue));
	if(element==null) {
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
	}
	}

else if(elementidmethod.equals("id")) {
 element=Startup.driver.findElement(By.id(elementidvalue));
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
}
if(elementidmethod.equals("cssselector")) {
	element=Startup.driver.findElement(By.cssSelector(elementidvalue));
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
}
else if(elementidmethod.equals("xpath")) {
	
	element=Startup.driver.findElement(By.xpath(elementidvalue));
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
}
if(elementidmethod.equals("partiallinktext")) {
	element=Startup.driver.findElement(By.partialLinkText(elementidvalue));
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
}
else if(elementidmethod.equals("linktext")) {
	
	element=Startup.driver.findElement(By.linkText(elementidvalue));
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
}
else if(elementidmethod.equals("classname")) {
	
	element=Startup.driver.findElement(By.className(elementidvalue));
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
}
else if(elementidmethod.equals("tagname")) {
	
	element=Startup.driver.findElement(By.tagName(elementidvalue));
	lib.Setvalueinxl(scenarioname, teststep, 6, "FAIL");
	lib.Setvalueinxl(scenarioname, teststep, 7, "Element "+logicalname+" not found");
}


// Action



if(action.equals("sendkeys")) {
	
if(element!=null) {
	element.sendKeys(data);
	lib.Setvalueinxl(scenarioname, teststep, 6, "PASS");
	lib.Setvalueinxl(scenarioname, teststep, 7,"Typed "+data+" into "+logicalname+"");
}
}

else if(action.equals("click")) {
	if(element!=null) {
	element.click();
	lib.Setvalueinxl(scenarioname, teststep, 6, "PASS");
	lib.Setvalueinxl(scenarioname, teststep, 7,"Clicked on "+logicalname+" element");
}
}


else if(action.equals("select")) {
		
if(element!=null) {
	Select sel=new Select(element);
	sel.selectByVisibleText(data);
	lib.Setvalueinxl(scenarioname, teststep, 6, "PASS");
	lib.Setvalueinxl(scenarioname, teststep, 7,"Selected "+data+" from "+logicalname+" dropdown");
}
}
else if(action.equals("verfiyalert")) {
	
Alert alrt=Startup.driver.switchTo().alert();
if(data.equals("ok") ) {
alrt.accept();	
lib.Setvalueinxl(scenarioname, teststep, 6, "pass");
lib.Setvalueinxl(scenarioname, teststep, 7, "Clicked on OK");	
}else if(data.equals("cancel"))
	alrt.dismiss();
lib.Setvalueinxl(scenarioname, teststep, 6, "pass");
lib.Setvalueinxl(scenarioname, teststep, 7, "clikced on cancel");	
	
}


else if(action.equals("verifytitlepresent")) {
	
String Actualtitle=Startup.driver.getTitle();	
	if(Actualtitle.equals(data)) {
  lib.Setvalueinxl(scenarioname, teststep, 6, "pass");
  lib.Setvalueinxl(scenarioname, teststep, 7, "title matched");	
	}else {
		lib.Setvalueinxl(scenarioname, teststep, 6, "fail");
		lib.Setvalueinxl(scenarioname, teststep, 7, "Title not Matched");	
	}
}

else if(action.equals("verifyurlpresent")) {
		
String actualurl=Startup.driver.getTitle().trim();	
	if(actualurl.equals(data)) {
  lib.Setvalueinxl(scenarioname, teststep, 6, "pass");
  lib.Setvalueinxl(scenarioname, teststep, 7, "url Matched");
			}
	else {
		lib.Setvalueinxl(scenarioname, teststep, 6, "fail");
		lib.Setvalueinxl(scenarioname, teststep, 7, "url not Matched");	
	}
}
	
else if(action.equals("verifyelementpresent")) {
	
if(element!=null) {
	lib.Setvalueinxl(scenarioname, teststep, 6, "pass");
	lib.Setvalueinxl(scenarioname, teststep, 7, "elemet is present");
}else  {
	lib.Setvalueinxl(scenarioname, teststep, 6, "fail");
	lib.Setvalueinxl(scenarioname, teststep, 7, "elemet is not present");
	
}
}
else if(action.equals("verfiytext")) {
	if(element!=null) {
String actaultext=	element.getText();	
	if(actaultext.equals(data)) {
		lib.Setvalueinxl(scenarioname, teststep, 6, "pass");
		lib.Setvalueinxl(scenarioname, teststep, 7, "text is present");
	}else  {
		lib.Setvalueinxl(scenarioname, teststep, 6, "fail");
		lib.Setvalueinxl(scenarioname, teststep, 7, "text is not present");
		
	}
	
	
	}


}


		}

		}
		
		
			
		
	}
	
	


package com.xqt.datadrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Startup {

	public static WebDriver driver=null;

public static void main(String args[]) throws IOException, EncryptedDocumentException, InvalidFormatException, ClassNotFoundException {
	
ReadWER wer=new ReadWER();
@SuppressWarnings("unused")
String browsername=wer.getelemnetfromWER("BROWSER", "G:\\selenium workspace\\GIT-Repository\\PaintPartner\\config\\config.properties");
String Url=wer.getelemnetfromWER("URL", "G:\\selenium workspace\\GIT-Repository\\PaintPartner\\config\\config.properties");


if(browsername.equals("chrome")) {
	driver=new ChromeDriver();
	
	
	
}else if(browsername.equals("firefox")) {
	//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver=new FirefoxDriver();	
}


driver.manage().window().maximize();
driver.get(Url);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
ExcelLibrary lib=new ExcelLibrary();

int totaltests=lib.Getrowcount("scenarios");
for(int testscenario=1;testscenario<=totaltests;testscenario++) {
	
	String executionstatus=ExcelLibrary.getexcelStringvalue("scenarios", testscenario, 1);
//	System.out.println(executionstatus);
	if(executionstatus.equalsIgnoreCase("yes")) {
String scenarioname=ExcelLibrary.getexcelStringvalue("scenarios", testscenario, 0);
System.out.println("********************scenario name******************************"+scenarioname);

JUnitCore runTest = new JUnitCore();
@SuppressWarnings("rawtypes")
Class c;
try {
	c = Class.forName("com.xqt.group1.PaintPartner."+scenarioname);
	runTest.run(c);
	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
	}
	
	
}

		
	}
	
	

}

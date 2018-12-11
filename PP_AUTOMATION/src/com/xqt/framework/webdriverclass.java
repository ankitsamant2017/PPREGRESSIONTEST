package com.xqt.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webdriverclass implements webdriverinterface {

	
	public static WebDriver ff=null;

@Override
public void chromedriver() {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium workspace\\GIT-Repository\\PAINT-PARTNER-AUTOMATION\\chromedriver.exe");
		 ff=new ChromeDriver();
		 ff.manage().window().maximize();
	
	}
@Override
public void iedriver() {
		System.setProperty("webdriver.ie.driver", "G:\\selenium workspace\\GIT-Repository\\PAINT-PARTNER-AUTOMATION\\IEDriverServer.exe");
		 ff=new InternetExplorerDriver();
		
	}
@Override
public void operadriver() {
	
		
	}
@Override
public void safaridriver() {
		
		
	}

@Override
public void firefoxdriver() {
	
    //  FirefoxProfile prof = new FirefoxProfile();
		//	prof.setPreference("browser.download.dir", "D:/selenium workspace/selenium/Downloads");
		//	prof.setPreference("browser.download.folderList", 0);
		//	prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv,application/excel,application/vnd.ms-excel,application/x-excel,");
			
				   
			
			System.setProperty("webdriver.gicko.driver", "G:\\selenium workspace\\GIT-Repository\\PAINT-PARTNER-AUTOMATION\\geckodriver.exe");


			 ff = new FirefoxDriver();
			
	}
	

}

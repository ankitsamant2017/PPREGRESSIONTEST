package com.xqt.group1.PaintPartner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverclass  {

	public static WebDriver driver=null;
	
	public void FireFoxdriver() {
		
		
		//FirefoxProfile profile=new FirefoxProfile();
	//	 profile.setPreference("browser.download.dir",  "G:\\\\selenium workspace\\\\GIT-Repository\\\\PaintPartner");
		// profile.setPreference("browser.download.folderList", 2);
//profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip,");		
		
		


		System.setProperty("webdriver.gecko.driver", "G:\\selenium workspace\\GIT-Repository\\PaintPartner\\geckodriver.exe");

		
		
		driver=new FirefoxDriver();
			
	}

	
	public void Chromedriver() {
		
		System.getProperty("webdriver.chrome.driver", "G:\\selenium workspace\\workspace\\PaintPartner\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}

	public void IEdriver() {
		// TODO Auto-generated method stub
		
	}

	public void Operadriver() {
		// TODO Auto-generated method stub
		
	}

	
	
}

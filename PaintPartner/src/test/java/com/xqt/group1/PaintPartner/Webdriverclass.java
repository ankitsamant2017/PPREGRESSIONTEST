package com.xqt.group1.PaintPartner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverclass  {

	public static WebDriver driver=null;
	
	public void FireFoxdriver() {
		
		System.getProperty("webdriver.firefox.driver", "G:\\selenium workspace\\workspace\\PaintPartner\\geckodriver.exe");
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

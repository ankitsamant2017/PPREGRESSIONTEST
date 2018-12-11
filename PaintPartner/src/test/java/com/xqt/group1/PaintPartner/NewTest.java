package com.xqt.group1.PaintPartner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	@Test
  public void test() {
	  
		
WebDriver ff=new ChromeDriver();
//ff.get("file:///G:/Work%20Area%20Ankit_Samant/Testing%20material/selenium/SELENIUM%20PROGRAMS%20UPTO%20(11-01-13)/html%20page/example.html");
	
    ff.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ff.manage().window().maximize();
	ff.get("http://www.google.com"); 
	
		//aananan
		
  }
}

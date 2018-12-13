package com.xqt.group1.PaintPartner;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ColourSearch {
	
Webdriverclass getdriver=new Webdriverclass();	

@Test
public void verfiycoloursearchpage() {
	    
 String title=Webdriverclass.driver.getTitle();
System.out.println(title);

  }
  
  
  @BeforeTest
  public void Login() {
	  
//	  getdriver.Chromedriver();
	  getdriver.FireFoxdriver();
	  
	  Webdriverclass.driver.manage().window().maximize();
	  Webdriverclass.driver.get("http://192.168.1.245:8065/Admin/Login.aspx");
	  Webdriverclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  Webdriverclass.driver.manage().deleteAllCookies();
	  Webdriverclass.driver.findElement(By.name("txtUserName")).sendKeys("PPADMIN");
	  Webdriverclass.driver.findElement(By.name("txtPassword")).sendKeys("12345");
	  Webdriverclass.driver.findElement(By.name("btnLogin")).click();
	  	  
  }
  
  @AfterTest
  public void Logout() throws InterruptedException {

Thread.sleep(5000);
//WebDriverWait wait=new WebDriverWait(Webdriverclass.driver, 4);
//wait.until(ExpectedConditions.visibilityOf(Webdriverclass.driver.findElement(By.cssSelector("img[title='Logout']"))));	
//Webdriverclass.driver.findElement(By.cssSelector("img[title='Logout']")).click();
Webdriverclass.driver.quit();
  }
 
  
  
  
@Test(enabled=false)
public void viewformulation() throws InterruptedException {
	  
	WebDriverWait wait=new WebDriverWait(Webdriverclass.driver, 4);
	wait.until(ExpectedConditions.visibilityOf(Webdriverclass.driver.findElement(By.xpath("//div[@class='dashboard_orange']"))));
	Webdriverclass.driver.findElement(By.xpath("//div[@class='dashboard_orange']")).click();

WebElement allstreams=null;
WebElement element=null;


allstreams=Webdriverclass.driver.findElement(By.name("ddlProdColorStream"));
Select selstream=new Select(allstreams);
selstream.selectByVisibleText("NAX PREMILA");
	
Webdriverclass.driver.findElement(By.name("btnColorSearch")).click();
	
Thread.sleep(10000);
//Webdriverclass.driver.findElement(By.xpath("//a[@id='gvColors_ctl02_lnkView']/img")).click();

java.util.List<WebElement> el =Webdriverclass.driver.findElements(By.xpath("//table[@id='gvColors']/tbody/tr/td/a/img"));
   
                                                            
   
System.out.println(el.size());

el.get(3).click();


Set<String> wh= Webdriverclass.driver.getWindowHandles();
java.util.Iterator<String> it= wh.iterator();

String parent= it.next();

String child=it.next();

Webdriverclass.driver.switchTo().window(child);

Webdriverclass.driver.getTitle();



Webdriverclass.driver.switchTo().window(parent);


//Webdriverclass.driver.close();

}



@Test 

public void systemreport() throws InterruptedException {

	//Webdriverclass.driver.findElement(By.xpath("//div[@class='dashboard_bg']")).click();
	//Webdriverclass.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebDriverWait wait=new WebDriverWait(Webdriverclass.driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dashboard_redish']")));
	
	
	Webdriverclass.driver.findElement(By.xpath("//div[@class='dashboard_redish']")).click();
	
	Webdriverclass.driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_updDownload']//div[9][@class='col-lg-3 master']/a")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.name("ctl00$ContentPlaceHolder1$txtFrom")));
	Webdriverclass.driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtFrom")).click();
	
	Webdriverclass.driver.findElement(By.id("ctl00_ContentPlaceHolder1_CalendarExtender2_day_1_0")).click();
	
	//Webdriverclass.driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnSearch")).click();
	
//	Thread.sleep(2000);
	
	
	//wait.until(ExpectedConditions.elementToBeClickable(By.name("ctl00$ContentPlaceHolder1$btnExport")));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ctl00$ContentPlaceHolder1$btnExport")));
	
	Webdriverclass.driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnExport")).click();
	

	
	
	
	
	
	
}










}




























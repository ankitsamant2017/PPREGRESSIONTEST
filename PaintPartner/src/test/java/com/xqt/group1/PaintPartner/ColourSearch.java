package com.xqt.group1.PaintPartner;

import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	  
	  getdriver.Chromedriver();
	  Webdriverclass.driver.manage().window().maximize();
	  Webdriverclass.driver.get("http://192.168.1.245:8065/Admin/Login.aspx");
	  Webdriverclass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  Webdriverclass.driver.manage().deleteAllCookies();
	  Webdriverclass.driver.findElement(By.name("txtUserName")).sendKeys("PPADMIN");
	  Webdriverclass.driver.findElement(By.name("txtPassword")).sendKeys("12345");
	  Webdriverclass.driver.findElement(By.name("btnLogin")).click();
	  	  
  }
  
  @AfterTest
  public void Logout() {


//WebDriverWait wait=new WebDriverWait(Webdriverclass.driver, 4);
//wait.until(ExpectedConditions.visibilityOf(Webdriverclass.driver.findElement(By.cssSelector("img[title='Logout']"))));	
//Webdriverclass.driver.findElement(By.cssSelector("img[title='Logout']")).click();
//Webdriverclass.driver.quit();
  }
 
@Test
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

System.out.println(Webdriverclass.driver.getTitle());

Webdriverclass.driver.close();

Webdriverclass.driver.switchTo().window(parent);
Webdriverclass.driver.getTitle();

System.out.println(Webdriverclass.driver.getTitle());





//Webdriverclass.driver.close();



}


}




























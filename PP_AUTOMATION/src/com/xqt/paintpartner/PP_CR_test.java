package com.xqt.paintpartner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xqt.framework.readWER;
import com.xqt.framework.webdriverclass;

import junit.framework.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PP_CR_test {
	
	public  webdriverclass getdriver=new webdriverclass();
	public WebElement element=null;
	readWER wer=new readWER(); 
	
	@BeforeMethod
	public void go(){
		
	}
	//AAN
	
	@AfterMethod
	public void gotohomepage(){
		
		 webdriverclass.ff.findElement(By.xpath("//img[@src='NPNImages/home.png']")).click();
		 //ass
	}

	

	
@SuppressWarnings("static-access")
@BeforeTest
public void openchromedriver() throws IOException{
  getdriver.chromedriver();
  webdriverclass.ff.get(readWER.getElementFromWER("URL","config/config.properties"));
  webdriverclass.ff.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  webdriverclass.ff.manage().deleteAllCookies();
  webdriverclass.ff.findElement(By.name("txtUserName")).sendKeys(wer.getElementFromWER("crusername","config/config.properties"));
  webdriverclass.ff.findElement(By.name("txtPassword")).sendKeys(wer.getElementFromWER("crpassword","config/config.properties"));
 webdriverclass.ff.findElement(By.name("btnLogin")).click();
  }

	                                    //TEST FOR COLOUR SEARCH MODULE
  @Test(enabled=true,priority=0)
  public void coloursearch() throws IOException, InterruptedException {
	  System.out.println("****************************************************************************************************");	
	  System.out.println("Please Wait,CR Testcases to take screenshoot are getting executed......!!!");	
	Select streamdropdown;
	  WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 20);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	element=webdriverclass.ff.findElement(By.xpath("//div [@class='dashboard_orange']"));

wait.until(ExpectedConditions.elementToBeClickable(element));
element.click();;
//webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='spnRecordCount']")));
element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX SUPERIO");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);
File src= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
FileUtils. copyFile(src, new File("screeshots/countryrep/coloursearchSUPERIO.png"));

element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX PREMILA");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);
File src1= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
FileUtils. copyFile(src1, new File("screeshots/countryrep/coloursearchPREMILA.png"));

element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);
File src2= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
FileUtils. copyFile(src2, new File("screeshots/countryrep/coloursearchWB.png"));

element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);


File src3= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
FileUtils. copyFile(src3, new File("screeshots/countryrep/coloursearchRADIANT.png"));

	  }
 
  
  
  
  
                                                 //TEST FOR COLOUR REQUEST MODULE
 @Test(enabled=true,priority=1) 
  public void colourrequest() throws IOException, InterruptedException{
WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 15);
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));

  webdriverclass.ff.findElement(By.xpath("//div[@class='dashboard_yellow']")).click();
  File src=	((TakesScreenshot)webdriverclass.ff).getScreenshotAs(OutputType.FILE);  
  FileUtils.copyFile(src, new File("screeshots/countryrep/Colourrequestpage.jpeg"));
  String actual=webdriverclass.ff.findElement(By.xpath("//div[ @class='dashboard_bg']/h1")).getText();
  String expected="View Colour Request";
Assert.assertEquals("failed to find colourequst title", expected, actual);
  

//test for NEW request module
webdriverclass.ff.findElement(By.linkText("New Request")).click();
 element=webdriverclass.ff.findElement(By.name("ctl00$ContentPlaceHolder1$ddlCCRType"));
Select sel=new Select(element);
sel.selectByVisibleText("NR - (NORMAL REQUEST)");

Thread.sleep(2000);

//firefoxdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")).click();


webdriverclass.ff.findElement(By.linkText("New Request")).click();
element=webdriverclass.ff.findElement(By.name("ctl00$ContentPlaceHolder1$ddlCCRType"));

Select sel1=new Select(element);
sel1.selectByVisibleText("CCR - (HIGH PRIORITY)");
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")).click();
Thread.sleep(2000);

webdriverclass.ff.findElement(By.linkText("New Request")).click();
element=webdriverclass.ff.findElement(By.name("ctl00$ContentPlaceHolder1$ddlCCRType"));
Select sel2=new Select(element);
sel2.selectByVisibleText("FF - (FIELD FORMULATION)");
//firefoxdriverclass.ff.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_aDashBoard']")).click();

  }


                                                    //TEST FOR PRICING MODULE
 @Test(enabled=true,priority=2)
 public void setcountrypricing() throws IOException {
  
	   webdriverclass.ff.findElement(By.xpath("//div[@class='dashboard_darkgreen']")).click();
	  File src=((TakesScreenshot)webdriverclass.ff).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("screeshots/countryrep/setcountrypricing.jpeg"));
	   String actual=webdriverclass.ff.findElement(By.xpath("//div[ @class='dashboard_bg']/h1")).getText();
	   String expected="Set Country Price";
	 Assert.assertEquals("failed to find Set Country Price title", expected, actual);
 webdriverclass.ff.findElement(By.linkText("Pricing Breakup")).click();
	 webdriverclass.ff.findElement(By.linkText("Pricing History")).click();
	// firefoxdriverclass.ff.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_aDashBoard']")).click();
 }
 
                                                      //TEST FOR SET PRIORITY
@Test(enabled=true,priority=3)
public void setpriority	() throws IOException, InterruptedException {
WebDriverWait wait=new   WebDriverWait(webdriverclass.ff, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_slati']/ul/li[2]")));
webdriverclass.ff.findElement(By.xpath("//div[@class='dashboard_slati']/ul/li[2]")).click();
Thread.sleep(1000);
File src=((TakesScreenshot)webdriverclass.ff).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("screeshots/countryrep/setpriority.jpeg"));
String actual=webdriverclass.ff.findElement(By.xpath("//div[ @class='dashboard_bg']/h1")).getText();
String expected="Set Colour Creation Priority";
Assert.assertEquals("failed to find Set Colour Creation Priority title", expected, actual);

//webdriverclass.ff.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_aDashBoard']")).click();
}
 


                                 //TEST FOR DOWNLOAD MODULE
@SuppressWarnings("deprecation")
@Test(enabled=true,priority=4)
public void downloads() throws IOException, InterruptedException {


//click on download	  
	
	WebDriverWait wait=new   WebDriverWait(webdriverclass.ff, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Downloads']")));	

	webdriverclass.ff.findElement(By.xpath("//li[text()='Downloads']")).click();  
	wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//div[@class='dashboard_bg']/h1"), "Downloads"));
	File src1= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
	FileUtils. copyFile(src1, new File("screeshots/countryrep/downloads.jpeg")); 

	/*
	//click on mobile app
	webdriverclass.ff.findElement(By.linkText("Mobile App")).click(); 
	String tooltiptext= webdriverclass.ff.findElement(By.xpath("//img [@src='NPNImages/loginpage/android.png'] ")).getAttribute("title");
	String expected="Click here to download Paint Partner (Android) App"; 
	//System.out.println(tooltiptext);
	 Assert.assertEquals("failed to find tool tip", expected, tooltiptext);
	 webdriverclass.ff.findElement(By.linkText("X")).click();
	 
	 
	//click on documents
	 element=webdriverclass.ff.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkDocuments']"));
	 element.click();

	 //WebDriverWait wait=new WebDriverWait(firefoxdriverclass.ff, 10);
	 //wait.until(ExpectedConditions.elementToBeClickable(element));
	String tooltiptext1= webdriverclass.ff.findElement(By.xpath("//a[text()='Normal Request Format']")).getAttribute("title");
	String expected1="excel"; 
	//System.out.println(tooltiptext1);
	Assert.assertEquals("failed to find tool tip", expected1, tooltiptext1);
	webdriverclass.ff.findElement(By.linkText("X")).click(); 
*/	 
	//click on offlinetools
	
	element=webdriverclass.ff.findElement(By.xpath("//div[3]/a[@class='hvr-border-fade master-dash']"));
	Actions act=new Actions(webdriverclass.ff);
	

	act.contextClick(element).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_RIGHT).perform();
  Thread.sleep(1000);
act.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(200);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
Set<String> wh1=webdriverclass.ff.getWindowHandles();
//System.out.println("wuindowss"+wh1);
Iterator<String> it=wh1.iterator();
String Parent=it.next();
//System.out.println(Parent);
String Child=it.next();
//System.out.println(Child);
webdriverclass.ff.switchTo().window(Child);
Thread.sleep(2000);
File src2= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
FileUtils. copyFile(src2, new File("screeshots/countryrep/offlinetools.jpeg"));
Thread.sleep(2000);
webdriverclass.ff.close();
webdriverclass.ff.switchTo().window(Parent);
}
 
                                                   //TEST FOR PROFILE 
@Test(enabled=true,priority=5 )
public void PROFILE	() throws IOException {

webdriverclass.ff.findElement(By.xpath("//div[@class='right_inf']/ul/li[4]")).click();
String actual=webdriverclass.ff.findElement(By.xpath("//div[ @class='dashboard_bg']/h1")).getText();
String expected="View/Update Profile Details";
Assert.assertEquals("failed to find Profile title", expected, actual);
webdriverclass.ff.findElement(By.linkText("Change Password")).click();
//webdriverclass.ff.findElement(By.linkText("Change Password")).click();

//firefoxdriverclass.ff.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_aDashBoard']")).click();
//firefoxdriverclass.ff.findElement(By.cssSelector("a[href='Logout.aspx']")).click();
}

 
  @AfterTest
	public void closefirefox(){
webdriverclass.ff.quit();
System.out.println("Congratulation,CR Screenshoot taken Successfully......!!!  ");	
System.out.println("****************************************************************************************************");	

	}


  
}

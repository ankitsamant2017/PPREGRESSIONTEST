package com.xqt.paintpartner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xqt.framework.readWER;
import com.xqt.framework.webdriverclass;

import junit.framework.Assert;

import java.awt.AWTException;
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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PP_ADMIN_test {
	
	public  webdriverclass getdriver=new webdriverclass();
	public WebElement element=null;
readWER wer=new readWER();
	
public File takescreenshot(){   //TAKE SCREENSHOT METHOD
		
		File src= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
		return src;	
	}


	@SuppressWarnings("rawtypes")
	public Wait explicitwait(){  //EXPLICITY/FLUENT WAIT METHOD
		
		WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 20);
		return wait;
	
		
	}
	
	
	
	@BeforeMethod
	public void go(){
	}
	
	@AfterMethod
	public void gotohomepage(){
		
		 webdriverclass.ff.findElement(By.xpath("//img[@src='NPNImages/home.png']")).click();
		 //webdriverclass.ff.findElement(By.xpath("//img[@src='NPNImages/home.png']")).click();
		 
	}
	
	
	
@SuppressWarnings("static-access")
@BeforeTest
public void openchromedriver() throws IOException{
getdriver.chromedriver();
webdriverclass.ff.get(readWER.getElementFromWER("URL","config/config.properties"));
  webdriverclass.ff.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  webdriverclass.ff.manage().deleteAllCookies();
  webdriverclass.ff.findElement(By.name("txtUserName")).sendKeys(wer.getElementFromWER("adminusername","config/config.properties"));
  webdriverclass.ff.findElement(By.name("txtPassword")).sendKeys(wer.getElementFromWER("adminpassword","config/config.properties"));
 webdriverclass.ff.findElement(By.name("btnLogin")).click();
  }
		
	
	                                  //TEST FOR COLOUR SEARCH MODULE
  @Test(enabled=true,priority=0)
  public void coloursearch() throws IOException, InterruptedException {
	  System.out.println("****************************************************************************************************");		  
  System.out.println("Please Wait,Admin Testcases to get screenshoot executing......!!!");
	Select streamdropdown;
  WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 25);
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
  public void colourrequest() throws IOException{
WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 10);
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
File src=	((TakesScreenshot)webdriverclass.ff).getScreenshotAs(OutputType.FILE);  
  FileUtils.copyFile(src, new File("screeshots/admin/adminDASHBOARD.jpeg"));
  webdriverclass.ff.findElement(By.xpath("//div[@class='dashboard_yellow']")).click();
  


                                                 //test for NEW request module
File src1=	((TakesScreenshot)webdriverclass.ff).getScreenshotAs(OutputType.FILE);  
FileUtils.copyFile(src1, new File("screeshots/admin/viewrequest.jpeg"));

webdriverclass.ff.findElement(By.linkText("New Request")).click();
 
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlRequestType"));
Select sel=new Select(element);
sel.selectByVisibleText("CCR - (HIGH PRIORIY)");

webdriverclass.ff.navigate().refresh();
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlRequestType"));
Select sel1=new Select(element);
sel1.selectByVisibleText("NR - (NORMAL REQUEST)");


//firefoxdriverclass.ff.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_aDashBoard']")).click();

  }

                                      //TEST FOR MANAGE PANEL 
@SuppressWarnings("unchecked")
@Test(enabled=true,priority=2 )
public void managepanel() throws IOException, InterruptedException {
	 explicitwait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='dashboard_bg']/h1")));
	 
	 webdriverclass.ff.findElement(By.xpath("//li[text()='Manage Panel']")).click();
	 explicitwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[ @class='dashboard_bg']/h1")));
String actual=webdriverclass.ff.findElement(By.xpath("//div[ @class='dashboard_bg']/h1")).getText();
	   String expected="View Panels";
	 Assert.assertEquals("failed to find view panel", expected, actual);
		explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
  File Src=	 ((TakesScreenshot)webdriverclass.ff).getScreenshotAs(OutputType.FILE);
	// File savepath=new File("screeshots/admin/managepanel.jpeg");
	 FileUtils.copyFile(Src, new File("screeshots/admin/acceptedmanagepanel.jpeg"));
	  @SuppressWarnings("unused")
	File Src1=	 ((TakesScreenshot)webdriverclass.ff).getScreenshotAs(OutputType.FILE);
	 webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_rdbPanelApprovalStatus_1")).click();
	 Thread.sleep(2000);
	 FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/rejectedmanagepanel.jpeg"));

	 
	 
//File Src1= ((TakesScreenshot)firefoxdriverclass.ff).getScreenshotAs(OutputType.FILE);
}
                                      //TEST FOR MANAGE COLOUR 
@SuppressWarnings({ "unchecked", "deprecation" })
@Test(enabled=true,priority=3)
public void managecolour() throws IOException, InterruptedException {

explicitwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[text()='Manage Colour']")));
webdriverclass.ff.findElement(By.xpath("//li[text()='Manage Colour']")).click();
explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
//takescreenshot();
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/viewallcolours.jpeg"));
                   //click to water base colour search
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
Select sel=new Select(element);
//System.out.println(sel.getOptions());

int totalstreams=sel.getOptions().size();

for(int stream=1;stream<=totalstreams;stream++){
	
}



sel.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
Thread.sleep(8000);
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Viewcolours_WB.jpeg"));


                  //click to nax premila colour search
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
Select sel1=new Select(element);
sel1.selectByVisibleText("NAX PREMILA");
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
Thread.sleep(8000);
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Viewcolours_NAX PREMILA.jpeg"));

                   //click to RADIANT colour search
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
Select sel2=new Select(element);
sel2.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
Thread.sleep(8000);
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Viewcolours_RADIANT.jpeg"));	



                   //click to nax suprio colour search
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
Select sel3=new Select(element);
sel3.selectByVisibleText("NAX SUPERIO");
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
Thread.sleep(8000);
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Viewcolours_NAX SUPERIO.jpeg"));



                          //click on reset
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnReset']")).click();
Thread.sleep(19000);
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColourCreated"));
Select colourcreated =new Select(element);
colourcreated.selectByVisibleText("PUBLISHED");
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
Thread.sleep(13000);
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Viewcolours_published.jpeg"));
Thread.sleep(15000);
//System.out.println(webdriverclass.ff.findElement(By.xpath("//div[@class='dashboard_bg']/h1")).getText());
webdriverclass.ff.findElement(By.xpath("//a[text()='Add Colours']")).click();
explicitwait().until(ExpectedConditions.textToBePresentInElement(By.xpath("//div[@class='dashboard_bg']/h1"), "Add Colours"));
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Addcolourpage.jpeg"));
//firefoxdriverclass.ff.findElement(By.xpath("//img[@src='NPNImages/home.png']")).click(); 
}



                                          //TEST FOR MASTER MANAGEMENT
@SuppressWarnings("unchecked")
@Test(enabled=true, priority=10)
public void mastermanagement() throws IOException, InterruptedException{
	
	explicitwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a/div/ul/li[text()='Master Management']")));
	webdriverclass.ff.findElement(By.xpath("//a/div/ul/li[text()='Master Management']")).click();
	
	//country user verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage User ']")).click();
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/manageuser_Activecountryuser.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_rblStatus_1")).click();
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
    Thread.sleep(2000);
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/manageuser_Inactivecountryuser.jpeg"));
	//webdriverclass.ff.findElement(By.xpath("//input [@id='ctl00_ContentPlaceHolder1_btnBack']")).click();

	//Gcc user verification
		//explicitwait().until(ExpectedConditions.elementToBeClickable(By.name("ctl00$ContentPlaceHolder1$rdbSelectUserType")));
	Thread.sleep(6000);
		webdriverclass.ff.findElement(By.xpath("//input[@ id='ctl00_ContentPlaceHolder1_rdbSelectUserType_1']")).click();
		explicitwait().until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_gdvRegisterMaster'] /tbody/tr[2]/td[4]"), "GCC"));
		FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/manageuser_Gccuserr.jpeg"));
		webdriverclass.ff.findElement(By.xpath("//input [@id='ctl00_ContentPlaceHolder1_btnBack']")).click();
	
	//product verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage Products']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/allproducts.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();
	//Country verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage Country']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/allcountries.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();	
	
	
	//mobile notification verification
		webdriverclass.ff.findElement(By.xpath("//a[text()='Mobile Notification']")).click();
		explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
		FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/mobileNotification.jpeg"));
		webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();	
		
		
	//OEM verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage OEM']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/allOEM.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();		
	
	//Manage Component verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage Component']")).click();
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/allcomponent.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();		
	//Manage Model  verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage Model ']")).click();
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/allmodels.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();	

	//Manage Panel Source verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage Panel Source']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/ManagePanelSource.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();
	//Mob App Images verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Mob App Images']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/MobAppImages.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();	
	//Manage Colour Group verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Manage Colour Group']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/ManageColourGroup.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();		
	//Swatch Location verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Swatch Location']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/SwatchLocation.jpeg"));
	webdriverclass.ff.findElement(By.xpath("//div[@class='dashboard_bg']/div/a")).click();	
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	webdriverclass.ff.findElement(By.xpath("//li[text()='Master Management']")).click();

	
	//Nippon News Update  verification
	webdriverclass.ff.findElement(By.xpath("//a[text()='Nippon News Update']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/NipponNewsUpdate.jpeg"));
		
}



                        //TEST FOR USER REGISTRATION
@SuppressWarnings("unchecked")
@Test(enabled=true, priority=5 )
public void UserRegistration() throws IOException{	
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='User Registration']")));
	webdriverclass.ff.findElement(By.xpath("//li[text()='User Registration']")).click();
	webdriverclass.ff.findElement(By.xpath("//a[text()='Approve User']")).click();
	webdriverclass.ff.findElement(By.xpath("//a[text()='Activate User']")).click();
	webdriverclass.ff.findElement(By.xpath("//a[text()='User Creation By File']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='User Creation By File']")));
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/USERREGISTRATION.jpeg"));
	
}

                       //TEST FOR PRICING
@SuppressWarnings("unchecked")
@Test(enabled=true, priority=6)
public void PRICING() throws IOException, AWTException, InterruptedException{
	webdriverclass.ff.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_dvOuter']/a[7]")));	
	
webdriverclass.ff.findElement(By.xpath("//a/div/ul/li[text()='Manage Price']")).click();
FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/manageprice.jpeg"));


webdriverclass.ff.findElement(By.xpath("//a[text()='Transfer Price Update']")).click();
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();	


webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin master-margin1']/div/div/div[2]")).click();
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();	


/*
element=firefoxdriverclass.ff.findElement(By.xpath("//a[text()='Colour Price Report']"));
Actions act=new Actions(firefoxdriverclass.ff);
act.contextClick(element).perform();
act.sendKeys(Keys.ARROW_RIGHT).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();

*/
/*Thread.sleep(12000);
Set<String> WH=firefoxdriverclass.ff.getWindowHandles();
Iterator<String> IT=WH.iterator();
String parent=IT.next();
Set<String> WH1=firefoxdriverclass.ff.getWindowHandles();
Iterator<String> IT1=WH1.iterator();

String Child=IT1.next();

System.out.println(parent+""+Child);
firefoxdriverclass.ff.switchTo().window(Child).close(); */
}



                            //TEST FOR DATASHARE
@SuppressWarnings("unchecked")
@Test(enabled=true, priority=7)
public void datashare() throws IOException{
	
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[div[ul[li[text()='Data Share']]]]")));	
	webdriverclass.ff.findElement(By.xpath("//a/div/ul/li[text()='Data Share']")).click();
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Data_share.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_LinkButton1")).click();
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();
	webdriverclass.ff.findElement(By.xpath("//a[text()='Import from CI - Navigator']")).click();
	
	
}

                                //TEST FOR ADMIN DOWNLOAD
@SuppressWarnings({ "unchecked", "deprecation" })
@Test(enabled=true, priority=8)
public void Download() throws IOException, InterruptedException{
	
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Downloads']")));	

	webdriverclass.ff.findElement(By.xpath("//li[text()='Downloads']")).click();  
	explicitwait().until(ExpectedConditions.textToBePresentInElement(By.xpath("//div[@class='dashboard_bg']/h1"), "Downloads"));
	File src1= ((TakesScreenshot) webdriverclass.ff). getScreenshotAs(OutputType. FILE);
	FileUtils. copyFile(src1, new File("screeshots/admin/Admindownloads.jpeg")); 

/*	//click on mobile app
	webdriverclass.ff.findElement(By.linkText("Mobile App")).click(); 
	String tooltiptext= webdriverclass.ff.findElement(By.xpath("//img [@src='NPNImages/loginpage/android.png'] ")).getAttribute("title");
	String expected="Click here to download Paint Partner (Android) App"; 
//	System.out.println(tooltiptext);
	 Assert.assertEquals("failed to find tool tip", expected, tooltiptext);
	 webdriverclass.ff.findElement(By.linkText("X")).click();
	 
	 
	//click on documents
	 element=webdriverclass.ff.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkDocuments']"));
	 element.click();

	 //WebDriverWait wait=new WebDriverWait(firefoxdriverclass.ff, 10);
	 //wait.until(ExpectedConditions.elementToBeClickable(element));
	String tooltiptext1= webdriverclass.ff.findElement(By.xpath("//a[text()='Normal Request Format']")).getAttribute("title");
	String expected1="excel"; 
//	System.out.println(tooltiptext1);
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
act.sendKeys(Keys.ARROW_DOWN).perform();
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
		


//firefoxdriverclass.ff.close();
	
/*boolean actual=	 firefoxdriverclass.ff.findElement(By.xpath("//h1[contains(text(),'OffLineTool')]")).isDisplayed();
	boolean expected11=true;
	Assert.assertEquals("element not present", expected11, actual);
	firefoxdriverclass.ff.findElement(By.linkText("X")).click();	
	firefoxdriverclass.ff.close();*/
}
 
                                     //TEST FOR SYSTEM REPORT
@SuppressWarnings("unchecked")
@Test(enabled=true, priority=9)
public void systemreport() throws IOException{
	
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[div[ul[li[text()='Data Share']]]]")));	
	webdriverclass.ff.findElement(By.xpath("//a/div/ul/li[contains(text(),'System Report')]")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/systemreports.jpeg"));


	
	//TEST FOR FF
	webdriverclass.ff.findElement(By.xpath("//a[text()='Field Formulation']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/ff.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	
	//TEST FOR data statistics
	webdriverclass.ff.findElement(By.xpath("//a[text()='Data Statistics']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/DataStatistics.jpeg"));
	webdriverclass.ff.findElement(By.xpath("//a[text()='Panel Statistics']")).click();
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	webdriverclass.ff.findElement(By.xpath("//a[text()='Colour Statistics']")).click();
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	
	//TEST FOR  multistreamcolour
	webdriverclass.ff.findElement(By.xpath("//a[text()='Multi Stream Colours']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/MULTISTREAMCOLOUR.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	
	//TEST FOR  CCRVALUE
	webdriverclass.ff.findElement(By.xpath("//a[text()='CCR Value']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/CCRVALUE.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	
	//TEST FOR  COLOURSEARCHLOG
	webdriverclass.ff.findElement(By.xpath("//a[text()='Colour Search Log ']")).click();
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/Coloursearchlog.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	
	
	//TEST FOR LOGINHISTORY
	webdriverclass.ff.findElement(By.xpath("//a[text()='Login History ']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/LOGINHISTORY.jpeg"));
	webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();
	
	
	
	//TEST FOR SYNCLOG
	webdriverclass.ff.findElement(By.xpath("//a[text()='Sync Log']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/synclog.jpeg"));
	//webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();

	//-----------------------------------------------------------------------
	
	/*
	//TEST FOR REVERSEYNCLOG
	webdriverclass.ff.findElement(By.xpath("//a[text()='Reverse Sync Log']")).click();
	explicitwait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
	FileUtils.copyFile(takescreenshot(), new File("screeshots/admin/ReverseSyncLog.jpeg"));
	//firefoxdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click();  
*/
//-----------------------------------------------------------------
}


                                     //TEST FOR PROFILE 
@Test(enabled=true,priority=4 )
public void PROFILE	() throws IOException {

webdriverclass.ff.findElement(By.xpath("//div[@class='right_inf']/ul/li[4]")).click();
String actual=webdriverclass.ff.findElement(By.xpath("//div[ @class='dashboard_bg']/h1")).getText();
String expected="View/Update Profile Details";
Assert.assertEquals("failed to find Profile title", expected, actual);
webdriverclass.ff.findElement(By.linkText("Change Password")).click();
}

  @AfterTest
	public void closefirefox() throws IOException{
	   webdriverclass.ff.quit();
	   String executionstatus=readWER.getElementFromWER("Deployementtype", "config/config.properties");

	   if(executionstatus.equalsIgnoreCase("post")) {
			// Zipscreeshots.Ziptoscreens();
			// SendZipviaemail sendmail=new SendZipviaemail();
		System.out.println("Please wait, While Selelnium  sending zip file via mail...!!! ");
			// sendmail.Sendemail();
		 // System.out.println("Zip file sent successfully!!!!");
	   	}	   
	   System.out.println("Congratulation,Admin and CR Screenshoot taken  Successfully......!!!  ");	
 System.out.println("****************************************************************************************************");		   
	}
  
}

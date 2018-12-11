package com.xqt.framework;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.xqt.framework.readWER;
import com.xqt.framework.webdriverclass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PPDeployemetTesting {
	

public WebElement element=null;
public excellibrary lib=new excellibrary();
public Select streamdropdown=null;
public webdriverclass getdriver =new webdriverclass();
String streamm=null;
public String executionstatus=null;
public readWER wer=new readWER();
public static TeseExecutor te=new TeseExecutor();
public static int teststep=0;
public ExceptionhadlingClass Setcounttoexcel=new ExceptionhadlingClass();

@BeforeTest
public void openchromedriver() throws IOException{

getdriver.chromedriver();
 webdriverclass.ff.get(readWER.getElementFromWER("URL","config/config.properties"));
 webdriverclass.ff.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 webdriverclass.ff.manage().deleteAllCookies();
 webdriverclass.ff.findElement(By.name("txtUserName")).sendKeys(readWER.getElementFromWER("adminusername","config/config.properties"));
 webdriverclass.ff.findElement(By.name("txtPassword")).sendKeys(readWER.getElementFromWER("adminpassword","config/config.properties"));
webdriverclass.ff.findElement(By.name("btnLogin")).click();
 }
	


@BeforeMethod
public void go(){
}


@AfterMethod
public void gotohomepage(){
 webdriverclass.ff.findElement(By.xpath("//img[@src='NPNImages/home.png']")).click();	
}
	
/*

//test for colour search module
  @Test(enabled=true,priority=0)
  public void verifycolourcountColoursearchmodulle() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException  {
System.out.println("****************************************************************************************************");	
System.out.println("Please Wait,Executing Selenium Tescases to get counts from online paiant partner......!!!  ");	  
String screenname="Colour_Search";
 teststep=1;
String pathforCount=null;
WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 15); 
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  
element=webdriverclass.ff.findElement(By.xpath("//div [@class='dashboard_orange']"));

wait.until(ExpectedConditions.elementToBeClickable(element));
element.click();

//-------------------------------
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='spnRecordCount']")));
pathforCount="//div[@id='pnlPageindex']/table/tbody/tr/td[1]//span[@id='spnRecordCount']";
Setcounttoexcel.Setvaltoexcelwithexception(pathforCount, screenname, teststep++);
//----------------------------


element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
 streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX SUPERIO");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathforCount, screenname, teststep++);;

element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX PREMILA");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathforCount, screenname, teststep++);;

element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathforCount, screenname, teststep++);;

element=webdriverclass.ff.findElement(By.id("ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.cssSelector("input[id='btnColorSearch']")).click();
Thread.sleep(4000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathforCount, screenname, teststep++);;
}

  */
  
   // ****************************** //test for colour Request module**********************************************
@Test(enabled=true,priority=1)
public void verifycolourRequestCount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	 String screenname="Colour_Request";
	 teststep=1;
	 String pathtogetcolorrequestpageCount="//div[@id='ctl00_ContentPlaceHolder1_pnlPageindex']/table/tbody/tr/td/table//span[@id='ctl00_ContentPlaceHolder1_spnRecordCount']";
	 WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 15); 
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  
	element=webdriverclass.ff.findElement(By.xpath("//div [@class='dashboard_yellow']"));
    wait.until(ExpectedConditions.elementToBeClickable(element));
	element.click();	
	Setcounttoexcel.Setvaltoexcelwithexception(pathtogetcolorrequestpageCount, screenname, teststep++);;

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX SUPERIO");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSubmit']")).click();
Thread.sleep(7000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetcolorrequestpageCount, screenname, teststep++);;


element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX PREMILA");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSubmit']")).click();


Thread.sleep(8000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetcolorrequestpageCount, screenname, teststep++);;


element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSubmit']")).click();
Thread.sleep(6000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetcolorrequestpageCount, screenname, teststep++);;


element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlProdColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSubmit']")).click();
Thread.sleep(2000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetcolorrequestpageCount, screenname, teststep++);;




}
  
//****************************** //test for Manage Panel module**********************************************

@Test(enabled=true,priority=2)
public void verifyManagecPanelmodule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException   {
String  screenname="Manage_Panel";
String PathtogetManagepanelcount="//div[@id='ctl00_ContentPlaceHolder1_pnlPageindex']/table/tbody/tr/td/table//span[@id='ctl00_ContentPlaceHolder1_spnRecordCount']";
int teststep=1;
WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 15); 
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  
element=webdriverclass.ff.findElement(By.xpath("//li[text()='Manage Panel']"));
wait.until(ExpectedConditions.elementToBeClickable(element));
element.click();	
Setcounttoexcel.Setvaltoexcelwithexception(PathtogetManagepanelcount, screenname, teststep++);;
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_rdbPanelApprovalStatus_1")).click();
Thread.sleep(4000);
Setcounttoexcel.Setvaltoexcelwithexception(PathtogetManagepanelcount, screenname, teststep++);;

webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_lnkApprovePanels")).click();
Thread.sleep(3000);
Setcounttoexcel.Setvaltoexcelwithexception(PathtogetManagepanelcount, screenname, teststep++);;



}


//****************************** //test for Manage Colour module**********************************************

@Test(enabled=true,priority=3)
public void verifyManagecolourmodule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
teststep=1;
String screenname="Manage_Colour";
WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 15); 
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  


element=webdriverclass.ff.findElement(By.xpath("//div [@class='dashboard_red']"));
wait.until(ExpectedConditions.elementToBeClickable(element));
element.click();

//******************test for Manage Colour>view colours module***********************
String pathtogetviewcolourpagecount="//div[@id='ctl00_ContentPlaceHolder1_pnlPageindex']/table/tbody/tr/td[1]//span[@id='ctl00_ContentPlaceHolder1_spnRecordCount']";

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_pnlPageindex']/table/tbody/tr/td[1]//span[@id='ctl00_ContentPlaceHolder1_spnRecordCount']")));
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetviewcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
 streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX SUPERIO");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetviewcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX PREMILA");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetviewcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetviewcolourpagecount, screenname, teststep++);


element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetviewcolourpagecount, screenname, teststep++);

webdriverclass.ff.findElement(By.name("ctl00$ContentPlaceHolder1$btnReset")).click();
Thread.sleep(15000);
element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColourCreated"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("PUBLISHED");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetviewcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColourCreated"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("UNPUBLISHED");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetviewcolourpagecount, screenname, teststep++);



//******************test for Manage Colour>Add colours module***********************
String pathtogetAddcolourpagecount="//div[@id='ctl00_ContentPlaceHolder1_pnlPageindex']/table/tbody/tr/td[1]//span[@id='ctl00_ContentPlaceHolder1_spnRecordCount']";
webdriverclass.ff.findElement(By.xpath("//div[@class='view_req']/a[2]")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetAddcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX SUPERIO");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetAddcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX PREMILA");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(4000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetAddcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(8000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetAddcolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(4000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetAddcolourpagecount, screenname, teststep++);



//******************test for Manage Colour>Approve Colours module***********************
String pathtogetApprovecolourpagecount="//div[@id='ctl00_ContentPlaceHolder1_pnlPageindex']/table/tbody/tr/td[1]//span[@id='ctl00_ContentPlaceHolder1_spnRecordCount']";
webdriverclass.ff.findElement(By.xpath("//div[@class='view_req']/a[3]")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetApprovecolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX Superio");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(3000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetApprovecolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX Premila");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(3000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetApprovecolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(3000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetApprovecolourpagecount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(3000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetApprovecolourpagecount, screenname, teststep++);

}




//****************************** //test for master management module**********************************************

@Test(enabled=true,priority=4)
public void verifymastermanagementmodule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
String screenname="Master_Management";
 teststep=1;
String pathtogetmastermagmtcount="//div[@id='ctl00_ContentPlaceHolder1_pnlPageindex']/table/tbody/tr/td//span[@id='ctl00_ContentPlaceHolder1_spnRecordCount']";
WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 15); 
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  
element=webdriverclass.ff.findElement(By.xpath("//div [@class='dashboard_magenta']"));
wait.until(ExpectedConditions.elementToBeClickable(element));
element.click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));

 //*****************MANAGE USER--country user*******************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div/div[1]")).click();
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_rblStatus_1")).click();
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
Thread.sleep(12000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);

//*****************MANAGE USER--GCC user*************************
webdriverclass.ff.findElement(By.name("ctl00$ContentPlaceHolder1$btnReset")).click();
Thread.sleep(8000);


webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_rdbSelectUserType_1")).click();
Thread.sleep(12000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_rblStatus_1")).click();
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
Thread.sleep(6000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();

//*****************MANAGE product******************************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div/div[2]")).click();
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();

//*****************MANAGE COUNTRY******************************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div/div[3]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();

//*****************MANAGE OEM******************************

webdriverclass.ff.findElement(By.linkText("Manage OEM")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();

//*****************MANAGE COMPONENT******************************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div/div[6]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX Superio");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(3000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX Premila");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(3000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);

element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("NAX E3 WB");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(3000);;
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);


element=webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColorStream"));
streamdropdown=new Select(element);
streamdropdown.selectByVisibleText("RADIANT");
webdriverclass.ff.findElement(By.cssSelector("input[id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
Thread.sleep(2000);
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();


//*****************MANAGE PANEL-SOURCE******************************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div/div[7]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();

//*****************MANAGE MODEL******************************

webdriverclass.ff.findElement(By.linkText("Manage Model")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnBack")).click();

//*****************MANAGE COLOUR-GROUP******************************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div/div[10]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
Setcounttoexcel.Setvaltoexcelwithexception(pathtogetmastermagmtcount, screenname, teststep++);

}

//****************************** //test for system Report module**********************************************

/*@Test(enabled=true,priority=5)
public void verifyReportsmodulle() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
String screenname="System_Reports";
int teststep=0;
WebDriverWait wait=new WebDriverWait(webdriverclass.ff, 15); 
//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));  
element=webdriverclass.ff.findElement(By.xpath("//div [@class='dashboard_redish']"));
wait.until(ExpectedConditions.elementToBeClickable(element));
element.click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));

//*****************panel statistics*******************************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div/div[2]")).click();
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div//a[text()='Panel Statistics']")).click();
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
String Totalpanelcount=webdriverclass.ff.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_gvPanel']/tbody/tr/td[1]")).getText();
String Approvedpanelcount=webdriverclass.ff.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_gvPanel']/tbody/tr/td[2]")).getText();
String pendingpanelcount=webdriverclass.ff.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_gvPanel']/tbody/tr/td[3]")).getText();
System.out.println(Totalpanelcount);
teststep++;
te.SetCounttoExcel(teststep,screenname,Totalpanelcount);
teststep++;
te.SetCounttoExcel(teststep,screenname,Approvedpanelcount);
teststep++;
te.SetCounttoExcel(teststep,screenname,pendingpanelcount);
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1")).click(); 

//*****************Colour statistics******************************

webdriverclass.ff.findElement(By.xpath("//div[@class='dashbaord_content master-margin']/div/div//a[text()='Colour Statistics']")).click();
webdriverclass.ff.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
String Totalcolourcount=webdriverclass.ff.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_gvColor']/tbody/tr/td[1]")).getText();
String Approvedcolourcount=webdriverclass.ff.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_gvColor']/tbody/tr/td[2]")).getText();
String pendingcolourcount=webdriverclass.ff.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_gvColor']/tbody/tr/td[3]")).getText();
System.out.println(Totalcolourcount);
teststep++;
te.SetCounttoExcel(teststep,screenname,Totalcolourcount);
teststep++;
te.SetCounttoExcel(teststep,screenname,Approvedcolourcount);
teststep++;
te.SetCounttoExcel(teststep,screenname,pendingcolourcount);

} */

@AfterTest
public void closefirefox() throws IOException{
	 executionstatus=readWER.getElementFromWER("Deployementtype", "config/config.properties");

if(executionstatus.equalsIgnoreCase("post")) {
	//SendEmail sendmail=new SendEmail();
	//sendmail.SendReportVIAemail();
	}

webdriverclass.ff.close();
System.out.println("Congratulation, Testcases to get counts Executed Successfully......!!!  ");	
System.out.println("****************************************************************************************************");	
}
}

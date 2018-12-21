package com.xqt.group1.practise;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test {
	
public WebDriver ff=new ChromeDriver();
	
  @Test
  public void f() throws IOException, InterruptedException {
  
	  WebElement element=null;
	  
	
ff.get("http://1.22.119.233:9999/Admin/Login.aspx");
ff.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	ff.manage().deleteAllCookies();
	 ff.findElement(By.name("txtUserName")).sendKeys("PPADMIN");
	 ff.findElement(By.name("txtPassword")).sendKeys("123456");
	ff.findElement(By.name("btnLogin")).click();
	

		  WebDriverWait wait=new WebDriverWait(ff, 20);
		
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard_bg']/h1")));
		element=ff.findElement(By.xpath("//div [@class='dashboard_orange']"));
		element.click();
java.util.List<WebElement> list= ff.findElements(By.xpath("//div[@id='updSearch']/table/tbody/tr/td/label"));

System.out.println(list.size());

element=ff.findElement(By.name("ddlProdColorStream"));

Select sel=new Select(element);
sel.selectByVisibleText("NAX E3 WB");


ff.findElement(By.name("btnColorSearch")).click();

Thread.sleep(2000);
ff.findElement(By.name("btnLast")).click();

System.out.println("text is "+ff.findElement(By.name("btnLast")).isEnabled());

Thread.sleep(3000);
ff.findElement(By.name("btnFirst")).click();

System.out.println("text is "+ff.findElement(By.name("btnLast")).isEnabled());


//ff.findElement(By.name("txtColorCode")).sendKeys("aaaa");




  }
  
  
}

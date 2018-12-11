package com.xqt.framework;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class TeseExecutor {

	
	public excellibrary lib=new excellibrary();
	public static readWER wer=new readWER();
	public int countpost=0;
	public int countpre=0;
	public  String executionstatus=null;
public void SetCounttoExcel(int teststep,String screenname,String totalcourcount) throws IOException, EncryptedDocumentException, InvalidFormatException{
	
 executionstatus=readWER.getElementFromWER("Deployementtype", "config/config.properties");
	
	if(executionstatus.equalsIgnoreCase("pre")){
    lib.setExcelValue(screenname, teststep, 2, totalcourcount);
    teststep++;
  lib.setExcelValue(screenname, teststep, 2, lib.getdateandtime());

	}
	else if(executionstatus.equalsIgnoreCase("post")){
		lib.setExcelValue(screenname, teststep, 3, totalcourcount);
		countpost=lib.getExcelValueInt(screenname, teststep, 3);
	    countpre=lib.getExcelValueInt(screenname, teststep, 2);
		    
        int actualcount=countpre-countpost;
	 lib.setExcelValueInt(screenname, teststep, 4, actualcount);
   
	  teststep++;
	  lib.setExcelValue(screenname, teststep, 3, lib.getdateandtime());

	}

}




	
	
	
	
}

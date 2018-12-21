package com.xqt.group1.PaintPartner;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;

import com.xqt.datadrivenframework.Testexecutor;

public class ColourRequestCR {


@Test
public void testColourrequest_CR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException   {
Testexecutor te=new Testexecutor();
te.executetest(this.getClass().getSimpleName());
	
	}

	
}

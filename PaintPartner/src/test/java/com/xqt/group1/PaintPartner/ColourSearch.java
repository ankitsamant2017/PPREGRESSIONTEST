package com.xqt.group1.PaintPartner;

import org.testng.annotations.Test;

import com.xqt.datadrivenframework.Testexecutor;

import junit.framework.TestCase;

public class ColourSearch extends TestCase {

	@SuppressWarnings("static-access")
	@Test(priority=2)
	public void testColourSearch() throws Exception {

		Testexecutor te=new Testexecutor();
		te.executetest(this.getClass().getSimpleName());
	
	}


	
	
	
}

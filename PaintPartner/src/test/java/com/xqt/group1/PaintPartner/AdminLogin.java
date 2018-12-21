package com.xqt.group1.PaintPartner;

import org.testng.annotations.Test;

import com.xqt.datadrivenframework.Testexecutor;

import junit.framework.TestCase;

public class AdminLogin extends TestCase {

	//@Test(priority=1)
	public void testlogin() throws Exception {

		Testexecutor te=new Testexecutor();
		te.executetest(this.getClass().getSimpleName());
	
	}


	
	
	
}

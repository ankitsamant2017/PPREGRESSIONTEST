package com.xqt.group1.PaintPartner;

import com.xqt.datadrivenframework.Testexecutor;

import junit.framework.TestCase;

public class Login extends TestCase {

	@SuppressWarnings("static-access")
	public void testlogin() throws Exception {

		Testexecutor te=new Testexecutor();
		te.executetest(this.getClass().getSimpleName());
	
	}


	
	
	
}

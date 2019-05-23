package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertsDemo {

	
	@Test
	public void login()
	{
		System.out.println("start");
		SoftAssert sa  = new SoftAssert();
		int a =5,b=5;
		sa.assertEquals(15, (a+b));
		sa.assertEquals(14, (a+b));
		sa.assertEquals(13, (a+b));
		sa.assertEquals(10, (a+b));
		
		System.out.println("End");
		
		sa.assertAll();
	}
	
	
}

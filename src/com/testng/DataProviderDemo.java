package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	
	@DataProvider
	  public Object[][] testdata() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	      new Object[] { 3, "b" },
	      new Object[] { 4, "b" },
	    };
	  }
	
	
	@Test(dataProvider = "testdata")
	public void testDP(int x,String s)
	{
		System.out.println("Test" + x +" and " + s);
	}
	
	
	
	
	
	
	
	
	
}

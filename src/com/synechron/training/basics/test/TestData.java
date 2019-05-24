package com.synechron.training.basics.test;

import org.testng.annotations.DataProvider;

public class TestData {

	

	@DataProvider
	  public Object[][] customerdata() {
	    return new Object[][] {
	      new Object[] {"May20_TestNGCustomer1","CustomerDesc" },
	      new Object[] {"May20_TestNGCustomer2","CustomerDesc" },
	      new Object[] {"May20_TestNGCustomer3","CustomerDesc" },
	      new Object[] {"May20_TestNGCustomer4","CustomerDesc" },
	    };
	  }
	
	@DataProvider
	  public Object[][] projectdata() {
	    return new Object[][] {
	      new Object[] { "May20_TestNGCustomer1", "Project1", "PorjcecDesc" },
	      new Object[] { "May20_TestNGCustomer1", "Project2", "PorjcecDesc" },
	      new Object[] { "May20_TestNGCustomer2", "Project3", "PorjcecDesc" },
	      new Object[] { "May20_TestNGCustomer2", "Project4", "PorjcecDesc" },
	    };
	  }
}

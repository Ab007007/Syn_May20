package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelloWorldTestNG {
  
	@Test
	  public void launch() {
		  Reporter.log("Launch Test<br>");
	  }
	
	@Test(dependsOnMethods = "launch")
	  public void login() {
		  Reporter.log("Login Test<br>");
	  }
	
	@Test(dependsOnMethods = "login")
	  public void createCutomer() {
		  Reporter.log("Create customer <br>");
	  }
	
	@Test(dependsOnMethods = {"login","createCutomer"})
	  public void logout() {
		  Reporter.log("Logout <br>");
	  }
}

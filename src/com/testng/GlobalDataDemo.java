package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GlobalDataDemo {

	
	
	@Parameters({"url"})
	@Test
	public void launch(String url)
	{
		System.out.println(url);
	}

	@Parameters({"username","password"})
	@Test
	public void login(String un,String pwd)
	{
		
		System.out.println(un + "--" + pwd);
	}



}


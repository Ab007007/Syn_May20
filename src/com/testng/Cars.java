package com.testng;

import org.testng.annotations.Test;

public class Cars {

	@Test(groups = {"cars","mahendra"})
	public void xuv500() {
		System.out.println("xuv");
	}

	@Test(groups = {"cars","mahendra"})
	public void tuv() {
		System.out.println("tuv");
	}

	@Test(groups = "maruthi")
	public void swift() {
		System.out.println("swift");
	}

	@Test(groups = "maruthi")
	public void breeza() {
		System.out.println("breeza");
	}

	@Test(groups = "honda")
	public void hondaCity() {
		System.out.println("honda city");
	}

	@Test(groups = "honda")
	public void hondaCivic() {
		System.out.println("honda civic");
	}

}

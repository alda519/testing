package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Base {

	public Base() {
		
	}

	@Test(description="")
	public void test_alfa() {
		Assert.assertTrue(true, "Check alfa 1/1");
	}
	
	@Test(description="")
	public void test_beta() {
		Assert.assertTrue(true, "Check beta 1/1");
	}
	
	@Test(description="")
	public void test_gama() {
		Assert.assertTrue(true, "Check gama 1/2");
		Assert.assertTrue(false, "Check gama 2/2");
	}
}

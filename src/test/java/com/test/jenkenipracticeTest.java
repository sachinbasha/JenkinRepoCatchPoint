package com.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkenipracticeTest {
	@Test
	public void aTest() {
		System.getProperties();
	}
	
	@Test(groups="smoke")
	public void aTest1() {
		Reporter.log("ok iam smoke",true);
	}
	
	@Test(groups="smoke")
	public void aTest2() {
		Reporter.log("ok iam smoke 2",true);
	}
	@Test(groups="regression")
	public void aTest3() {
		Reporter.log("ok iam regression 2",true);
	}
	
	
}

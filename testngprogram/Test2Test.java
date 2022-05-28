package com.testngprogram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2Test {

	@BeforeClass
	public void bfrcls() {
		System.out.println("Open browser");
	}
	@BeforeMethod
	public void bfrmtd() {
		
		System.out.println("Login to application");
	}
	@Test
	public void GTestmethod1Test() {
		System.out.println("Testcase1");
	}
	@Test
	public void Testmethod2Test() {
		System.out.println("Testcase2");
	}
	@AfterMethod
	public void aftmtd() {
		System.out.println("Logout");
	}
	@AfterClass
	public void aftcls() {
		System.out.println("close browser");
	}
	
}

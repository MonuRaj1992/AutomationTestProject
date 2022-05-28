package com.testngprogram;

import org.testng.annotations.Test;

public class Group2 {
	
		@Test(groups = "Regression")
		public void Group2method1() {
			System.out.println("Group Method1 in TestNg1");
		}
		@Test(groups = "Smoke")
		public void Group2method2() {
			System.out.println("Group Method2 in TestNg2");
		}
		@Test(groups = "Regression")
		public void Group2method3() {
			System.out.println("Group Method3 in TestNg3");
		}
	
}

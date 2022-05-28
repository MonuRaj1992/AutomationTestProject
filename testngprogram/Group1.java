package com.testngprogram;

import org.testng.annotations.Test;

public class Group1 {
@Test(groups = "Smoke")
public void Groupmethod1() {
	System.out.println("Group Method1 in TestNg");
}
@Test(groups = "Regression")
public void Groupmethod2() {
	System.out.println("Group Method2 in TestNg");
}
@Test(groups = "Smoke")
public void Groupmethod3() {
	System.out.println("Group Method3 in TestNg");
}
}

package com.testngprogram;

import org.testng.annotations.Test;

public class TestDemo {
@Test(invocationCount = 10)
public void DemoTest() {
	System.out.println("Demo Test");
}
}

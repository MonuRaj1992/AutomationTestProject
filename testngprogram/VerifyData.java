package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyData {
	@Test
	public void verifytext() {
		String Expectedtext="Facebook helps you connect and share with the people in your life";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	String Actualtext=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
    //Soft Assert  
	SoftAssert as=new SoftAssert();
	as.assertEquals(Expectedtext, Actualtext,"Result doesn't match");
	as.assertTrue(false);
	as.assertTrue(true);
	as.assertEquals(11, 15,"Number doesn't match");
	as.assertAll();
	//Hard Assert
	//Assert.assertEquals(Expectedtext,Actualtext,"Result doesn't matched");
  System.out.println("Testcase Ended-----");
  
	}}

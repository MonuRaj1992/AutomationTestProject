package com.testngprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel2 {
@Test
public void parallelTest1() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.bbc.com/");
	List<WebElement> lst=driver.findElements(By.xpath("//a"));
	int linkcount=lst.size();
	System.out.println("Link="+linkcount);
}
}

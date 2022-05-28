package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void ParallelTest1() {
	String Expectedtext="Facebook helps you connect and share with the people in your life";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	String Actualtext=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();

}
}

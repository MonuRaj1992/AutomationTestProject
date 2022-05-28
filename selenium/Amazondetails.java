package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazondetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MILLISECONDS);
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hmh5l8jr5_e&adgrpid=61764313147&hvpone=&hvptwo=&hvadid=486381533661&hvpos=&hvnetw=g&hvrand=144705140873104777&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299565&hvtargid=kwd-327061083&hydadcr=14455_2154377&gclid=CjwKCAjwx46TBhBhEiwArA_DjBM85l9ypHZRRGkpBmnT0937Jtgy2WMzKxDLBBqe0hsxcLFmIMhaShoChDMQAvD_BwE");
        driver.findElement(By.linkText("Start here.")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("Deepesh Raj");
        driver.findElement(By.id("ap_phone_number")).sendKeys("9964769927");
        driver.findElement(By.id("ap_email")).sendKeys("deepeshrajprofa@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("Abcde@1234");
        driver.findElement(By.id("continue")).click();
	}

}

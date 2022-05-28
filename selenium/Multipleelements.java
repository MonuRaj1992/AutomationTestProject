package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multipleelements {

	public static void main(String[] args) {
		int no_of_links=219;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		List<WebElement> lst=driver.findElements(By.xpath("//a"));
		int linkcount=lst.size();
		System.out.println("Link="+linkcount);
		if(no_of_links==linkcount)
        {
       	 System.out.println("link verified==pass");
        }else {
       	 System.out.println("link not verified==fail");
        }
         for(int i=0;i<lst.size();i++)
         {
        	String linktext= lst.get(i).getText();
                System.out.println(linktext);
         }
        
         
	}

}

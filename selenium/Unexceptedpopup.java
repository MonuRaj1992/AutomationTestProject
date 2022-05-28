package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unexceptedpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_MakeMyTrip_Variants|Brand-Variants-Exact|ETA|Offer4|289629305711&s_kwcid=AL!1631!3!289629305711!e!!g!!make%20my%20trip-&ef_id=EAIaIQobChMI8-y4vvCL9wIVb5JmAh0nagNsEAAYASAAEgIxI_D_BwE:G:s&gclid=EAIaIQobChMI8-y4vvCL9wIVb5JmAh0nagNsEAAYASAAEgIxI_D_BwE");
        try {    
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
        }catch(Exception e) {
        	System.out.println("Pop is not displaying");
        
        }
        
        
        
        
        
        
        
        
        
	}

}

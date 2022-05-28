package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel3 {
@Test
public void ParallelTest3() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_MakeMyTrip_Variants|Brand-Variants-Exact|ETA|Offer4|289629305711&s_kwcid=AL!1631!3!289629305711!e!!g!!make%20my%20trip-&ef_id=EAIaIQobChMI8-y4vvCL9wIVb5JmAh0nagNsEAAYASAAEgIxI_D_BwE:G:s&gclid=EAIaIQobChMI8-y4vvCL9wIVb5JmAh0nagNsEAAYASAAEgIxI_D_BwE");
	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
     driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal']")).click();
    driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
//driver.findElement(By.xpath("//label[@for='toCity']/span[@class='lbl_input latoBold  appendBottom5']")).click();
/*
 * Thread.sleep(6000); driver.findElement(By.id("toCity")).sendKeys("bhuba");
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//p[contains(text(),'Bhubaneswar')]")).click();
 */
    Thread.sleep(6000);
    int n=1;
    while(n<12) {
   try {
    driver.findElement(By.xpath("//div[@aria-label='Tue Aug 16 2022']")).click();
    break;
   
   }catch(Exception e)
   {
	   driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
   }
   }

}
}

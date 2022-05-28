package com.testngprogram;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Uploadfile {
@Test
public void uploadafileTest() throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.MILLISECONDS);
	driver.get("https://www.grammarly.com/plagiarism-checker");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit. SECONDS);// for Implicit wait
	 
	    JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
	    js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
	    Thread.sleep(2000); // suspending
	    WebElement browse = driver.findElement(By.xpath("//div[text()='Upload a file']"));
	     // using linkText, to click on browse element 
	    browse.click(); // Click on browse option on the webpage
	    Thread.sleep(2000); // suspending execution for specified time period
	 // creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("F:\\Programs.txt");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	   }
           


}

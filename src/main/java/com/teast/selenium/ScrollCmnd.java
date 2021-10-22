package com.teast.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollCmnd {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   //driver.get("https://freecrm.com/");
		   driver.navigate().to("https://freecrm.com/");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		   
		   /* JavascriptExecutor js = (JavascriptExecutor)driver;
		   for(int i = 1;i<10; i++) {			   		  
		   js.executeScript("window.scrollBy(0,300)");		   	  
		   Thread.sleep(2000);
		   }
		   for(int i = 1;i<10; i++) {			   		  
			   js.executeScript("window.scrollBy(0,-300)");		   	  
			   Thread.sleep(2000);
			   } 
		   
		   WebElement Element = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView()", Element);  
		   
		   WebElement Element = driver.findElement(By.xpath("//span[text()='Log In']"));
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click()", Element);  */
		   
		   
		   TakesScreenshot ts = (TakesScreenshot)driver;
		   File file = ts.getScreenshotAs(OutputType.FILE);
		   FileHandler.copy(file, new File("C:/javapractice/Selenium1/target"+"/FreeCRM.png"));
		   
		   
		   
		   Thread.sleep(3000);
		   driver.quit();

	}

}

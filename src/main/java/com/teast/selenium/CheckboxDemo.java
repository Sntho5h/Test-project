package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		  WebElement check =  driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		   if(!check.isSelected())
		   {
			   check.click();
			   Thread.sleep(1000);
			   String S = driver.findElement(By.xpath("//div[@id='txtAge']")).getText();
			   if(S.equals("Success - Check box is checked"))
			   {
				   System.out.println("Test Case is pass");
			   }
			   else
			   {
				   System.out.println("Test case is fail");
			   }				   
		   }
		   else
		   {
			   System.out.println("Check Box is already clicked....Test case is fail");
		   }		   		   		   		   		  	   
		   Thread.sleep(5000);
		   driver.quit();																												
	}
}
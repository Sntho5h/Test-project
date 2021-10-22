package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		
		 /*  driver.findElement(By.xpath("//div[@class='input-group date']/span")).click();
		   String month = "October 2020";
		   String Date = "5";
		   while(true)
		   {
			  String cal = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).getText();
			  if(month.equals(cal))
			  {
				  break;
			  }
			  else
			  {
				  Thread.sleep(500);
				  driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[1]")).click();
			  }
		   }
		   driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr[2]/td[text()="+Date+"]")).click();
		   
		   Thread.sleep(3000); */
		   
		 
		   driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("05/10/2020");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@placeholder='End date']")).sendKeys("05/10/2021");
		   
		   Thread.sleep(400);
		  // driver.quit();
		   
	}

}

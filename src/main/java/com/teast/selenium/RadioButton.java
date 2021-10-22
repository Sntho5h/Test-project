package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
           WebElement button1 = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
           WebElement button2 = driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']"));
		   if(!(button1.isSelected() && button2.isSelected()))
		   {
			   button1.click();
			   //button2.click();
			   driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
			   String S = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
			   if(S.equals("Radio button 'Male' is checked"))
			   {
				   System.out.println("Test case 1 is pass");
			   }
			   else
			   {
				   System.out.println("Test case 1 is fail");
			   }
		   }
		   else
		   {
			 System.out.println("Button Already Clicked.....test case 1 is fail");  
		   }
		   
		   	
		   
		   
           WebElement button3 = driver.findElement(By.xpath("//input[@name='gender' and @value='Male']"));
           WebElement button4 = driver.findElement(By.xpath("//input[@name='gender' and @value='Female']")); 
           if(!(button3.isSelected() && button4.isSelected()))
           {
        	   button3.click();
        	   //button4.click();
			   driver.findElement(By.xpath("//input[@value='0 - 5']")).click();
			   //driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
			   //driver.findElement(By.xpath("//input[@value='15 - 50']")).click();
			   driver.findElement(By.xpath("//button[@onclick='getValues();']")).click();
			   String S1 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
			   if(S1.equals("Sex : Male\r\n" + 
			   		"Age group: 0 - 5"))
			   {
				   System.out.println("Test Case 2 is pass");
			   }
			   else
			   {
				   System.out.println("Test case 2 is fail");				
			   }			   
           }
           else
		   {
			 System.out.println("Button Already Clicked.....test case 2 is fail");  
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   Thread.sleep(4000);
		   driver.quit();		   		   		   		   
	}

}

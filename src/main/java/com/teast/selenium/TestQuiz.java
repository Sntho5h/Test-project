package com.teast.selenium;

import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestQuiz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");

		ChromeOptions abc = new ChromeOptions();
		
		abc.setAcceptInsecureCerts(true);
		
        WebDriver driver = new ChromeDriver(abc);
        
        driver.get("https://www.testandquiz.com/");
        
        Thread.sleep(3000);
        
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=' Sign Up']")).click();
        Thread.sleep(2000);
      	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Santhosh");	      
      	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kumar");      
      	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Santhosh@5");
      	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("Santhoshpamidi@gmail.com");
      	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("San@1234");
      	driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("San@1234");
      	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vizag");
      	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Andhra");
      	driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
      	driver.findElement(By.xpath("//input[@id='pin_code']")).sendKeys("530027");
      	driver.findElement(By.xpath("//input[@id='contact_no']")).sendKeys("9966887755");
      	Thread.sleep(1000);
      	driver.findElement(By.xpath("//button[@type='submit']")).click();
      	
      	
	}

}

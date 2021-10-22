package com.teast.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");

		
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        
        Thread.sleep(3000);
        
        driver.manage().window().maximize();        
        Thread.sleep(3000);     
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(3000);    
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("WELCOME");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        Thread.sleep(3000);
        String A = "10";
        String B = "20";
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys(A);
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys(B);
        driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
        Thread.sleep(1000);
        String C = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        
        
        if(C.equals("30"))
        {
        	System.out.println("pass");
        }
        else {
        	System.out.println("Fail");
        }
        
        List<WebElement> list = driver.findElements(By.xpath("//a"));
        
        System.out.println("Total links = "+ list.size());
        //for(WebElement i:list)
        //{
        //	System.out.println(i.getText());
        //}
        
        List<WebElement> btn = driver.findElements(By.xpath("//button"));
        System.out.println("Total buttons=" + btn.size());
        
	}

}

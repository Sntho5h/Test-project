package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/alerts");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		   
		   /*driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		   Thread.sleep(2000);
		   driver.switchTo().alert().accept();
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		   Thread.sleep(6000);
		   driver.switchTo().alert().accept();
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		   Thread.sleep(2000);
		   String S = driver.switchTo().alert().getText();
		   System.out.println(S);
		   driver.switchTo().alert().dismiss();
		   Thread.sleep(3000); */
		   
		   driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		   Thread.sleep(2000);
		   driver.switchTo().alert().sendKeys("Java and Selenium");
		   Thread.sleep(2000);
		   driver.switchTo().alert().accept();
		   Thread.sleep(3000);
		   
		   
		   driver.quit();

	}

}

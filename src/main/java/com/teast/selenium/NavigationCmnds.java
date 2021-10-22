package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCmnds {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   //driver.get("https://freecrm.com/");
		   driver.navigate().to("https://freecrm.com/");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
           driver.findElement(By.xpath("//span[text()='Log In']")).click();
           Thread.sleep(3000);
           driver.navigate().back();
           Thread.sleep(3000);
           driver.navigate().forward();
           Thread.sleep(3000);
           driver.navigate().refresh();
           Thread.sleep(5000);
           driver.quit();
	}

}

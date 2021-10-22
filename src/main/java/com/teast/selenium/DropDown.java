package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
			   WebDriver driver = new ChromeDriver();
			   driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			   Thread.sleep(3000);
			   driver.manage().window().maximize();	
			   Thread.sleep(3000);
			Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
			dropdown.selectByIndex(2);
			//dropdown.selectByValue("Wednesday");
			//dropdown.selectByVisibleText("Friday");
			String S = driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
		if(S.equals("Day selected :- Monday"))
		{
			System.out.println("Test Case 1 is pass");
		}
		else
		{
			System.out.println("Test case 1 is fail");
		}
		
		driver.findElement(By.xpath("//option[@value='California']")).click();
		driver.findElement(By.xpath("//option[@value='New Jersey']")).click();
		driver.findElement(By.xpath("//option[@value='Texas']")).click();
		
		driver.findElement(By.xpath("//button[@value='Print All']")).click();
		
			Thread.sleep(10000);
			driver.quit();
		
	}

}

package com.teast.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://freecrm.com/");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		   
		   WebElement A = driver.findElement(By.xpath("//a[text()='Free CRM']"));
		   Actions actns = new Actions(driver);
		   actns.moveToElement(A).build().perform();
		 //a[text()='Free CRM']/parent::li/child::ul/li
		   List<WebElement> Dropdown = driver.findElements(By.xpath("//a[text()='Free CRM']/parent::li/child::ul/li"));
		   
		   for(int i= 0;i<Dropdown.size();i++)
		   {
			   String S = Dropdown.get(i).getText();
			 // System.out.println(S);
			   Thread.sleep(1000);
			   if(S.equals("Real Estate CRM"))
			   {
				   Thread.sleep(500);
				   Dropdown.get(i).click();
				   break;
			   }
		   }
		   Thread.sleep(3000);
		   driver.quit();
	}

}

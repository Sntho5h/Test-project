package com.teast.selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple");
		   Thread.sleep(3000);
		   List<WebElement> Dropdown = driver.findElements(By.xpath("//div[@id='suggestions']/div[@class='s-suggestion']"));
		   System.out.println(Dropdown.size());
		   for(int i= 0;i<Dropdown.size();i++)
		   {
			   String S = Dropdown.get(i).getText();
			   System.out.println(S);
			  
			   Thread.sleep(1000);
			   if(S.equals("apple adapter"))
			   {
				   Thread.sleep(500);
				   Dropdown.get(i).click();
				   break;
			   }
		   }
		   Thread.sleep(10000);
		   driver.quit();
	}

}

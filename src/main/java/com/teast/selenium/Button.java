package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/buttons");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		   
		   WebElement Button1 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		   WebElement Button2 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		  // WebElement Button3 = driver.findElement(By.xpath("//button[@id='vEY0D']"));

		   
		   Actions actions = new Actions(driver);
		   
		   actions.moveToElement(Button1)
		   .doubleClick()
		   .build()
		   .perform();
		   Thread.sleep(1000);
		   
		   actions.moveToElement(Button2)
		   .contextClick()
		   .build()
		   .perform();
		   Thread.sleep(1000);
		   
		   /*actions.moveToElement(Button3)
		   .click()
		   .build()
		   .perform();
		   Thread.sleep(5000); */
		   
		   
		   
		   
		   
		   driver.quit();
		   
		   
		   

	}

}

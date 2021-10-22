package com.teast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/droppable");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		   
		   WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		   WebElement Target = driver.findElement(By.xpath("//div[@class='tab-content']/div[1]/div/div[2]"));
		   
		   Actions actions = new Actions(driver);
		   
		  // actions.clickAndHold(Source).moveToElement(Target).release().build().perform();
		   actions.dragAndDrop(Source, Target).build().perform();
		   
		   Thread.sleep(3000);
		   driver.quit();

	}

}

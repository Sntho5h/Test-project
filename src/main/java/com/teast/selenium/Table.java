package com.teast.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\Documents\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/stats");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();	
		   Thread.sleep(3000);
		   List<WebElement> clist = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']/thead/tr/th"));
		   int column = clist.size();
		   List<WebElement> rlist = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']/tbody/tr"));
		   int row = rlist.size();
		   for(int i = 1;i<=row;i++) {
			   for(int j=1;j<=column;j++) {
				 //table[@class='table table-responsive cb-series-stats']/tbody/tr[1]/td[1]
				String S = driver.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(S+"   ");
				Thread.sleep(100);
			   }
			   System.out.println();
		   }
		   Thread.sleep(3000);
           driver.quit();
	}

}

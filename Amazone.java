package com.mintree.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//System.out.println(driver.getTitle());
		
		//driver.get("http://www.yahoo.com");
		
		//driver.navigate().back();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("refrigerator");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		System.out.print(driver.findElement(By.xpath("//span[contains(text(),'Samsung 192 L 2')]")).getText());
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Samsung 192 L 2')]")).click();
		
	    /* Set<String> window=driver.getWindowHandles();
	     
	     Iterator<String>it=window.iterator();
	     String parent=it.next();
	     String child=it.next();
	     Thread.sleep(3000L);
	    driver.switchTo().window(parent);*/
		
		//a-price aok-align-center reinventPricePriceToPayMargin priceToPay
		
	System.out.println(driver.findElement(By.xpath("//span[contains(@class='reinventPricePriceToPayMarginpriceToPay')]")).getText());
	
		
	

	}

}

package com.mintree.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sealseforce {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("birendra kumar");
		
		driver.findElement(By.id("password")).sendKeys("birendra1234");
		
		//String q=driver.findElement(By.className("loginError")).getText();
		
		//System.out.println(q);
		 
		
		driver.findElement(By.name("Login")).click();
		
		 //String q=driver.findElement(By.className("loginError")).getText();
		 
		System.out.println(driver.findElement(By.id("error")).getText());
	}

}

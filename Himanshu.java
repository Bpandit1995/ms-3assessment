package com.mintree.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Himanshu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerator");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.className("a-section aok-relative s-image-fixed-height"));

	}

}

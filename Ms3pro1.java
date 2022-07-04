package com.mintree.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ms3pro1 {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		
		driver.manage().window().maximize();
	
	    Actions a=new Actions(driver);
	     //WebElement move=driver.findElement(By.xpath("//*[@id=\\\"mc_mainWrapper\\\"]/header/div[1]/div[3]/nav/div/ul/li[9]/a"));
	     //a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mc_mainWrapper\"]/header/div[1]/div[3]/nav/div/ul/li[9]/a"))).build().perform();
	    a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mc_mainWrapper\"]/header/div[1]/div[3]/nav/div/ul/li[9]/a"))).build().perform();
      a.moveToElement(driver.findElement(By.linkText("Personal Finance"))).build().perform();
       
		driver.get("https://www.moneycontrol.com/personal-finance/tools/income-tax-calculator");
	}

}

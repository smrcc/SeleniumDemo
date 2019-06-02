package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbyselectclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Select s=new Select(driver.findElement(By.id("day")));
		s.selectByIndex(3);
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByIndex(2);
		
		Select s2=new Select(driver.findElement(By.id("year")));
		s2.selectByIndex(30);
		
		
		

	}

}

package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//diff get() and navigate().to() both are used to launch URL but navigate().to()used to launch external URL
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
	

	}

}

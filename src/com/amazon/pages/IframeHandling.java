package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mahi36");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9959940513");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("leftpanel");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		//driver.findElement(By.xpath("//a[@title='Pipeline']")).click();
		driver.findElement(By.linkText("Add Boxes")).click();
		
		
		
		

		
	}

}

package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementconcept {

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
		driver.switchTo().frame("mainpanel");
		
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		
		//a.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Companies']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='New Company']")).click();
		
		
		//driver.findElement(By.xpath("(//a[@title='Combined Form'])[2]")).click();

	}

}

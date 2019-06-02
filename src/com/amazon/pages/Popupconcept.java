package com.amazon.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popupconcept {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mahi36.appala@rediffmail.com");
		
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9959940513");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String str=alert.getText();
		
		
		
		if(str.equals("Please enter a valid user name"))
		{
			System.out.println("correct alert message");
		}
		else
		{
			System.out.println("not correct alert message");
		}
		alert.accept();
		
		

	}

}

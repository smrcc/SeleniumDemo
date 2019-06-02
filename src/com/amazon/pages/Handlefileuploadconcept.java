package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlefileuploadconcept {

	public static void main(String[] args)
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Sree\\Desktop\\Capture.JPG");
		
		
	}

}

package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsbyredbus {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		WebElement wl=driver.findElement(By.id("onward_cal"));
		String dateval="10-10-2018";
		Selectdatebyjs(driver, wl, dateval);
		

	}
	public static void Selectdatebyjs(WebDriver driver, WebElement element, String dateVal)
	{
		  JavascriptExecutor js=((JavascriptExecutor)driver);
		  js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
	}

}

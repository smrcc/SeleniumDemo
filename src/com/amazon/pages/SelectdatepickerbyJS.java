package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectdatepickerbyJS {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		
		
		WebElement date=driver.findElement(By.xpath("//input[@class='input_depart_return'and@id='hp-widget__depart']"));
		
		String dateval="06-10-2018";
		Selectdatebyjs(driver, date, dateval);
		

	}
	public static void Selectdatebyjs(WebDriver driver, WebElement element, String dateVal)
	{
		  JavascriptExecutor js=((JavascriptExecutor)driver);
		  js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
	}

}

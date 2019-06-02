package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//List<WebElement> list=driver.findElements(By.tagName("a"));  //all links in page
		//List<WebElement> list=driver.findElements(By.tagName("//*"));  //get count of all elements
		List<WebElement> list=driver.findElements(By.tagName("//table"));  //get count of tables
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			System.out.println(text);
		}

	}

}

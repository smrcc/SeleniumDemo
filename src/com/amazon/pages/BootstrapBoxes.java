package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapBoxes {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://coreui.io/docs/components/dropdowns/");
		driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenu']//a"));
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		
		

	}

}

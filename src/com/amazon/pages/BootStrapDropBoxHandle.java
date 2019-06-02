package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();
		//driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(l.size());
		//selecting all the checkboxes
		for(int i=0;i<l.size();i++)
		{
			//System.out.println(l.get(i).getText());
			String str=l.get(i).getText();
			System.out.println(str);
			
			
				l.get(i).click();
			//selecting angular checkbox	
//		for(int i=0;i<l.size();i++)
//		{
//			//System.out.println(l.get(i).getText());
//			String str=l.get(i).getText();
//			System.out.println(str);
//			if(l.get(i).getText().contains("Angular"))
//			{
//				l.get(i).click();
//				break;
//			}
			
			
		}

	}

}

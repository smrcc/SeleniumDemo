package com.amazon.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopups {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();

		Thread.sleep(2000);

		Set<String> windowhandle=driver.getWindowHandles();

		Iterator<String> itr=windowhandle.iterator();
		
		String parentWindowId=itr.next();
		
		System.out.println("parentwindow id is"+parentWindowId );
		
		String childwindowId=itr.next();
		
		System.out.println("child windowid is"+ childwindowId);
		
		driver.switchTo().window(childwindowId);
		Thread.sleep(2000);
	System.out.println("child window title is"+driver.getTitle());
	//String title=driver.getTitle();
		//System.out.println(title);
		driver.close();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window title is"+driver.getTitle());
		
		
		
	





	}

}

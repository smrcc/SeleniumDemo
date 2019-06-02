package com.amazon.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amazon.pages.LoginPage;

public class LoginTest 
{
	@Test
	public void verifyLoginTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	LoginPage  p=new LoginPage(driver);
	p.signin();
	p.userName();
	p.continueNext();
	p.password();
	p.login();
	
	
	
	
	}

}

package com.amazon.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amazon.pages.LoginPage1;

public class LoginTest1 
{
	//WebDriver driver;
	@Test
	public void verifyLoginTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	LoginPage1 l=new LoginPage1(driver);
	l.LoginPageTest("9959940513", "Mahesh@36");

}
}
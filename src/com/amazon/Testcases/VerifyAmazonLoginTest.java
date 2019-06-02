package com.amazon.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.pages.LoginPageNew;

import Helper.BrowserFactory;

public class VerifyAmazonLoginTest
{
	@Test
	public void checkvalidUser()
	{
		//this will launch browser and  specific  url
		WebDriver driver=BrowserFactory.startBrowser("chorme", "https://www.amazon.in");
		//created page object using pagefactory
		LoginPageNew l=PageFactory.initElements(driver, LoginPageNew.class);
		
		//call the method
		l.loginAmazon("9959940513", "Mahesh@36");
		driver.quit();
	}

}

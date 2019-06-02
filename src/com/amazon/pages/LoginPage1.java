package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 
{
	

	 public WebDriver driver;
	By signin=By.xpath("//span[text()='Hello. Sign in']");
	By username=By.name("email");
	By next=By.id("continue");
	By password=By.name("password");
	By login=By.id("signInSubmit");
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void LoginPageTest (String user,String pass)
	{
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys(user);
		driver.findElement(next).click();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}

}

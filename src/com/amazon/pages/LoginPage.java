package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	 public WebDriver driver;
	By signin=By.xpath("//span[text()='Hello. Sign in']");
	By username=By.name("email");
	By next=By.id("continue");
	By password=By.name("password");
	By login=By.id("signInSubmit");
	
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;	
	}
     public void signin() 
     {
    	 driver.findElement(signin).click();
    	 
     }
     public void userName()
     
     {
    	 driver.findElement(username).sendKeys("9959940513");
     }
     public void continueNext()
     {
    	driver.findElement(next).click();
     }
     public void password()
     {
    	 driver.findElement(password).sendKeys("Mahesh@36");
     }
     public void login()
     {
    	driver.findElement(login).click();
     }
}

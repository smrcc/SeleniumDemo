package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageNew 
{
	WebDriver driver;
	
public LoginPageNew (WebDriver driver)
{
	this.driver=driver;
}
@FindBy(xpath="//span[text()='Hello. Sign in']")
@CacheLookup
WebElement signin;

@FindBy(name="email")
@CacheLookup
WebElement user;

@FindBy(id="continue")
@CacheLookup
WebElement next;


@FindBy(name="password")
@CacheLookup
WebElement pass;

@FindBy(id="signInSubmit")
@CacheLookup
WebElement subbit_button;


public void loginAmazon(String username,String password)
{
	signin.click();
	user.sendKeys(username);
	next.click();
	pass.sendKeys(password);
	subbit_button.click();
	
	
}
}

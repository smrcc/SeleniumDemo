package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement wb=driver.findElement(By.id("month"));
		Select s=new Select(wb);
		s.selectByIndex(6);
		Thread.sleep(5000);
		s.selectByValue("10");
		Thread.sleep(5000);
		s.selectByVisibleText("Jun");
		
		

	}

}

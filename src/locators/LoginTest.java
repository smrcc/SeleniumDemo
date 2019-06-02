package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		

	}

}

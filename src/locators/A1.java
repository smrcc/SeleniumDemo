package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1 
{
	static WebDriver driver;

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9959940513");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Mahesh@36");
		Thread.sleep(5000);
		driver.findElement(By.id("signInSubmit")).click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-main"))).build().perform();
		//driver.findElement(By.id("nav-main")).click();

		

	}

}

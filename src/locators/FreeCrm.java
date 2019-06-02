package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FreeCrm 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.freecrm.com/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.switchTo().frame("mainpanel");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Contacts']")));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@ title='New Company']")).click();
	
		





	}

}

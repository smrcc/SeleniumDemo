package locators;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazon1 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

	}

	@Test(priority=1)
	public void login() {
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
	}

	@Test(priority=2)
	public void validateLoginUserName() 
	{
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9959940513");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Mahesh@36");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-main")).click();

	}
	@Test(priority=3)
	public void loginTitleTest()
	{
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9959940513");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Mahesh@36");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-main")).click();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

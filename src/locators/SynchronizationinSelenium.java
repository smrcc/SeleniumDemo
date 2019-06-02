package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationinSelenium {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//impliitly wait is always-----applied globally----is available for all the webelements which are available in the page
		//dynamic in nature
		//it can be changed anywhere and at any time in your code
		driver.get("https://www.facebook.com/");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname=driver.findElement(By.xpath("//input[@ name='lastname']"));
		
		WebElement mobilenum=driver.findElement(By.xpath("//input[@ id='u_0_o']"));
	
		//WebElement paasword=driver.findElement(By.xpath("//input[@type='password'][2]"));
		WebElement forgotaccount=driver.findElement(By.linkText("Forgotten account?"));
		
		sendkeys(driver, firstname, 10, "appala");
		sendkeys(driver, lastname, 5, "maheshbabu");
		
		sendkeys(driver, mobilenum,5, "9959940513");
		//sendkeys(driver, paasword, 10, "mahesh@123");
		clickon(driver,forgotaccount, 10);

	}
	          //explicit wait
	          //1.no explicit keyword or method
	          //2.available with webdriverwait with some expectedconditions
	          //3.specific to element
	          //4.dynamic in nature
	          //5.we should never use implicit wait and explicit wait together
	          //selenium webdriver will wait for the element first becaue of implicit wait and then  explicit wait will be applied
	          //hence total synchronization wait will be increased for each element
	public static void  sendkeys(WebDriver driver,WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void  clickon(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}

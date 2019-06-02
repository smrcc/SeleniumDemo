package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class MouseMovementConcept
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Hot Meals")).click();
	
		//driver.findElement(By.xpath("//a[@ id='highlight-vacations']")).click();

	}

}

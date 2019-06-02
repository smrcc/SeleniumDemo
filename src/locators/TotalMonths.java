package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalMonths {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement wb=driver.findElement(By.id("month"));
		WebElement wb=driver.findElement(By.id("day"));
		
		Select s=new Select(wb);
		List<WebElement> l=s.getOptions();
		int total=l.size();
		
		
		for(WebElement ele:l)
		{
			String str=ele.getText();
			System.out.println("total months-------------- "+str);
		}
		

	}

}

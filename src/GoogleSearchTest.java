import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("mahesh babu");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> webEle=driver.findElements(By.xpath("//span[contains(text(),'mahesh')]"));
		for(int i=0;i<webEle.size();i++) {
			System.out.println(webEle.get(i).getText());
			
			if(webEle.get(i).getText().equals("mahesh babu 2018"))
			{
				webEle.get(i).click();
			}
		}
		
		

	}

}

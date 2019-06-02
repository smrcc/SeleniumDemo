package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tinypic.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='the_file']")).sendKeys("C:\\Users\\Sree\\Desktop\\Pen\\self.jpg");
		
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload 
{


	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:/C:/Users/Sree/Desktop/fileupload.html");
		//Runtime.getRuntime().exec("C:\\Users\\Sree\\Desktop\\AutoIt\\Fileupload.exe");
		driver.findElement(By.name("resumeupload")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Sree\\Desktop\\AutoIt\\Fileupload.exe");
		
		/*driver.get("http://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("C:\\Users\\Sree\\Desktop\\fileupload.html");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();*/

	}

}

package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@ type='submit']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		if(text.equals("please enter a valid user name"))
		{
			System.out.println("correct alert message");
		}
		else
		{
			System.out.println("incorrect alert message");
		}
		alert.accept();// click on ok button
		//alert.accept();//click on cancel the button
		

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://login.yahoo.com/");
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='logo']/parent::a[@title='Yahoo']")).click();
//driver.findElement(By.xpath("//input[@name='p']")).sendKeys("pawan kalyan");
//List<WebElement> l=driver.findElements(By.xpath(""))
		WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Make')]"));
		String str=ele.getText();
		System.out.println(str);
	}

}

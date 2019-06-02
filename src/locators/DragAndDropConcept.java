package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		a.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).
		moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).
		release().
		build().
		perform();
	

	}

}

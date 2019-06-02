package locators;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandles 
{

	public static void main(String[] args)
	{
		//alerts------ java script popup(accept,dismiss methods)
		//fileupload pop up------(browse button(type=file,sendkeys(path)
		//browser window pop up---advertisement pop up(window handler api(getwindwHandler())
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.findElement(By.xpath("//a[@ name='link1'][1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String>itr=handler.iterator();
		String parentwindowid=itr.next();
		System.out.println("Parent windowid========== is" +parentwindowid);
		
		String childwindowid=itr.next();
		System.out.println("Child windowid===============is "+childwindowid);
		driver.switchTo().window(childwindowid);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("child windowpopup title========== is "+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentwindowid);
		System.out.println("parent windowpop title============== "+driver.getTitle());
		
		
		
	}

}

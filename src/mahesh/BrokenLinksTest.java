package mahesh;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Active;

public class BrokenLinksTest 
{
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of total links and images "+list.size());
		
		
		List<WebElement> active=new ArrayList<WebElement>();
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getAttribute("href")!=null)
			{
				active.add(list.get(i));
			}
		}
System.out.println("size of active links and images "+active.size());


//check the href urlwith httpconnection

for(int j=0;j<active.size();j++)
{
	HttpURLConnection c=(HttpURLConnection) new URL(active.get(j).getAttribute("href")).openConnection();
	c.connect();//connection
	String s=c.getResponseMessage();
	c.disconnect();
	System.out.println(active.get(j).getAttribute("href")+ s);
}
	}
	

}
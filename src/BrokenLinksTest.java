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

public class BrokenLinksTest 
{
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		 
		 List<WebElement> link=driver.findElements(By.tagName("a"));
		 link.addAll(driver.findElements(By.tagName("img")));
		 System.out.println(link.size());
		 
		 List<WebElement> active=new ArrayList<WebElement>();
		 
		 for(int i=0;i<link.size();i++)
		 {
			 if(link.get(i).getAttribute("href")!=null)
{
	active.add(link.get(i));
}
		 } System.out.println(active.size());
		 
		for(int j=0;j<active.size();j++)
		{
			HttpURLConnection con=(HttpURLConnection) new URL(active.get(j).getAttribute("href")).openConnection();
			con.connect();
			con.disconnect();
		String s=	con.getResponseMessage();
		System.out.println( active.get(j).getAttribute("href")+">>>>>>>>>>>+ " + s);
		}
	}
	
}

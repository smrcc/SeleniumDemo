package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class FileuploadSikuli {

	public static void main(String[] args) throws SikuliException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ type='file']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Pattern fileopeninput=new Pattern( "C:\\Users\\Sree\\Desktop\\Pen\\img\\fileopeninput.jpg ");
		Pattern openbutton=new Pattern(" C:\\Users\\Sree\\Desktop\\Pen\\img\\openbutton.jpg");
		
		Screen s=new Screen();
		
		s.type( fileopeninput, "C:\\Users\\Sree\\Desktop\\Capture.JPG");
		s.click(openbutton);
	
		
		
		

	}

}

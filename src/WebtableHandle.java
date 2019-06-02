import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		List<WebElement> rowcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int row=rowcount.size();
		System.out.println("total number of rows:" + row);
		
		
		String beforexpath="//*[@id='customers']/tbody/tr[";
		String afterxpath="]/td[1]";
		
		for(int i=2;i<row;i++)    
		{
			String actualxpath=beforexpath+i+afterxpath;
			
		WebElement element=	driver.findElement(By.xpath(actualxpath));
		
		System.out.println(element.getText());
		
		
		if(element.getText().equals("Island Trading"))
		{
			System.out.println("company name:"+ element.getText()+"is found at position "+ (i-1) );
			break;
		}
		}
		
		System.out.println("***************");
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String beforexpathcontact="//*[@id='customers']/tbody/tr[";
		
		String afterxpathcontact="]/td[2]";
		
		for(int i=2;i<=7;i++)
		{
			String actualxpathcontact=beforexpathcontact+i+afterxpathcontact;
			
			WebElement ele=driver.findElement(By.xpath(actualxpathcontact));
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Yoshi Tannamuri"))
			{
				System.out.println("welcome to dynamic webtable ");
				break;
			}
		}
		
		System.out.println("with in one month i will learn apitesting");
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
		String beforexpathcountry="//*[@id='customers']/tbody/tr[";
		String afterxpathcountry="]/td[3]";
		
		for(int i=2;i<=7;i++)
		{
			String actualxpath=beforexpathcountry+i+afterxpathcountry;
			WebElement ele=driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Canada"))
			{
				System.out.println("country name:"+ ele.getText()+" is found at position "+ (i-1));
				//System.out.println("give country at what position " +  ele.getText() + (i-1) );
				break;
			}
		}
		
		//handle  dynamic webtable columns
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		String beforexpathcol="//*[@id=\"customers\"]/tbody/tr[1]/th[";
		String afterxpathcol="]";
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int colcount=cols.size();
		System.out.println(colcount);
		System.out.println("column values are");
		for(int i=1;i<=colcount;i++)
		{
			String actualxpath=beforexpathcol+i+ afterxpathcol;
			WebElement ele=driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());
		}
		
	
		}
	

}

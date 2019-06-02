package com.amazon.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("mahi36");
		driver.findElement(By.name("password")).sendKeys("9959940513");
		WebDriverWait wait=new WebDriverWait(driver, 25);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.switchTo().frame("mainpanel");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Calendar']")));

		driver.findElement(By.xpath("//a[@title='Calendar']")).click();

		String date = "-September-2017";
		String str[] = date.split("-");
		String day = str[0];
		String month = str[1];
		String year = str[2];

		Select s = new Select(driver.findElement(By.name("slctMonth")));

		s.selectByVisibleText(month);

		Select s1 = new Select(driver.findElement(By.name("slctYear")));
		s1.selectByVisibleText(year);
		List<WebElement> list=driver.findElements(By.xpath("//td[@class='calendarcell']"));
		for(int i=0;i<list.size();i++) {
			
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().equals("18"))
				{
					list.get(i).click();
					break;
				}
			
		}
		

		/*
		 * //td[@class='calendaremptycell']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		 * String beforexpath=
		 * "//td[@class='calendaremptycell']/table/tbody/tr[2]/td/table/tbody/tr[";
		 * String afterxpath="]/td[";
		 * 
		 * final int totalweekdays=7;
		 * 
		 * for(int rowNum=2;rowNum<=7;rowNum++) { for(int
		 * colNum=1;colNum<=totalweekdays;colNum++) { String
		 * days=driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).
		 * getText(); System.out.println(days); } }
		 */

	}

}

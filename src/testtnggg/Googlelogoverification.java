package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Googlelogoverification
{
	ChromeDriver driver;
	@BeforeTest
	public void before()
	{
		
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://google.com/");
			
	}
	
	@Test
	public void logover()
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		if(logo.isDisplayed())
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
//		org.testng.Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
//		System.out.println("Logo is verified");
//		Boolean logoPresent = logo.isDisplayed();
//		System.out.println(logoPresent);
		
	}
     
  

}

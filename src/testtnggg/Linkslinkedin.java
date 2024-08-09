package testtnggg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Linkslinkedin
{
	ChromeDriver driver;
	
	@BeforeTest
   public void beftest()
   {
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
   }
	
	@BeforeMethod
	public void befmethod()
	{
		
	}
	
	@Test(groups = "abc")
	public void test1()
	{
		String exp="LinkedIn: Log In or Sign Up";
		String actual=driver.getTitle();
		
		if(exp.equals(actual))
		{
			System.out.println("Test passed");
		}
		else
			System.out.println("Test failed");
		
	}
	
	@Test(groups = "abc")
	public void test2()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		//System.out.println("Link details : "+li);
		for (WebElement link : li)
		   {
	         
			String hrefValue = link.getAttribute("href");
	           
	           //System.out.println("Link: " +link);
	           
	           System.out.println("Link: " + hrefValue);
	           //System.out.println("Link details : " +link.getText());
		   }

		
	}
	
	@Test(groups = "te")
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups = "test4")
	public void test4()
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void afmethod()
	{
		
	}
	
	@AfterTest
	public void aftest()
	{
		driver.quit();
	}
}

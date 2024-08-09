package testtnggg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logoverassertion
{
   ChromeDriver driver;
   @BeforeTest
   public void before()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.linkedin.com/login");
   }
   
   @Test
   public void test()
   {
		
		String exp="LinkedIn";
		//String exp="LinkedIn Login, Sign in | LinkedIn";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, exp);
		
		System.out.println("Title is : "+actual);
		
		if(actual.contains(exp))
		{
			System.out.println("Test passed");
		}
		else
			System.out.println("Test failed");
		
		
		
		
   }
}

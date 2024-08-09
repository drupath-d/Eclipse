package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo
{
  ChromeDriver driver;
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/"); 
  }
  
  @Test
  public void test1()
  {
	  String exp="Goo";
		String actual=driver.getTitle();
		System.out.println("Title is : "+actual);
		System.out.println("Expected title is : "+exp);
		
		if(actual.contains(exp))
		{
			System.out.println("Test passed");
		}
		else
			System.out.println("Test failed");
  }
  
  @After
  
  public void afterrr()
  {
	  driver.quit();
  }  
}

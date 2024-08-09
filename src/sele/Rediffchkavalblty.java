package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffchkavalblty
{
  ChromeDriver driver;
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
  }
  
  @Test
  public void test()
  {
	   
  WebElement button=driver.findElement(By.xpath("//input[@value=\"Check availability\"]"));
  
  String actual=button.getAttribute("value");
  String exp="Check availability";
  
  if(actual.equals(exp))
  {
	  System.out.println("Pass");
  }
  else
	  System.out.println("Fail");
  
  System.out.println(actual);

	   
  }
  
  @After
  public void after()
  {
	  driver.quit();
  }
}

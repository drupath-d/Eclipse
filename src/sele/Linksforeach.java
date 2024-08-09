package sele;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksforeach
{
  ChromeDriver driver;
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
  
  @Test
  public void test()
  {
	  List<WebElement> li=driver.findElements(By.tagName("a"));
	   //System.out.println("Number of links = "+li.size());
	   
	   for (WebElement link : li)
	   {
           String hrefValue = link.getAttribute("href");
           
           System.out.println("Link: " + hrefValue);
           System.out.println("Link details : " +link.getText());
	   }

  }
  
  @After
  public void after()
  {
	  driver.quit();
  }
}

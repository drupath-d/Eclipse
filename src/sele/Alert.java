package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert
{
	ChromeDriver driver;
	  @Before
	  public void setup()
	  {
		  driver=new ChromeDriver();
		  driver.get("file:///C:/Users/drupa/OneDrive/Desktop/alert.html");
	  }
	  
	  @Test
	  public void test()
	  {
	    driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
	    org.openqa.selenium.Alert s=driver.switchTo().alert();
	    s.accept();

	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Jojo");
	    driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Saji");
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		   
	    WebElement button=driver.findElement(By.xpath("//input[@type=\"button\"]"));
	    String actual=button.getAttribute("value");
	    String exp= "Display alert box";
	    
	    if(actual.equals(exp))
	    {
	  	  System.out.println("Pass");
	    }
	    else
	    {
	  	  System.out.println("Fail");
	    }
	  
	  }
	  
	  @After
	  public void after()
	  {
		  driver.quit();
	  }
	}

package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbxpath
{
   ChromeDriver driver;
   @Before
   public void setup()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");  
   }
   
   @Test
   public void test()
   {
	   driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("abc123");
	   driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys("abc@123");
	   driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
	
	 
   }
   
   @After
   public void after()
   {
	   driver.quit();
   }
   
 

}

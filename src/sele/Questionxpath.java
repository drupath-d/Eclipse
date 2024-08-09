package sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Questionxpath
{
  ChromeDriver driver;
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/ref=nav_logo");
  }
  
  @Test
  public void test()
  {
	  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobile",Keys.ENTER);
	  driver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]/span[1]")).click();
	  driver.findElement(By.xpath("//div[@class=\"nav-line-1-container\"]/span[1]")).click();
	  driver.findElement(By.xpath("//div[@class=\"a-row a-spacing-base\"]/input[1]")).sendKeys("dahdlah@dajd.com");
	  driver.findElement(By.xpath("//span[@class=\"a-button-inner\"]/input")).click();
	  driver.navigate().back();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]/i")).click();
  }
  
  @After
  public void after()
  {
	  //driver.close();
  }
}

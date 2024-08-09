package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99demo
{
	ChromeDriver driver;
	   
	@BeforeMethod
	public void setup()
	 {
	    driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		   
	 }
	   
   @Test
	public void test()
	 {
	   WebElement rightclick=driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));
	   WebElement doubleclick=driver.findElement(By.xpath("//*[@ondblclick=\"myFunction()\"]"));
	   Actions act=new Actions(driver);
	   act.contextClick(rightclick).perform();
	   act.doubleClick(doubleclick).perform();
	   org.openqa.selenium.Alert s=driver.switchTo().alert();
	    s.accept();

	 }
	
	
	
}

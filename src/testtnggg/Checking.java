package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checking
{
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.vrlbus.in/#/");
		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"largeModal\"]/div/div/button")).click();
		WebElement source=driver.findElement(By.xpath("//*[@id=\"FromCity\"]"));
		Select sourceelement=new Select(source);
		sourceelement.selectByValue("Ahmedabad");
			
   		

     }
	
}

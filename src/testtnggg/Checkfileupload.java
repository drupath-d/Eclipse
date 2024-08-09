package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkfileupload
{
	ChromeDriver driver;
	
	@BeforeTest
	public void before()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://demo.guru99.com/test/upload/");	
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();     //checkbox
		//driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click(); //submit
		driver.findElement(By.xpath("//div[@id=\"filelist\"]/div/input")).click();
		//WebElement upload=driver.findElement(By.xpath("//div[@id=\"filelist\"]/div/input")); 
//		Actions ac=new Actions(driver);
//		ac.click(upload);
//		ac.perform();
		//upload.click();
	
	
	
	
	}
}

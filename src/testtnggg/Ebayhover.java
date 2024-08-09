package testtnggg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebayhover
{
	ChromeDriver driver;
	   
	@BeforeMethod
	public void setup()
	 {
	    driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		   
	 }
	   
   @Test()
	public void test()
	 {
	   WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
	   Actions act=new Actions(driver);
	   act.moveToElement(electronics).perform();
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9999999));// Implicit wait
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[2]/a")));
	   driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	  

	 }
}

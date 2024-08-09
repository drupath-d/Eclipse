package sele;

import java.io.File;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/drupa/OneDrive/Desktop/alert.html");
	}
	
	@Test
	public void test() throws IOException
	{
	  
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		WebElement button=driver.findElement(By.xpath("//input[@type=\"button\"]"));
		File scr=button.getScreenshotAs(OutputType.FILE);
  
	  org.openqa.selenium.io.FileHandler.copy(scr, new File ("C:\\Users\\drupa\\OneDrive\\Documents\\Screeneclipse\\partial.png"));
	  org.openqa.selenium.io.FileHandler.copy(src, new File("C:\\Users\\drupa\\OneDrive\\Documents\\Screeneclipse\\screen.png"));
	}
      
}

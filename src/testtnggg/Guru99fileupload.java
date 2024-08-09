package testtnggg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99fileupload 
{
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
	   driver=new ChromeDriver();	
	}
	
	@Test
	public void test() throws AWTException, InterruptedException
	{
		
		driver.manage().window().maximize();
		fileupload("C:\\Users\\drupa\\OneDrive\\Desktop\\metrics.docx");
		
	}
	
	public void fileupload(String p) throws AWTException, InterruptedException
	{
		
		driver.get("https://demo.guru99.com/test/upload/");	
	    //Thread.sleep(10000);
		WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		//upload.click();
		Actions ac=new Actions(driver);
		ac.click(upload);
		ac.perform();
		StringSelection stringselect=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();  //checkbox
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click(); //submit
		
	}
	
	@AfterTest
	public void after()
	{
		//driver.quit();
	}

}

package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Phpdatepicker
{
	ChromeDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://phptravels.net/hotels");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		String month="December 2024";
		String date="20";
		
		driver.findElement(By.id("checkin")).click();
		
		while(true)
		{
			Thread.sleep(2000);
			String act=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if(act.equals(month))
			{
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/tbody/tr[4]/td[6]")).click();
		
		
		
	}

}

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Vrlbus
{
	WebDriver driver;
	   
    By popup=By.xpath("//*[@id=\"largeModal\"]/div/div/button");
    By source=By.xpath("//*[@id=\"FromCity\"]");
    By destination=By.xpath("//*[@id=\"ToCity\"]");
    By actmonth=By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[2]");
    By nextbtn=By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[3]");
    By date=By.xpath("/html/body/div/div[1]/table/tbody/tr[1]/td[7]");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[2]/div/div/div/div[1]/div/div[3]/button");
	   
	   
   public Vrlbus(WebDriver driver)
    {
	   this.driver=driver;
    }
	   
   public void popup() throws InterruptedException
	{
	  Thread.sleep(5000);
	  driver.findElement(popup).click();
	  
	}
   
   public void fromto(String from, String to)
   {
	   driver.findElement(source).sendKeys(from, Keys.ENTER);
	   driver.findElement(destination).sendKeys(to, Keys.ENTER);
	 		   
   }
   
   public void datepicker() throws InterruptedException
   {
	   String month="August 2024";
		
		while(true)
		{
			Thread.sleep(2000);
			String act=driver.findElement(actmonth).getText();
			if(act.equals(month))
			{
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(nextbtn).click();
			}
		}
		
		driver.findElement(date).click(); 
	   
	   
   }
   
   public void search()
   {
	   driver.findElement(search).click();
   }
   
   
}

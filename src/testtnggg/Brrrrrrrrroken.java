package testtnggg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Brrrrrrrrroken
{
	ChromeDriver driver;
	
	@BeforeTest	
	public void beforetest()
	{
		driver=new ChromeDriver();		
	}
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");
			
	}
	
	@Test
	public void test() throws MalformedURLException
	{
	  int brokenlinks=0, validlinks=0, totallinks=0;
	  List<WebElement> li=driver.findElements(By.tagName("a"));
	  totallinks=+li.size();
		
	   for(WebElement link:li)
		{
		  String url=link.getAttribute("href");
		  if(url!=null && !url.isEmpty())
		   {
			try
			{
			  URL links=new URL(url);
			  HttpURLConnection httpcon=(HttpURLConnection) links.openConnection();
		 	  httpcon.setConnectTimeout(3000);
   			  httpcon.connect();
			  if(httpcon.getResponseCode()>=400)
			   {
			     System.out.println(url+"------"+httpcon.getResponseMessage()+"-"+httpcon.getResponseCode());
				 brokenlinks++;
			   }
				else
				 {
					validlinks++;
						
				 }
		   }    
				catch (IOException e)
				{
					System.out.println(e.getMessage());
				}
			

		   }
			
		}
		
		System.out.println("Total number of links = "+totallinks);
		System.out.println("Number of broken links = "+brokenlinks);
		System.out.println("Number of valid links = "+validlinks);
	}
		
   @AfterTest
   public void after()
   {
	   driver.close();
	   
   }

}

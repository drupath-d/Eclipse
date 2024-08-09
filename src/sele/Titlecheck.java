package sele;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Titlecheck
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		
		String exp="LinkedIn";
		String actual=driver.getTitle();
		System.out.println("Title is : "+actual);
		
		if(actual.contains(exp))
		{
			System.out.println("Test passed");
		}
		else
			System.out.println("Test failed");
		
		
		Assert.assertEquals(actual, exp);

	}

}

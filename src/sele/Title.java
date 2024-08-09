package sele;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String exp="Facebook – log in or sign up";
		String actual=driver.getTitle();
		
		if(exp.equals(actual))
		{
			System.out.println("Test passed");
		}
		else
			System.out.println("Test failed");

	}

}

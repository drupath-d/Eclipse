package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Fbbaseclass
{
    WebDriver driver;
	
	@BeforeClass
	public void test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}

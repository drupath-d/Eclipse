package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Vrlbus;

public class Vrlbuspom
{
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
		
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		Vrlbus vrl=new Vrlbus(driver);
		vrl.popup();
		vrl.fromto("Bengaluru","Ahmedabad");
		vrl.datepicker();
		vrl.search();
	}
}

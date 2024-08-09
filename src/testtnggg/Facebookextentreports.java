package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Facebookextentreports
{
   WebDriver driver;
   ExtentHtmlReporter extent;
   ExtentReports report;
   ExtentTest test;
   
   @BeforeTest
   public void test()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   extent=new ExtentHtmlReporter("./Reports/myreports.html");
	   extent.config().setTheme(Theme.DARK);
	   extent.config().setReportName("fb_automation report");
	   extent.config().setDocumentTitle("myreport");
	   report=new ExtentReports();
	   report.attachReporter(extent);
	   report.setSystemInfo("OS", "Windows11");
	   report.setSystemInfo("Host", "General");
	   report.setSystemInfo("Tested by", "Drupath");
	   
	   
   }
   @BeforeMethod
   public void beforemeth()
   {
	   //driver.get("https://www.facebook.com/");
   }
   
   @Test
   public void test1()
   {
	    test=report.createTest("test1");
	    String exp="Facebook";
		String actual=driver.getTitle();
		System.out.println("Title is : "+actual);
		
		if(actual.contains(exp))
		{
			System.out.println("Test passed");
		}
		else
			System.out.println("Test failed"); 
	   
   }
   
   @Test
   public void test2()
   {
	   test=report.createTest("test2");
	   By email=By.id("email");
	   driver.findElement(email).sendKeys("abc@gmail.com");
   }
   
   @Test
   public void test3()
   {
	   test=report.createTest("test3");
	   By password=By.id("pass");
	   driver.findElement(password).sendKeys("abc@1");
   }
   
   @Test
   public void test4()
   {
	   test=report.createTest("test4");
	   By loginbutton=By.name("login");
	   driver.findElement(loginbutton).click();
   }
   @AfterTest
   public void after()
   {
	   report.flush();
   }
}

package testtnggg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent 
{
   WebDriver driver;
   ExtentHtmlReporter extent;
   ExtentReports report;
   ExtentTest test;
   
   @BeforeTest
   public void test()
   {
	   extent=new ExtentHtmlReporter("./Reports/myreport.html");
	   extent.config().setTheme(Theme.DARK);
	   extent.config().setReportName("automation report");
	   extent.config().setDocumentTitle("myreport");
	   
   }
}

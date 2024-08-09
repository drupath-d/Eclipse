package testtnggg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfb
{
ChromeDriver driver;
	
	@BeforeTest	
	public void beforetest()
	{
		driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");	
		driver.manage().window().maximize();
		
	}
	
	@Test()
	public void fbtest() throws IOException
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\drupa\\OneDrive\\Desktop\\datadriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		
		for(int i=1; i<=rowcount; i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username : "+username);
			System.out.println("Password : "+password);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		}
		
	}
	
	@AfterTest
	public void after()
	{
		driver.quit();
	}

}

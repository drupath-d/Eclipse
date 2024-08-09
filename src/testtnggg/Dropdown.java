package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown
{
	ChromeDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
	}
	
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select dayelement=new Select(day);
		dayelement.selectByValue("07");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select monthelement=new Select(month);
		monthelement.selectByVisibleText("JUL");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select yearelement=new Select(year);
		yearelement.selectByIndex(25);
	}

}

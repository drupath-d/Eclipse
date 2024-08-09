package testtnggg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationdemosite
{
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
	   driver=new EdgeDriver();	
	   driver.get("https://demo.automationtesting.in/Register.html");
	   
	}
	
	@Test
	public void test() throws InterruptedException, AWTException
	{
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		firstname.sendKeys("Alhijas");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		lastname.sendKeys("Salim");
		WebElement address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys("Luminar Kochi");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		email.sendKeys("abc@gmail.com");
		WebElement phoneno=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phoneno.sendKeys("9876543211");
		WebElement male=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		male.click();
		Thread.sleep(5000);
		WebElement cricket=driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		cricket.click();
		Thread.sleep(5000);
		WebElement lang=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		lang.click();
		WebElement eng=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(eng).click().perform();
		WebElement skills=driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select skillselement=new Select(skills);
		skillselement.selectByValue("Java");
		WebElement scountry=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		scountry.click();
		Thread.sleep(3000);
		WebElement ind=driver.findElement(By.xpath("//*[@id=\"countries\"]"));
		act.moveToElement(ind).click().perform();
		WebElement year=driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select yearelement=new Select(year);
		yearelement.selectByValue("1998");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select monthelement=new Select(month);
		monthelement.selectByValue("August");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select dayelement=new Select(day);
		dayelement.selectByValue("16");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
		pass.sendKeys("Abc@123");
		WebElement cpass=driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		cpass.sendKeys("Abc@123");
		WebElement upload=driver.findElement(By.id("imagesrc"));
		Actions ac=new Actions(driver);
		ac.click(upload);
		ac.perform();
		fileupload("C:\\Users\\drupa\\Downloads\\broken1.jpg");
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
		submit.click();
		
		
		
	}

	public void fileupload(String p) throws InterruptedException, AWTException
	{
		StringSelection stringselect=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
}

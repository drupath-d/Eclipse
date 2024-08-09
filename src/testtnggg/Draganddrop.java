package testtnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Draganddrop
{
	ChromeDriver driver;
	   
	@BeforeMethod
	public void setup()
	 {
	    driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		   
	 }
	   
   @Test
	public void test()
	 {
	   WebElement dragme=driver.findElement(By.xpath("//div[@id=\"simpleDropContainer\"]/div[1]"));
	   WebElement dropped=driver.findElement(By.xpath("//div[@id=\"simpleDropContainer\"]/div[2]"));
	   Actions act=new Actions(driver);
	   act.dragAndDrop(dragme, dropped);
	   act.perform();
	   WebElement drop=driver.findElement(By.xpath("//div[@class=\"drop-box ui-droppable ui-state-highlight\"]/p"));
	   System.out.println(drop.getText()); 
	 }

}

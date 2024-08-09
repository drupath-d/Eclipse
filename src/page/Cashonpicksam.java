package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cashonpicksam
{
	WebDriver driver;
	   
    By searchbox=By.id("auto-searchterms1");
    By sortby=By.id("products-orderby");
    By display=By.id("products-pagesize");
		   
    public Cashonpicksam(WebDriver driver)
	 {
		  
	  this.driver=driver; 
			   
     }
		   
	public void searchsam(String samsung)
	 {
		driver.findElement(searchbox).sendKeys("samsung", Keys.ENTER);
				
	 }
		 
    public void sorting()
	 {
				
	    WebElement sort=driver.findElement(sortby);
		Select sortelement= new Select(sort);
		sortelement.selectByIndex(1);
				
	 }
				
	public void display()
	 {
	    WebElement displayy=driver.findElement(display);
		Select displayelement=new Select(displayy);
		displayelement.selectByIndex(2);
				
	 }
}

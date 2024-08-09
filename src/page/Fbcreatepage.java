package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage
{
	WebDriver driver;
	
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By createemail=By.name("email");
	By createpass=By.name("pass");
	By createloginbutton=By.id("loginbutton");
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void createpage(String createemaill, String createpasswd)
    {
    	driver.findElement(createpage).click();
    	driver.findElement(createemail).sendKeys(createemaill);
    	driver.findElement(createpass).sendKeys(createpasswd);
    	driver.findElement(createloginbutton).click();
    }
}

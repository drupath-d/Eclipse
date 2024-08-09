package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogin
 {
	WebDriver driver;
	
	By email=By.id("email");
	By password=By.id("pass");
	By loginbutton=By.name("login");
	
	
	
	public Fblogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String emaill, String passwd)
	{
		driver.findElement(email).sendKeys(emaill);
		driver.findElement(password).sendKeys(passwd);
		
	}
	
    public void click()
    {
    	driver.findElement(loginbutton).click();
    }
    
    
}

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Cashonpickoneplus
{
    WebDriver driver;
	
	By searchbox=By.id("auto-searchterms1");
	By advsearch=By.id("adv");
	By pricefrom=By.xpath("//*[@id=\"pf\"]");
	By priceto=By.xpath("//*[@id=\"pt\"]");
	By search=By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/div[2]/div[1]/form/div[2]/input");
	
	
	public Cashonpickoneplus(WebDriver driver)
	{
		
	   this.driver=driver;
		
	}
	
	public void searchoneplus(String oneplus)
	{
		driver.findElement(searchbox).sendKeys(oneplus, Keys.ENTER);
		
	}
	
	public void advsearchtick()
	{
		
		driver.findElement(advsearch).click();
		
	}	
		
	public void pricerange()
	{
		driver.findElement(pricefrom).sendKeys("40000");
		driver.findElement(priceto).sendKeys("100000");
	}
		
	public void search()
	{
		driver.findElement(search).click();
	}	
}


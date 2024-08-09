package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basicsss
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.name("email")).sendKeys("Abc123@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("abc@123");
		//driver.findElement(By.name("login")).click();

		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.name("session_key")).sendKeys("Abc123@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("abc@123");
		driver.findElement(By.name("homepage-basic_sign-in-submit-btn")).click();
		//driver.findElement(By.id("sign-in-form__submit-btn")).click();

	}

}

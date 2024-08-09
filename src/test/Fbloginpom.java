package test;

import org.testng.annotations.Test;

import page.Fblogin;

public class Fbloginpom extends Fbbaseclass
{

    @Test
	public void test1()
	{
		Fblogin fb=new Fblogin(driver);
		fb.login("abcc@123", "abc");
		fb.click();
	}
}

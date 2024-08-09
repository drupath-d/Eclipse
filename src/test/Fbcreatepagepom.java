package test;

import org.testng.annotations.Test;

import page.Fbcreatepage;



public class Fbcreatepagepom extends Fbbaseclass
{
	
	
	@Test
	   public void test2()
	   {
		Fbcreatepage fbb=new Fbcreatepage(driver);
		fbb.createpage("abcc@123", "abc");
	   }
	
}

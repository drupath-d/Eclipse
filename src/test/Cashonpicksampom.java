package test;

import org.testng.annotations.Test;

import page.Cashonpicksam;

public class Cashonpicksampom extends Cashonpickbaseclass
{
	@Test
	public void test1()
	{
		Cashonpicksam cs=new Cashonpicksam(driver);
		cs.searchsam("samsung");
		cs.sorting();
		cs.display();
	}
}

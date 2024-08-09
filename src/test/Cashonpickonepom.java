package test;

import org.testng.annotations.Test;

import page.Cashonpickoneplus;

public class Cashonpickonepom extends Cashonpickbaseclass
{
	@Test
	public void test2()
	{
		Cashonpickoneplus co=new Cashonpickoneplus(driver);
		co.searchoneplus("oneplus");
		co.advsearchtick();
		co.pricerange();
		co.search();
	}

}

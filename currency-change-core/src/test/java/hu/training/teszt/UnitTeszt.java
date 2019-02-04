package hu.training.teszt;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hu.training.currency.Currency;
import hu.training.currency.CurrencyChangeServiceImpl;
import hu.training.currency.CurrencyRatesMock;
import hu.training.currency.CurrencyRatesServiceImpl;

public class UnitTeszt {
	
	private CurrencyChangeServiceImpl currencycservice = null;
	
	@Before
	public void init() {
		currencycservice = new CurrencyChangeServiceImpl();
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void teszt1() 
	{
		currencycservice.buy(-1, Currency.EURO);
	}
	
	@Test
	public void teszt2() 
	{
		double expected=312.09;
		assertEquals(expected,currencycservice.sell(1, Currency.EURO),1);
	}
	

}

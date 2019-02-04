package hu.training.currency;

import java.util.NoSuchElementException;

public class CurrencyChangeServiceImpl implements CurrencyChangeService{

	public double sell(double amount, Currency expectedCurreny) {
		if(amount<0)
		{
			throw new NumberFormatException();
		}
		if(expectedCurreny.equals(null)) 
		{
			throw new NoSuchElementException();
		}
		
		return new CurrencyRatesMock().getElad(amount, expectedCurreny);
	}

	public double buy(double amount, Currency currentCurrency) {
		if(amount<0)
		{
			throw new NumberFormatException();
		}
		if(currentCurrency.equals(null)) 
		{
			throw new NoSuchElementException();
		}
		
		return new CurrencyRatesMock().getVesz(amount, currentCurrency);
	}
		

}

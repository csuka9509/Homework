package hu.training.currency;

public interface CurrencyChangeService {
	
	double buy(double amount, Currency expectedCurreny);
	double sell(double amount, Currency currentCurreny);
	
}

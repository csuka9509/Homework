package hu.training.currency;

public class CurrencyRatesServiceImpl extends CurrencyRatesMock implements CurrencyRatesService {

	public void Eladasi() {
		
		System.out.println(getEladas());
		
	}

	public void Veteli() {
		
		System.out.println(getVetel());
	}

}

package hu.training.currency;

import java.util.HashMap;

public class CurrencyRatesMock {
	
	private final HashMap<Currency, Double> vetel = new HashMap<Currency, Double>();
	private final HashMap<Currency, Double> eladas = new HashMap<Currency, Double>();
	
	public CurrencyRatesMock() {
		super();
		vetel.put(Currency.DOLLAR, 286.59);
		vetel.put(Currency.EURO, 324.83);
		vetel.put(Currency.FONT, 376.26);
		vetel.put(Currency.FORINT, 1.00);
		eladas.put(Currency.DOLLAR, 275.91);
		eladas.put(Currency.EURO, 312.09);
		eladas.put(Currency.FONT, 360.07);
		eladas.put(Currency.FORINT, 1.00);
		
	}

	public HashMap<Currency, Double> getVetel() {
		return vetel;
	}
	
	public HashMap<Currency, Double> getEladas() {
		return eladas;
	}
	
	public Double getElad(double ertek, Currency valuta) 
	{
		return ertek*eladas.get(valuta);
	}
	
	public Double getVesz(double ertek, Currency valuta) 
	{
		return ertek/vetel.get(valuta);
	}

}

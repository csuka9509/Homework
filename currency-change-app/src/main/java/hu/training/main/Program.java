package hu.training.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import hu.training.currency.Currency;
import hu.training.currency.CurrencyChangeService;
import hu.training.currency.CurrencyChangeServiceImpl;
import hu.training.currency.CurrencyRatesService;
import hu.training.currency.CurrencyRatesServiceImpl;

public class Program {

	public static void main(String[] args) {
		String parancs= null;
		String sor;
		String tokenek[];
		Currency currency= null;
		Boolean ivaluta=false;
		Boolean iertek=false;
		Double ertek=null;
		CurrencyChangeService currencyChangeService = null;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.print("Eladni vagy venni szeretne (sell-buy)?: ");
		} while (!"sell".equals(parancs = sc.nextLine().toLowerCase()) 
				&& !"buy".equals(parancs));
		
		CurrencyRatesService currencyRatesService = new CurrencyRatesServiceImpl();
		
		if ("sell".equals(parancs)) {
			currencyRatesService.Eladasi();
		}
		else if ("buy".equals(parancs)) {
			currencyRatesService.Veteli();
		}
		
		do {
			System.out.print("Valasszon egy valutatat es adjon meg egy erteket: ");
			 try {
				sor=sc.nextLine();
				tokenek=sor.split(" ");
				currency = Currency.valueOf(tokenek[0].toUpperCase());
				ivaluta = true;
				ertek = Double.parseDouble(tokenek[1]);
				iertek = true;
			} catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | InputMismatchException e) {
				
			}
		} while (!(ivaluta && iertek));
		
		currencyChangeService = new CurrencyChangeServiceImpl();
		
		if("buy".equals(parancs))
		{
			System.out.printf("%.2f %s\n",currencyChangeService.buy(ertek, currency),
					currency.getTitle());
		}
		else if("sell".equals(parancs)) 
		{
			System.out.printf("%.2f %s\n",currencyChangeService.sell(ertek, currency),Currency.FORINT.getTitle());
		}
		
		sc.close();
		
	}

}

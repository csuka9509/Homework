package hu.training.currency;

public enum Currency{
	FORINT("HUF"), 
	DOLLAR("USD"), 
	EURO("EUR"),
	FONT("GBP");

private String title;
	
private Currency(String title) 
{
	this.title=title;
} 

public String getTitle() 
{
	return title;
}
}

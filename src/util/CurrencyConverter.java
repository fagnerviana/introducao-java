package util;

public class CurrencyConverter {
	
    
	public static double dolarVenda;
	public static double dolarCota;
	public static double real;
//teste 
	
	public static double conversao() {
		real = (dolarVenda * dolarCota)*6/100;
		return real +(dolarVenda*dolarCota);
		  
	}
	
}

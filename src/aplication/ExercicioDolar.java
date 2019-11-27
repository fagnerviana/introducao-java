package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ExercicioDolar {
	
	CurrencyConverter x = new CurrencyConverter();

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("What is the dollar price ?");
		CurrencyConverter.dolarCota=sc.nextDouble();
		
		System.out.println("How many dollar will bought ?");
		CurrencyConverter.dolarVenda = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = "+CurrencyConverter.conversao());
		
			
		sc.close();
		

	}

}

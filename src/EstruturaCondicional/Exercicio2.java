//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar
package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o numero ?");
		double n = sc.nextDouble();
		
		double par = n%2;
		
		if(par == 0) {
			
			System.out.println("O numero � PAR");
		}	
		else {
			System.out.println("O numero � Impar");
					
		}
		
		sc.close();
		

	}

}

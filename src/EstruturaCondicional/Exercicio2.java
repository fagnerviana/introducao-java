//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o numero ?");
		double n = sc.nextDouble();
		
		double par = n%2;
		
		if(par == 0) {
			
			System.out.println("O numero é PAR");
		}	
		else {
			System.out.println("O numero é Impar");
					
		}
		
		sc.close();
		

	}

}

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Qual o numero ?");
		double numero = sc.nextDouble();
		
		if(numero<0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Não Negativo");
		}
		
		
		sc.close();

	}

}

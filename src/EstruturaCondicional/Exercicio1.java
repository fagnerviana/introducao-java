//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

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
			System.out.println("N�o Negativo");
		}
		
		
		sc.close();

	}

}

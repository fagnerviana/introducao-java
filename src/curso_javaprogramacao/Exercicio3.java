//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
//de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
package curso_javaprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = (A*B - C*D);
		
		System.out.println("Diferen�a = "+diferenca);
		
		
		sc.close();
		


	}

}

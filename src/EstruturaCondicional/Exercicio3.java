//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
//ordem crescente ou decrescente.

package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double A = sc.nextDouble();
		System.out.println("Digite o segundo numero");
		double B = sc.nextDouble();
		
		if(A%B==0 || B%A==0) {
			
			System.out.println("S�o Multiplos");
			
		}else {
			System.out.println("N�o S�o Multiplos");
			
		}
		
		
		sc.close();

	}

}

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

package curso_javaprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int qtd = sc.nextInt();
		double preco = sc.nextDouble();
		int codigoPeca2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double objeto1 = qtd*preco;
		double objeto2 = qtd2*preco2;
		double valorT = objeto1 + objeto2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorT);
		
		sc.close();
 

	}

}

//Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em
//nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.

package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if(valor < 0.0 || valor > 100.0) {
			System.out.println("Numero fora de intervalo");
		}else if (valor <= 25.0) {
			System.out.println("O intervalor [0,25]");
		}else if (valor <= 50.00) {
			System.out.println("O intervalor [25.50]");
		}else if (valor <= 75.00) {
			System.out.println("O intervalor [50.75]");
		}else {
			System.out.println("O intervalor [75.100]");
		}
		
		
		
		
		sc.close();

	}

}

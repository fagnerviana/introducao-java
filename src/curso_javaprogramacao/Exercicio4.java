//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
package curso_javaprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoF= sc.nextInt();
		double horasT = sc.nextDouble();
		double valorH = sc.nextDouble();
		double salario = horasT*valorH;
		
		System.out.println("Number = "+codigoF);
		System.out.printf("Salary = US %.2f%n",salario);
		
		
		
		
		sc.close();

	}

}

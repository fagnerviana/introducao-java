//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
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

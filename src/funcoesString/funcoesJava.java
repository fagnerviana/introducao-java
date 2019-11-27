package funcoesString;

import java.util.Scanner;

public class funcoesJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double y = sc.nextInt();
		double x = Math.sqrt(y);
		
		System.out.printf("A raiz quadrada de %.2f%n  é = %.2f%n ",y, +x);
		
		
		
		sc.close();

	}

}

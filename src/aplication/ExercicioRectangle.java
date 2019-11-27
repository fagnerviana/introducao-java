/*
 * Fazer um programa para ler os valores da largura e altura de um retangulo.
 * Em seguida, mostrar na tela o valor de sua area, perimetro e diagonal.
 * Usar uma classe 
 * Nome:ExercicioRectangle
 * width:double;
 * Height:double;
 * Função : 
 * Area : double
 * Perimeter:double
 * Diagonal:double*/
package aplication;

import java.util.Locale;
import java.util.Scanner;

import enteties.Rectangle;

public class ExercicioRectangle {

	public static void main(String[] args) {
		Rectangle x = new Rectangle();
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle widht and height:");
		x.Widht=sc.nextDouble();
		x.Height=sc.nextDouble();
		System.out.printf("Area: %.2f%n",+x.area());
		System.out.printf("Perimeter: %.2f%n",+x.perimeter());
		System.out.printf("Diagonal: %.2f%n", +x.diagonal());
		
		
		sc.close();

	}

}

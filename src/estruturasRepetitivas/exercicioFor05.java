/*Ler um valor N. 
 * Calcular e escrever seu respectivo fatorial. 
 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * Lembrando que, por defini��o, fatorial de 0 � 1.
 * 	
 */

package estruturasRepetitivas;

import java.util.Scanner;

public class exercicioFor05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int f=1;
		for(int i=1; i<=n;i++) {
			
			f=f*i;
						
		}
		
		System.out.println(f);
		
		sc.close();

	}

}

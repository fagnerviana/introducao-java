/*Fazer um programa para ler um número N. 
 * Depois leia N pares de números 
 * e mostre a divisão do primeiro pelo segundo. 
 * Se o denominador for igual a zero, 
 * mostrar a mensagem "divisao impossivel". 
 */

package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicioFor04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double n1,n2,d = 0;
		
		
		for(int i=0;i<n;i++) {
			n1=sc.nextInt();
			n2=sc.nextInt();
						
			if(n2 == 0 ) {
				System.out.println("Impossivel a divisão");
				
			}else {
				d = (double) n1 / n2;
				System.out.printf("%.1f%n", d);
			}			
			
			
		}
		
		sc.close();

	}

}

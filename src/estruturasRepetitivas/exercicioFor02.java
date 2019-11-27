/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

package estruturasRepetitivas;

import java.util.Scanner;

public class exercicioFor02 {

	public static void main(String[] args) {
	
	 Scanner sc = new Scanner (System.in);
	 
	 int n = sc.nextInt();
	 int v = 0;
	 int in=0;
	 int out=0;
	 
	 for(int x=0;x<n; x++) {
		 
		 v = sc.nextInt();
		 if(v>=10 && v<=20) {
			 in=in+1;
		 }else {
			 out++;
			}
		 
	 }
	 
	 System.out.println(in+" in");
	 System.out.println(out+" out");
	 
	 sc.close();
		

	}

}

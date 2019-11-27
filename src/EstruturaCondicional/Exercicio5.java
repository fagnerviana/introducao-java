//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto");
		int codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade do produto");
		int qtd = sc.nextInt();
		
		double valor=0;
		if(codigo==1 ) {
			valor=qtd*4.0;
						
		}else if(codigo==2){
			 valor=qtd*4.50;
		
		}else if(codigo==3) {
			valor=qtd*5.0;
			
		}else if(codigo==4) {
			valor=qtd*1.50;
		}
		 System.out.printf("Conta a Pagar R$ %.2f%n", valor);
		sc.close();
	}

}

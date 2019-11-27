/*Calcular a multa: Leia a velocidade de um carro e a velocidade máxima para a rua:
1. Informe 50 reais se estiver até 10km/h acima; 
2. Informe 100 reais se estiver entre 11km/h e 30km/h
acima;
3. Informe 300 reais se estiver acima de 31km/h acima;

*/

package estruturasRepetitivas;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Qual a velocidade ?");
		int v=sc.nextInt();
		
		if(v<=10) {
			System.out.println("A multa sera de R$ 50,00");
		}else if(v>=11 && v<=30) {
			System.out.println("A multa sera de R$ 100,00");
		}else if(v>=31){
			System.out.println("A multa sera de R$ 300,00");
		}else {
			System.out.println("Nenhuma multa a ser aplicada");
		}
				
		sc.close();
		
	}

}

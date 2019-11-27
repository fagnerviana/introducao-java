//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double inicio = sc.nextDouble();
		double fim = sc.nextDouble();
		double duracao;
		
		if(inicio<fim) {
			
			duracao = fim-inicio;
						
		}else {
			duracao = 24 - inicio+fim;
			
		}
		
		System.out.println("O jogo Durou " + duracao +"Hora(s)");
		
		
		sc.close();
		
	}

}

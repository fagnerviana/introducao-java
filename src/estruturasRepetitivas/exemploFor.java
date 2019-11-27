package estruturasRepetitivas;

import java.util.Scanner;

public class exemploFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int cont=sc.nextInt();
		int soma=0;
		for(int i=0; i<cont; i++) {
			int x=sc.nextInt();
			soma=soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}

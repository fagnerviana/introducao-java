/* Ler 3 n�meros fracion�rios do teclado e informar se o primeiro � maior do que a soma
dos dois �ltimos;
*/
package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		
		int n=0;
		int n2=0;
		int n3=0;
		System.out.println("Digigite o primeiro numero ");
		n=sc.nextInt();
		System.out.println("Digite o segundo numero ");
		n2=sc.nextInt();
		System.out.println("Digite o terceiro numero ");
		n3=sc.nextInt();
		int soma= n3 + n2;
		
		if(n>soma) {
			System.out.println("O primeiro numero � maior que os 2 ultimos digitados");
			
		}else {
			
			System.out.println("N�o � maior");
			
		}
		
		
		
		/*for(int i=0; i<3;i++) {
			
			System.out.println("Digite o numero");
			n = sc.nextInt();
			soma =soma +n;
						
		}
		*/
		
		
		
		//System.out.printf("o total de tudo � : %d",+soma);
				
		sc.close();

	}

}

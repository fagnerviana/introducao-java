package comportamentoMemoria;

import java.util.Locale;
import java.util.Scanner;

import enteties.AluguelQuarto;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AluguelQuarto [] vect = new AluguelQuarto[9];
		String nome = null;
		String email=null;
		int room;
		System.out.println("Quantos estudantes tem ?");
		int n = sc.nextInt();
		
		for(int i =1; i<n; i++) {
			System.out.println("Rent #"+i);
			System.out.println("Nome: ");
			sc.nextLine();
			nome=sc.nextLine();
			System.out.println("Email: ");
			email=sc.nextLine();
			System.out.println("Room: ");
			room=sc.nextInt();
			vect[room] = new AluguelQuarto(nome,email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
				
		sc.close();

	}

}

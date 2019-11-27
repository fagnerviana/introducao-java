package EstruturaCondicional;

import java.util.Scanner;

public class HorasDia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("Que horas são?");
		horas=sc.nextInt();
		
		if(horas < 12) {
		System.out.println("Bom dia! ");
		}
		else{
			if(horas <18) {
		System.out.println("Boa Tarde!");
			}
			else{
				System.out.println("Boa Noite!");
				
				
			}
		
		}
		
		
		sc.close();

	}

}

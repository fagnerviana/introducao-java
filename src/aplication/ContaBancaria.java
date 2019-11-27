package aplication;

import java.util.Locale;
import java.util.Scanner;
import enteties.ContaBanco;


public class ContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		ContaBanco cliente;
		double iniciarDeposito = 0;
		
		System.out.println("Enter account number:");
		int numeroConta = sc.nextInt();
		System.out.println("Enter account holder:");
		String nome = sc.next();
		
		System.out.println("Is there na initial deposito (y/n)?");
		String opcao=sc.next();
		if(opcao.equals("y") || opcao.equals("Y")){
			
			System.out.println("Enter a Deposito Value");
			iniciarDeposito = sc.nextDouble();
			
			cliente=new ContaBanco(numeroConta,nome,iniciarDeposito);
			
		}else {
			cliente = new ContaBanco(numeroConta,nome);
		    System.out.print(cliente);
					
		}
		
		//cliente = new ContaBanco(numeroConta,nome,iniciarDeposito);
		System.out.println();		
		System.out.println("Enter Withdraw value ?");
		double saque = sc.nextDouble();
		cliente.saque(saque);
		
		System.out.print(cliente);
		
		System.out.println("Depositar");
		double deposito=sc.nextDouble();
		cliente.deposito(deposito);
		System.out.print(cliente);
		
		
		
		
		sc.close();

	}


}

package comportamentoMemoria;

import java.util.Locale;
import java.util.Scanner;

import enteties.FuncionarioList;

public class ListaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		FuncionarioList funcionario;
		System.out.println("How many employees will be registered? ");
		int n=sc.nextInt();
		
		
		
		for(int i=1; i<=n; i++) {
			System.out.println("Emplyoee #"+i);
			
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.println("Name: ");			
			String nome=sc.nextLine();
			System.out.println("Salary: ");
			double salario = sc.nextDouble();
			
			funcionario = new FuncionarioList(id, nome, salario);
			
		}
		
		sc.close();
			
			
		

	}

}

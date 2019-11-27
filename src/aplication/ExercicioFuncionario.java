/*
 * Ler dados de um funcionario (nome, salario, imposto).
 * E em seguida , mostrar os dados dos funcionario (nome e salario liquido).
 * Em seguida aumentar , o salario do funcionario com base em uma porcentagem dada(somente o salario bruto é afetado pela portcentagem ).
 * E mostrar novamente  os dados do funcionario */

package aplication;

import java.util.Locale;
import java.util.Scanner;

import enteties.Funcionario;

public class ExercicioFuncionario {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Funcionario x = new Funcionario();
	
	System.out.println("Name?");
	x.nome=sc.next();
	System.out.println("Gross Salary");
	x.grossSalary=sc.nextDouble();
	System.out.println("Tax");
	x.tax=sc.nextDouble();
	
	//Impremi na tela os dados do funcionario : nome e salario
	System.out.println(x.nome);	
	//System.out.print(x.grossSalary);
	System.out.println();
	System.out.println(x.netSalary());
	
	//Solicita o valor do aumento , salario
	System.out.println("Qual o valor de aumento do salario ?");
	double percentage=sc.nextDouble();
	x.increaseSalary(percentage);
	System.out.println();
	System.out.println(x);
	
		
	sc.close();

	}

}

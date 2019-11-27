package aplication;

import java.util.Locale;
import java.util.Scanner;

import enteties.Aluno;

public class ExercicioAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();		
		System.out.println("Qual o nome do aluno");
		aluno.nome=sc.next();
		System.out.println("A primeira nota");
		aluno.nota1=sc.nextDouble();
		System.out.println("A segunda nota");
		aluno.nota2=sc.nextDouble();
		System.out.println("A terceira nota");
		aluno.nota3=sc.nextDouble();
		
		System.out.printf(aluno.resultFinal());
		
		
		sc.close();

	}

}

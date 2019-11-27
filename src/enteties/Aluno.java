package enteties;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double resultado;
	public double media;
	
	public double calcularNotas() {
			resultado = nota1+nota2+nota3;
			return resultado;
	}
	
	public String resultFinal() {
		double resta = media-resultado;
		if(resultado < media) {
			System.out.println("Final Grade" + resultado);
			System.out.println("Failed");
			System.out.printf("Missing %.2f",+ resta );
			
		} else {
			System.out.println("Final Grade" + resultado);
			System.out.println("Passed");
		}
		return resultFinal();
		
	}
	
	public String toString() {
		return nome;
		
		
	}

}

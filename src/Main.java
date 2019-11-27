import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//localição US, para utilização formato de numero com PONTO '.'
		Locale.setDefault(Locale.US);

    //cria um objeto do tipo Scanner , sc
	Scanner sc = new Scanner(System.in);
	
	//cria uma variavel largura tipo double e guarda dentro de sc
	double largura = sc.nextDouble();
	double comprimento = sc.nextDouble();
	double metroQuadrado = sc.nextDouble();
	
	double area = largura * comprimento;
	double preco = area * metroQuadrado;
	
	System.out.printf("Area = %.2f%n ", area);
	System.out.printf("Preço = %.2f%n ", preco);
	
	
	sc.close();

	}

}

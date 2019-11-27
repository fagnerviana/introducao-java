package comportamentoMemoria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Amelia");
		list.add("Adelia");
		list.add("Bob");
		list.add("Bruno");
		list.add("Catia");
		list.add("Doinha");
		list.add("Maria");
		
		//adiciona item na lista na possição desejada
		list.add(2, "Fagner");
	    
		//o tamanho da lista
		System.out.println(list.size());
		
		//percorre a lista e imprime os valores
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("-Remove inicio letra M-");
		//remove o item da lista pela letra
		list.removeIf(x -> x.charAt(0)=='M');
		for(String x:list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		System.out.println("Index of Adelia "+ list.indexOf("Adelia" ));
		System.out.println("Index of Bruno "+ list.indexOf("Bruno" ));
		System.out.println("----------------------");
		//Lista somente com inicia da letra 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x: result) {
		System.out.println(x);
		}
		
		System.out.println("----------------------");
		String name = list.stream().filter(x -> x.charAt(0) =='A').findFirst().orElse(null);
		System.out.println(name);

	}

}

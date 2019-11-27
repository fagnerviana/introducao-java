package funcoesString;

public class TesteString {

	public static void main(String[] args) {
		String original = "abcd FGH Ijlm nOPQ    ";
		
		String s1= original.toLowerCase();
		String s2=original.toUpperCase();
		String s3=original.trim();
		String s4=original.substring(2);
		String s5=original.substring(2,9);
		String s6=original.replace('a', 'X');
		String s7=original.replace("abcd", "xyzz");
		
		
		System.out.println("Original: -"+ original + "-");
		System.out.println("toLowerCase: -"+ s1 + "-");
		System.out.println("toUpperCase: -"+ s2 + "-");
		System.out.println("trim: -"+ s3 + "-");
		System.out.println("subsTring(2): -"+ s4 + "-");
		System.out.println("subsTring(2,9): -"+ s5 + "-");
		System.out.println("replace: 'a', por 'x'-"+ s6 + "-");
		System.out.println("replace: 'abcd', por 'xyzz'-"+ s7 + "-");

	}

}

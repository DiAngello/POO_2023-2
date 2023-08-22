package src;

import java.util.Locale;
import java.util.Scanner;

public class aula22082 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String frase1, frase2, frase3;
		int idade;
		
		System.out.println("Digite a idade:");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite as 3 frases:");
		frase1 = sc.nextLine();
		frase2 = sc.nextLine();
		frase3 = sc.nextLine();
		
		System.out.println("Registros:");
		System.out.println("Idade:" + idade);
		System.out.println("Frase 1:" + frase1);
		System.out.println("Frase 2:" + frase2);
		System.out.println("Frase 3:" + frase3);
		
		sc.close();

	}

}

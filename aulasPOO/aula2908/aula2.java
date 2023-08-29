package aula2908;

import java.util.Scanner;

public class aula2 {
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor do produto: ");
			double valor = sc.nextDouble();
			
			System.out.println("Produto"+ valor);
			
			System.out.println("Qual o valor do imposto?");
			valor += sc.nextDouble();
			

			System.out.println("Produto"+ valor);
			
			sc.close();
			}
	}


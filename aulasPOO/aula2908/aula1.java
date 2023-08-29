package aula2908;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Informe a hora de 01h a 24h: ");
		hora = sc.nextInt();
		
		if ((hora >= 0) && (hora < 12)) {
			System.out.println("Bom dia!");
		} else {
			if ((hora >= 12) && (hora <= 17)) {
				System.out.println("Boa tarde!");
			}else {
				if((hora >= 18) && (hora <=24)) {
					System.out.println("Boa noite!");
				}else {
					System.out.println("Valor invalido.");
				}
			}
		}
		sc.close();
	}

}
